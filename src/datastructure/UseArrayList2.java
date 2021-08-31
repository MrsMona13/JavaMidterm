package datastructure;

import java.util.ArrayList;
import java.util.Arrays;

public class UseArrayList2
{
    public static void main(String[] args)
    {
        ArrayList<String> shoes = new ArrayList<>(Arrays.asList("Louboutin", "Gucci", "Fendi", "Balenciaga"));

        System.out.println(shoes);

        shoes.removeIf( name -> name.equals("Balenciaga"));

        System.out.println(shoes);
    }
}
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */




