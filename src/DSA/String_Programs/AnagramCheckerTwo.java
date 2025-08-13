package DSA.String_Programs;

import java.util.Arrays;

public class AnagramCheckerTwo {
    public static void main(String[] args) {

        String str1 = "Silent";
        String str2 = "Listen";

        String str1ToLowerCase = str1.toLowerCase();
        String str2ToLowerCase = str2.toLowerCase();

        char[] arr1 = str1ToLowerCase.toCharArray();
        char[] arr2 = str2ToLowerCase.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)){
            System.out.println("Its an Anagram!");
            return;
        }

        System.out.println("Not an Anagram");

    }
}
