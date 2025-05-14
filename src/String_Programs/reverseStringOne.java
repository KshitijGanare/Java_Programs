package String_Programs;

import java.util.Scanner;

public class reverseStringOne {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 1st Method to reverse a String [ Using charAt and array ]
        System.out.println("Enter the String you want to reverse:");
        String normalString = scan.nextLine();

//      char[] reverseStringArr = new char[20];
//      reverseStringArr = normalString.toCharArray();

//      1. BY USING WHILE LOOP
//        int i = reverseStringArr.length-1;
//        while(i>=0){
//            System.out.print(reverseStringArr[i]);
//            i--;
//        }


//        // 2. BY USING FOR EACH LOOP
//        for (int i = reverseStringArr.length-1; i >= 0 ; i--) {
//            System.out.print(reverseStringArr[i]);
//        }
//

        // 3.1 Using StringBuffer
//        StringBuffer reverseString = new StringBuffer(normalString); // normalString converted to StringBuffer
//
//        System.out.println("Reversed String is:");
//        System.out.println(reverseString.reverse());

        // 3.2 Using StringBuffer into String
        String reverseString = new StringBuffer(normalString).reverse().toString();
        System.out.println(reverseString);

    }
}
