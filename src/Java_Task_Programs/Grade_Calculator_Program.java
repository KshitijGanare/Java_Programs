package Java_Task_Programs;

import java.util.Scanner;

public class Grade_Calculator_Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score: ");


        if (!scan.hasNextInt())
        {
            System.out.println("Please enter a valid Input");
        } else {
            int score = scan.nextInt();

            if (score >= 90 && score <= 100) {
                System.out.println("You have got Grade A");
            } else if (score >= 80 && score <= 89) {
                System.out.println("You have got Grade B");
            } else if (score >= 70 && score <= 79) {
                System.out.println("You have got Grade C");
            } else if (score >= 60 && score <= 69) {
                System.out.println("You have got Grade D");
            } else if (score >= 0 && score <= 59) {
                System.out.println("You are Failed! ");
            } else {
                System.out.println("Invalid Integer Type!!!");
            }
        }
    }
}
