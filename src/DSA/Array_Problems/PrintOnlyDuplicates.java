package DSA.Array_Problems;

import java.util.*;

public class PrintOnlyDuplicates {
    public static void main(String[] args) {
       int[] arr = {1,2,1,2,3,3,4};
        bySinglePointer(arr);

       System.out.println("\n\n");
        byHashSet(arr); // Most preferred

       System.out.println("\n\n");
        byHashMap(arr);

       System.out.println("\n\n");
        findDuplicateByAscii(arr);

    }


    public static void bySinglePointer(int[] arr){
        Arrays.sort(arr);
        int lastPrinted = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1] && arr[i] != lastPrinted){
                System.out.print(arr[i] + " ");
                lastPrinted = arr[i];  // Mark as printed
            }
        }

        System.out.println("\n\n");

    }



    public static void findDuplicateByAscii(int[] arr) {

        int[] freq = new int[256];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        for (int j = 0; j < arr.length; j++) {
            if (freq[arr[j]] > 1){
                System.out.println(arr[j] +"-->" + freq[arr[j]]);
                freq[arr[j]] = 0;
            }

        }

    }


    public static void byHashMap(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }else {
                map.put(arr[i],1);
            }

        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" = "+ entry.getValue());
            }
        }

    }

    public static void byHashSet(int[] arr) {
        Set<Integer> seen = new HashSet();
        Set<Integer> duplicates = new HashSet();

        for (int num: arr){
            if(!seen.add(num)){        // set.add() returns true if adding element 1st time, if already added throws false
                duplicates.add(num);
            }
        }

        for (int num : duplicates) {
            System.out.print(num + " ");
        }

    }
}
