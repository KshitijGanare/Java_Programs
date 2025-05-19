package String_Programs;

import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int vowels = 0;
        int consonants = 0;

        // count vowels and consonants including duplicates

        for (int i = 0; i <= str.length()-1 ; i++) {
            String lowerCase = str.toLowerCase();
            char ch = lowerCase.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch>='a' && ch<='z') {
                consonants++;
            }

        }

        System.out.println("vowels: "+ vowels+"\n" + "consonants: " + consonants);

    }
}
