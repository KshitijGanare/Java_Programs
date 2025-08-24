package DSA.String_Programs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountUnique_Vowel_Consn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        // Count vowels and consonants without duplicates

        Set<Character> uniqueVowels = new HashSet<>();
        Set<Character> uniqueConsonants = new HashSet<>();


        for (int i = 0; i < str.length(); i++) {
            String lowerCase = str.toLowerCase();
            char charletter = lowerCase.charAt(i);


             if(charletter == 'a' || charletter == 'e' || charletter == 'i' || charletter == 'o' || charletter == 'u') {
                 uniqueVowels.add(charletter);
             } else if (charletter >= 'a' && charletter <='z') {
                 uniqueConsonants.add(charletter);
             }

        }

        System.out.println(" vowels: "+ uniqueVowels.size() + "\n" + " consonants: " + uniqueConsonants.size());


    }
}