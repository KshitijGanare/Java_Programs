package Functional_Programs;

import java.util.Scanner;

public class LeapYearChecker {
    /*
    Create a program that determines whether a given year is a leap year.
    A leap year is divisible by 4,  year%4 == 0,
    but not by 100 unless it is also divisible by 400.
    Use an if-else statement to make this determination.
     */
    public static void main(String[] args) {

        System.out.println("Leap Year Checker");
        System.out.println("Enter the year to check if it is a leap year or not:");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        if (year % 4 == 0 && year%100 != 0 || year%400 == 0){
            System.out.println("Its a leap year");
        }
        else {
            System.out.println("Not a leap year");
        }

    }
}
