package DSA.Array_Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Count_Occurences_Array {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'a', 'b', 'c', 'a', 'b', 'c'};
        byHashmap(arr);
        byBruteForce2Pointer(arr);
        bySinglePointer(arr);

    }

    public static void byHashmap(char[] arr) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : arr) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        /*
          / Map.Entry<K,V> : Yeh nested interface hai jo key-value pair ko object ki tarah treat karta hai
          - It is like a data type jisme key-value pair ka objectstore kar sakte hai

          / mapobject.entrySet() : saare key-value pairs ko ek Set of Entry objects me convert karta hai,
          jisse tum loop lagakar traverse kar sakte ho.

         */
    }

    public static void byBruteForce2Pointer(char[] arr) {
        /*
        Logic:
        1. Sort the array --> 2. match i and j characters
        if (i == j) then count++, if(i != j) then print count and move i forward
        */

        int i = 0;
        int count = 1;
        Arrays.sort(arr);

        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                i++;
                count++;
            }

            if (arr[i] != arr[j]) {
                System.out.println(arr[i] + "=" + count);
                i++;  //
                count = 1;  // Set the value as 1 again so next time value starts from 1
            }

        }

        System.out.println(arr[i] + "=" + count);  // Print last element as after last element there is no other element so it will not get i!=j and will not print count

    }


    public static void bySinglePointer(char[] arr) {

        int count = 1;
        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                count++;
            }

            if (arr[i] != arr[i - 1]) {
                System.out.println(arr[i-1] + "=" + count);
                count = 1;
            }

        }

        System.out.println(arr[arr.length - 1] + "=" + count);

        /* Last element ka comparison kisi aur element se nahi ho raha.
           Isliye loop ke baad uska count manually print karna padta hai.

         */


    }

}
