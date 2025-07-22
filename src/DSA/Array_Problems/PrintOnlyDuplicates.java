package DSA.Array_Problems;

import java.util.*;

public class PrintOnlyDuplicates {
    public static void main(String[] args) {
       int[] arr = {1,2,1,2,3,3,4};
       bySinglePointer(arr);
       byHashSet(arr); // Most preferred
       byHashMap(arr);

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
    }

    public static void byHashMap(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int ele: arr){
            map.put(ele, map.getOrDefault(ele, 0)+1);
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
            if(!seen.add(num)){        // set.add() returns true if adding element 1st time, if already added
                duplicates.add(num);   // then throws false
            }
        }

        for (int num: duplicates){
            System.out.print(num + " ");
        }

    }
}
