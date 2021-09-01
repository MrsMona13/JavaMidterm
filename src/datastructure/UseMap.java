package datastructure;

import java.util.*;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        Map<String, Integer> items = new HashMap<>();
        items.put("shoes", 3);
        items.put("clothing", 2);
        items.put("accessories", 1);

        Iterator<Map.Entry<String, Integer>> it = items.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> pair = (Map.Entry<String, Integer>) ((Iterator<?>) it).next();

            System.out.format("items: %s, quantity: %d%n", pair.getKey(),
                    pair.getValue());
        }
    }
}

