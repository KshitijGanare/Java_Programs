package Functional_Programs;

import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {

        System.out.println("Program to check Anagram!");

        String firstVar = "SILENT";
        String secondVar = "liSten";

        String lowerOne = firstVar.toLowerCase();
        String lowerTwo = secondVar.toLowerCase();


        char[] firstArray = lowerOne.toCharArray();
        char[] secondArray = lowerTwo.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        System.out.println(Arrays.equals(firstArray, secondArray));


    }
}
