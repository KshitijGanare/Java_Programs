package DSA.String_Programs;

import java.util.Scanner;

public class CountUnique_Vowel_Consn2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();


        // String: "Flowers are Beautiful", Count unique vowels and consonants in this

        String uniqueVowels = "";
        String uniqueConsonants = "";

        String lowerCase = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char ch = lowerCase.charAt(i);

            if(ch >= 'a' && ch<= 'z'){
                if ("aeiou".indexOf(ch) != -1){   // Checks if char equals aeiou
                    if (uniqueVowels.indexOf(ch) == -1){  // Checks if character present in unique vowel
                        uniqueVowels += ch; // Added vowels here
                    }
                } else if ("aeiou".indexOf(ch) == -1) {
                    if (uniqueConsonants.indexOf(ch) == -1){
                        uniqueConsonants += ch;
                    }
                }
            }else {
                System.out.println("Invalid Character!");
            }

        }

        System.out.println("Unique Vowels: " + uniqueVowels.length());
        System.out.println("Unique Consonants: " + uniqueConsonants.length());


    }
}
