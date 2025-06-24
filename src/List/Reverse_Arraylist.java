package List;

import java.util.*;

public class Reverse_Arraylist {

    static Reverse_Arraylist ra = new Reverse_Arraylist();
    public static void main(String[] args) {
        ra.reverse();
    }


    public void reverse(){
        List<String> arrayList = new ArrayList<>(Arrays.asList("1","2"));
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1,2,3,4,5,6));

        // Reverse of list
        Collections.reverse(arrayList);
        Collections.reverse(linkedList);

        System.out.println(arrayList);
        System.out.println(linkedList);

    }

}
