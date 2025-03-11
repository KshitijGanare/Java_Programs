package Java_Task_Programs;

import java.util.Scanner;

public class reverseNumberOne {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        String reverse = number + "";

        char[] arr = new char[20];
        arr = reverse.toCharArray();

        for (int i = arr.length-1 ; i >= 0 ; i--) {
            System.out.print(arr[i]+ " ");
        }


    }
}
