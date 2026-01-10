package collection_Framework.List;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterateList {

    static List<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

    public static void main(String[] args) {
         usingIterator();
//       usingForEach();
//       usingLoop();
    }

    public static void usingIterator(){
        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()){

            Integer num = itr.next();
            if (num.equals(8)){
                itr.remove();
            }

            System.out.println(itr);

        }

    }


    public static void usingForEach(){

        for(int element: list){
            System.out.print(element);
        }
        System.out.println("\n");

    }

    public static void usingLoop(){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }

}


