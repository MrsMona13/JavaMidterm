package databases;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class ConnectToSqlDB {

    public static Connection connect = null;
    public static Statement statement = null;
    public static PreparedStatement ps = null;
    public static ResultSet resultSet = null;

    public static Properties loadProperties() throws IOException {
        Properties prop = new Properties();
        InputStream ism = new FileInputStream("src/secret.properties");
        prop.load(ism);
        ism.close();
        return prop;
    }

    public static Connection connectToSqlDatabase() throws IOException, SQLException, ClassNotFoundException {
        Properties prop = loadProperties();
        String driverClass = prop.getProperty("MYSQLDB.driver");
        String url = prop.getProperty("MYSQLDB.url");
        String userName = prop.getProperty("MYSQLDB.userName");
        String password = prop.getProperty("MYSQLDB.password");
        Class.forName(driverClass);
        connect = DriverManager.getConnection(url, userName, password);
        System.out.println("Database is connected");
        return connect;
    }

    public static List<User> readUserProfileFromSqlTable(){
        List<User> list = new ArrayList<>();
        User user;
        try {
            Connection conn = connectToSqlDatabase();
            String query = "SELECT * FROM Students";
            // create the java statement
            Statement st = conn.createStatement();
            // execute the query, and get a java results
            ResultSet rs = st.executeQuery(query);
            // iterate through the java results
            while (rs.next()) {
                String name = rs.getString("stName");
                String id = rs.getString("stID");
                String dob = rs.getString("stDOB");
                //System.out.format("%s, %s\n", name, id);
                user = new User(name, id, dob);
                list.add(user);

            }
            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return list;
    }

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        List<User> list = readUserProfileFromSqlTable();
        for (User user : list) {
            System.out.println(user.getStName() + " " + user.getStID() + " " + user.getStDOB());
        }
    }

    public List<String> readDataBase(String tableName, String columnName) throws Exception {
        List<String> data;

        try {
            connectToSqlDatabase();
            statement = connect.createStatement();
            resultSet = statement.executeQuery("select * from " + tableName);
            data = getResultSetData(columnName);
        } finally {
            close();
        }
        return data;
    }

    private void close() throws Exception {
        if (resultSet != null) {
            resultSet.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (connect != null) {
            connect.close();
        }
    }

    private List<String> getResultSetData(String columnName) throws SQLException {
        List<String> dataList = new ArrayList<>();
        while (resultSet.next()) {
            String itemName = resultSet.getString(columnName);
            dataList.add(itemName);
        }
        return dataList;
    }

    public void insertDataFromArrayToSqlTable(String ArrayData, int[] tableName, String columnName) {
        try {
            connectToSqlDatabase();
            ps = connect.prepareStatement("DROP TABLE IF EXISTS `" + Arrays.toString(tableName) + "`;");
            ps.executeUpdate();
            ps = connect.prepareStatement(
                    "CREATE TABLE `" + Arrays.toString(tableName) + "` (`ID` int(11) NOT NULL AUTO_INCREMENT,`SortingNumbers` bigint(20) DEFAULT NULL,  PRIMARY KEY (`ID`) );");
            ps.executeUpdate();
            for (int n = 0; n < ArrayData.length(); n++) {
                ps = connect.prepareStatement("INSERT INTO " + Arrays.toString(tableName) + " ( " + columnName + " ) VALUES(?)");
                ps.executeUpdate();
            }

        } catch (IOException | SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
