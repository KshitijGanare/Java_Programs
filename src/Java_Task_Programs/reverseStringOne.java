package Java_Task_Programs;

import java.util.Scanner;

public class reverseStringOne {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name = scan.next();  // 0-6

        char[] arr = new char[20];

        arr = name.toCharArray();

        for (int i = arr.length-1 ; i >= 0 ; i--) {
            System.out.print(arr[i]);
        }

    }
}
