package Functional_Programs;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        
        /*
        Write a program that classifies a triangle based on its side lengths. 
        Given three input values representing the lengths of the sides, 
        determine if the triangle is equilateral (all sides are equal), 
        isosceles (exactly two sides are equal), or one == two &&  
        scalene (no sides are equal). 
        Use an if-else statement to classify the triangle.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the lengths of the three sides of the triangle:");
        float sideOne = scan.nextFloat();
        float sideTwo = scan.nextFloat();
        float sideThree = scan.nextFloat();


        System.out.println(triangleChecker(sideOne, sideTwo, sideThree));
    }

    static String triangleChecker(float one, float  two, float three){
        if (one <= 0 || two <= 0 || three <= 0) {
            return "Invalid Inputs";
        }
        if(one == two && two == three){
            return "Equilateral triangle";
        } else if (one == two || two == three || one == three) {
            return "Isosceles triangle";
        } else if (one != two && two != three && one != three) {
            return "Scalene triangle";
        } else {
            return "Not a triangle";
        }
    }
}








