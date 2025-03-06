package Java_Task_Programs;

import java.util.Scanner;

public class LargOfThree_Ternary_Prog {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First number");
        int numberOne = scan.nextInt();
        System.out.println("Enter the Second number");
        int numberTwo = scan.nextInt();
        System.out.println("Enter the Third number");
        int numberThree = scan.nextInt();


        int result = (numberOne>=numberTwo) ? ((numberOne > numberThree) ? numberOne : numberThree) :
                ((numberTwo > numberThree) ? numberTwo: numberThree);

        System.out.println(result);

    }

}
