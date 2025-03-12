package Java_Task_Programs;

import java.util.Scanner;

public class reverseStringTwo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter palindrome String: ");
        String name = scan.next();

        String reversed = new StringBuffer(name).reverse().toString();

        System.out.println(reversed);

    }
}
