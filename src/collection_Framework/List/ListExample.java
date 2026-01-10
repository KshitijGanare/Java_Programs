package collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<Integer> marks = new ArrayList<>();

        marks.add(10);
        marks.add(20);
        marks.add(30);
        marks.add(40);


        marks.remove(0);


        System.out.println(marks);


    }

}
