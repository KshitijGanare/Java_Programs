package Java_Task_Programs;

import java.util.Scanner;

public class reverseIntegerThree {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Integer to print reverse: ");
        int number = scan.nextInt();

        // Converting Integer to String
        String reverse = String.valueOf(number);
        char[] rev = new char[20];
        rev = reverse.toCharArray();

        for (int i = rev.length-1 ; i >= 0 ; i--) {
            System.out.print(rev[i]);
        }

        scan.close();
    }
}
