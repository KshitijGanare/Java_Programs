package DSA.String_Programs;

import java.util.HashMap;
import java.util.Map;

public class StringWordCounter {
    public static void main(String[] args) {

//       byMap("automation");
         byASCIIArray("automation");

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
            arr[word.charAt(i)]++;

        }

        for (int i = 0; i < 256; i++) {

            if (arr[i] >= 1) {
                System.out.println((char)(i) + " --> " + arr[i]);

            }

        }

    }

}

/*
// Map

-----> Gaps
   - null + 1 = null
   - map.get(ch) --> returns value of key, if key not found gives NPE
   - first will have to check if map contains key contains or not
     If map contains key, then add 1 in current value
     If not, then add 1 to the key



// ASCII Array Approach
- Characters are stored as ASCII values, so I use them directly as array indexes to count frequency.”

-----> Gaps:
   1. Mistake: freq[word.charAt(i)]++; Dont have Understanding
      Fix:
     // char  →  internally an integer (ASCII / Unicode value)

     // Java automatically converts 'a' to its ASCII value:
       freq['a']++
       freq[97]++

     // How Java conversion happens
     - In java every char is integer internally
     - Java decides on basis of context to convert integer to char or integer

       / Example:
        ->  freq['a']++;       // Array index can only be number, so character changed to integer
        ->  sout('a');         // Prints character
        ->  sout('a' + 1);     // 98



   2. Mistake: Run loop on String rather than freq
      Fix: Run loop for printing on freq not String
           Use type casting to print int to char




   3. Type Casting
     // char and int are compatible types
     use explicit casting (int) to get ASCII value and (char) to convert number back to character

| Expression | Result |
| ---------- | ------ |
| (int) 'A'  |  65    |
| (char) 66  |   B    |
| '0'        |  48    |
| (int) '9'  |  57    |





*/




