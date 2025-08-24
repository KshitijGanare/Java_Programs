package List;

import java.util.*;

public class Reverse_Arraylist {

    static Reverse_Arraylist ra = new Reverse_Arraylist();
    public static void main(String[] args) {
//        ra.reverseByFunction();
        ra.reverseManual();
    }


    public void reverseByFunction(){
        List<String> arrayList = new ArrayList<>(Arrays.asList("1","2"));
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1,2,3,4,5,6));

        // Reverse of list
        Collections.reverse(arrayList);
        Collections.reverse(linkedList);

        System.out.println(arrayList);
        System.out.println(linkedList);

    }

    public void reverseManual(){
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10,20,30,40,50,60));

        int size = list.size();

        for (int i = 0; i < size / 2 ; i++) {
              int temp = list.get(i);
              list.set(i, list.get(size - i - 1));
              list.set((size - i - 1), temp);

        }

        System.out.println("Reversed List: " + list);
    }

}
