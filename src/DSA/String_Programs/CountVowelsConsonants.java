package DSA.String_Programs;

import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        byIndexOf(str);
        byContains(str);

    }

    public static void byIndexOf(String str) {
        char[] ch = str.toCharArray();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < ch.length; i++) {
            if ("aeiou".indexOf(ch[i]) != -1) {
                vowels++;
            } else {
                consonants++;
            }

        }
        System.out.println("Vowels:" + vowels);
        System.out.println("Consonants:" + consonants);

    }

    public static void byContains(String str) {
        char[] ch = str.toCharArray();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < ch.length; i++) {
            if ("aeiou".contains(String.valueOf(ch[i]))) {
                vowels++;
            } else {
                consonants++;
            }

        }
        System.out.println("Vowels:" + vowels);
        System.out.println("Consonants:" + consonants);


    }
}
