package Functional_Programs;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");

        int num = scan.nextInt();

        primeCheckBruteForce(num);
        primeCheckSqrt(num);


    }


    public static void primeCheckBruteForce(int num) {

        if (num <= 1) {
            System.out.println("Not Prime");
            return;
        }

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                System.out.println("Not Prime");
                return;
            }

        }

        System.out.println("Prime Number!!!");

    }





    public static void primeCheckSqrt(int num) {

        if (num <= 1) {
            System.out.println("Not Prime");
            return;
        }

        for (int i = 2; i < Math.sqrt(num); i++) {    // Math.sqrt - returns sqrt of number ex: root 36 = 6, 29 = 5.38

            if (num % i == 0) {
                System.out.println("Not Prime");
                return;
            }

        }

        System.out.println("Prime Number!!!");

    }


}
