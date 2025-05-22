package Functional_Programs;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if(num>1 && num<=999999999) {
            for (int i = 0 ; i <= (num - 1); i++) {
                if (num % 2 != 0) {
                    System.out.println("Prime Number");
                } else {
                    System.out.println("Even number");
                }
            }
        } else{
            System.out.println("Invalid Input");
        }

    }
}
