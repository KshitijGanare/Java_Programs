package collection_Framework.List;

import java.util.List;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> stackList = new Stack<>();

        // push
        stackList.add(10);
        stackList.add(20);
        stackList.add(30);
        stackList.push(40);
        stackList.push(50);
        stackList.push(60);
        stackList.push(70);

        System.out.println(stackList);


        // peek : return topmost element in the stack
        System.out.println("Topmost element: " + stackList.peek());

//        // pop : Removes top element from stack
//        System.out.println("Removed element: " + stackList.pop());
//        System.out.println(stackList);


        // empty
        System.out.println("\nIs stack empty? : " + stackList.empty());

        // search : giving position of element (not index, for index: indexOf())
        System.out.println(stackList.search(70));


        // Printing random element using get
        System.out.println(stackList.get(1));


        for (int i = 0; i < stackList.size(); i++) {
            System.out.println(stackList.get(i));
        }

    }

}

/*
indexOf(i) vs search(o)
indexOf(o) -> returns "index", same working in stack
search(o) -> returns "position" from top, top/last element position is 1



 */

