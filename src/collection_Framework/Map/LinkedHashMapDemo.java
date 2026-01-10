package collection_Framework.Map;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();

        // adding values
        lmap.put(101, "One");
        lmap.put(102, "Two");
        lmap.put(103, "Three");
        lmap.put(104, "Four");
        lmap.put(105, "Five");

        System.out.println(lmap);

        // removing values
        lmap.remove(103);

        System.out.println(lmap);

        // printing key set
        System.out.println(lmap.keySet());
        System.out.println(lmap.values());


        // Traversal
        for (Map.Entry<Integer, String> map: lmap.entrySet()){

            // Updating last value to Ten
            if (map.getKey().equals(105)){
                System.out.println("Current value:" + map.getValue());
                System.out.println("Updated value:" + map.setValue("Ten"));

            }

        }

        System.out.println(lmap);


    }
}
