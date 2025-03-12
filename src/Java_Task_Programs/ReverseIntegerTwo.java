package Java_Task_Programs;

import java.util.Scanner;

public class ReverseIntegerTwo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Integer to print reverse: ");
        int number = scan.nextInt();

        // Converting Integer to String
        String reverse = Integer.toString(number);
        String rev = new StringBuffer(reverse).reverse().toString();
        System.out.println(rev);

        scan.close();

    }
}
