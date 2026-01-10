package collection_Framework.Map;
import java.util.HashMap;
import java.util.Map;


public class HashMapDemo {
    public static void main(String[] args) {

        Map<Integer, String> mapDemo = new HashMap();

        // adding values
        mapDemo.put(101, "One");
        mapDemo.put(102, "Two");
        mapDemo.put(103, "Three");
        mapDemo.put(11, "Eleven");
        mapDemo.put(104, "Four");
        mapDemo.put(105, "Five");


        System.out.println(mapDemo);

        // getting the element
        System.out.println(mapDemo.get(103));

        // removing element
        mapDemo.remove(103);
        System.out.println(mapDemo);

        // containsKey
        System.out.println("Contains key 101? : " + mapDemo.containsKey(101));

        // containsValue
        System.out.println("Contains value? : " + mapDemo.containsValue("One"));

        // size
        System.out.println("Size: " + mapDemo.size());

        // check empty
        System.out.println("Is Empty? : " + mapDemo.isEmpty());

        // null
        System.out.println(mapDemo.put(112, null));
        System.out.println(mapDemo.put(null, null));

        // return all keys
        System.out.println(mapDemo.keySet());


        // return all values
        System.out.println(mapDemo.values());


        // entrySet
        System.out.println(mapDemo.entrySet());


        // Traversal
        for (Map.Entry<Integer, String> e : mapDemo.entrySet()){

            if (e.getKey() == null){     // unboxing
                continue;
            }

            if (e.getKey().equals(105)){      // autoboxing
                System.out.println();
                System.out.println("Printing value of 105: " + e.getValue());
                System.out.println("Setting value of 105: " + e.setValue("999999"));
                break;

            }

        }

        System.out.println(mapDemo);

    }

}


/*
// Traversal
1. If traversal karte time maanlo map key/value me null bhi ho, and agar mai
   null ko compare kar rha hoon Integer se then e.getKey() null ko Integer me (autoboxing)
   convert karne ka try karega jo possible nhi hai, jisse NPException ayega

// Solution:
/ alag se condition in if to check null then skip



 */