package DSA.Array_Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicate_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,3};

        hashSetMethod(arr);
        linkedHashSetMethod(arr);
        byBruteForceMethod(arr);
        inPlaceSortAndCompare(arr);

    }

    public static void hashSetMethod(int[] arr){

        Set<Integer> uniqueArrayElements = new HashSet<>();
        for (int element : arr){
            uniqueArrayElements.add(element);
        }
        System.out.println(uniqueArrayElements);

        /*
         Logic:
         1. Hashset me unique elements hi store hote hai
         2. Store all elements using for loop, only unique will get stored
         3. Print hashset variable at the end

         Pros:
         1. No change in order of original array
         Complexity  Time = O(n) Space = O(n)

         Cons:
         - Insertion order not remain in hashset

         */
    }

    public static void linkedHashSetMethod(int[] arr) {

        Set<Integer> uniqueArrayElements = new LinkedHashSet<>();
        for (int element : arr) {
            uniqueArrayElements.add(element);
        }
        System.out.println(uniqueArrayElements);

        // Same logic just insertion order preserved
    }

    public static void byBruteForceMethod(int[] arr){  // Brute force + Sort

        Arrays.sort(arr);  // Sorted array first

        for (int i = 0; i < arr.length; i++) {
            boolean appeared = false; // appeared variable banaya — default false hai Yeh flag batayega ki arr[i] pehle aaya hai ya nahi
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    appeared = true;
                    break;
                }
            }

            if (!appeared) {
                System.out.print(arr[i]);
            }

        }
    /*
        Brute Force Approach (Nested Loops):
        1. Array ko sort karte hain taaki duplicates side-by-side ho
        2. Har element ke pehle wale elements check karte hain agar i 3rd no pe hai toh j 0,1,2 me check karega ki yeh tha ki nahi
        3. Agar already appeared ho toh skip, else print
         Time = O(n²), Space = O(1)

    */

    }

    public static void inPlaceSortAndCompare(int[] arr){            // Sort and Compare

        Arrays.sort(arr);

        int i = 0;
        for (int j = i+1; j < arr.length; j++) {
            if (arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }

        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k]);
        }


    }


}
