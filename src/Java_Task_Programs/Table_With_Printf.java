package Java_Task_Programs;

import java.util.Scanner;

public class Table_With_Printf {
    public static void main(String[] args) {

        // Program to print a table using printf
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an number whose table you want to print:");
        int num = scan.nextInt();

        for (int i = 0; i <= 10 ; i++) {
            System.out.printf("%d X %d = %d\n" ,num, i, num*i);
        }


    }
}
