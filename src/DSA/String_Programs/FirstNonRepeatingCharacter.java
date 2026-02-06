package DSA.String_Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        fnrcByBruteForce("automation");

        fnrcBy2Pointer("automation");

        fnrcByMap("automation");

    }


    public static void fnrcByBruteForce(String word) {

        boolean isUnique;

        for (int i = 0; i < word.length(); i++) {

            isUnique = true;

            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    isUnique = false;
                    break;

                }

            }

            if (isUnique) {
                System.out.println("First Non Repeating Character: " + word.charAt(i));
                break;
            }

        }

    }

    public static void fnrcBy2Pointer(String word) {
        boolean isUnique;

        for (int i = 0; i < word.length(); i++) {

            isUnique = true;

            for (int j = word.length() - 1; j > i; j--) {

                if (word.charAt(i) == word.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.println("First Non Repeating Character: " + word.charAt(i));
                break;
            }
        }

    }

    public static void fnrcByMap(String word) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < word.length(); i++) {

            if (map.containsKey(word.charAt(i))) {
                map.put(word.charAt(i), map.get(word.charAt(i)) + 1);
            } else {
                map.put(word.charAt(i), 1);
            }

        }

        for (Map.Entry<Character, Integer> e : map.entrySet()){
            if (e.getValue() == 1){
                System.out.println("First Non Repeating value: " + e.getKey());
                break;
            }

        }

    }

}
