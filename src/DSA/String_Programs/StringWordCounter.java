package DSA.String_Programs;

import java.util.HashMap;
import java.util.Map;

public class StringWordCounter {
    public static void main(String[] args) {

        occurenceByBruteForce("automation");
        byMap("automation");
        byASCIIArray("automation");

    }


    public static void occurenceByBruteForce(String str){
        int count;
        boolean hasAppeared;

        for (int i=0; i<str.length(); i++){
            count = 1;
            hasAppeared = false;

            for (int k = 0; k < i; k++) {
                if (str.charAt(i) == str.charAt(k)){
                    hasAppeared = true;
                    break;
                }

            }

            if(!hasAppeared) {
                for (int j = i+1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }

                System.out.println(str.charAt(i) + "->" + count);
            }

        }

    }


    public static void byMap(String word) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i <= word.length() - 1; i++) {

            char ch = word.charAt(i);

            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch,1);
            }

        }

        for (Map.Entry<Character, Integer> mp : map.entrySet()) {
            System.out.println(mp.getKey() + "--->" + mp.getValue());

        }

    }



    public static void byASCIIArray(String word){

        int[] arr = new int[256];

        for (int i = 0; i < word.length(); i++) {
            arr[word.charAt(i)]++;       // char --> integer automatic conversion by java

        }

        for (int i = 0; i < 256; i++) {

            if (arr[i] >= 1) {
                System.out.println((char)(i) + " --> " + arr[i]);  // int --> char explicit conversion

            }

        }

    }

}









