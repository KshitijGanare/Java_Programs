package Functional_Programs;

import java.util.Scanner;

public class Table_With_Printf {
    public static void main(String[] args) {

        // Program to print a table using printf
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number:");
        float num = scan.nextFloat();

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%.2f X %d = %.2f%n" , num, i, num*i);
        }


    }

}
