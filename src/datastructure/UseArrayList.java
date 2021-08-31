package datastructure;

import java.text.MessageFormat;
import java.util.ArrayList;

public class UseArrayList {

    public static void main(String[] args) {
        ArrayList<String> shoes = new ArrayList<>();
        shoes.add("Louboutin");
        shoes.add("Gucci");
        shoes.add("Fendi");
        shoes.add("Balenciaga");
        for (String i : shoes) {
            System.out.println(i);

            System.out.println(MessageFormat.format("The most famous designer shoes are:{0}", peek()));

        }
    }

    private static Object peek() {
        return null;


    }
}
