package Functional_Programs;

import java.util.Arrays;

public class AnagramCheckerWithLoop {
    public static void main(String[] args) {

        String one = "Silent".toLowerCase();
        String two = "Listen".toLowerCase();

        /*
        1. Input = Silent , listen
        2. output = Anagram, Not an Anagram
        3. if else to compare firstVar with secondVar
        4. for loop to iterate through first and second variable
        5.
        char[] firstArray = firstVar.toCharArray();
        char[] secondArray = secondVar.toCharArray();

        Arrays.sort(firstArray)
        Arrays.sort(secondArray)

        7. If all characters same then anagram else not anagram

        */

        char[] chOne = one.toCharArray();
        char[] chTwo = two.toCharArray();


        if(chOne.length != chTwo.length){
            System.out.println("Not an Anagram!");
        }

        Arrays.sort(chOne);
        Arrays.sort(chTwo);

        for (int i = 0; i < chOne.length; i++) {
                if(chOne[i] != chTwo[i]){
                    System.out.println("Not an Anagram!");
                    return;
                }
            }
        System.out.println("Anagram");
    }
}
