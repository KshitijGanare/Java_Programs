package DSA.String_Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountWordsInString {
    public static void main(String[] args) {

        String str = "India is the Best";
        byFunction(str);
        byBruteForce(str);


    }


    public static void byFunction(String word) {
        String[] strArray = word.trim().split("\\s+");
        System.out.println(strArray.length);


    }

    public static void byBruteForce(String word) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            // logic : Instead of counting spaces, count word starts.
            if (word.charAt(i) != ' ' && (i == 0 || word.charAt(i-1) == ' ')){
                count++;
            }

        }

        System.out.println(count);

    }

}