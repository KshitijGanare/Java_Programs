package DSA.String_Programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString {
    public static void main(String[] args) {

        String str = "banana";

        byBruteForce(str);
        System.out.println();
        bySet(str);
        System.out.println();
        byAscii(str);

    }


    public static void byBruteForce(String word) {
        boolean isUnique;

        for (int i = 0; i < word.length(); i++) {

            isUnique = true;

            for (int j = 0; j < i; j++) {

                if (word.charAt(i) == word.charAt(j)){
                    isUnique = false;
                    break;
                }

            }

            if(isUnique){
                System.out.print(word.charAt(i));
            }

        }

    }


    public static void bySet(String str) {
        Set<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        System.out.println(set);

    }

    public static void byAscii(String str){

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;

        }


        for (int i = 0; i < str.length(); i++) {

            if (freq[str.charAt(i)] > 0){
                System.out.print(str.charAt(i));
                freq[str.charAt(i)] = 0;
            }

        }


    }


}