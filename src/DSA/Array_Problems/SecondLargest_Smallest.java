package DSA.Array_Problems;

import java.util.Arrays;

public class SecondLargest_Smallest {
    public static void main(String[] args) {

        int[] arr = {7, 5, 3, 2, 6};
        simpleSort(arr);
        secondLargestBruteMethod(arr);
    }

    public static void simpleSort(int[] arr){
        Arrays.sort(arr);
        System.out.println("Second Smallest:" + arr[1]);
        System.out.println("second Largest:"+ arr[arr.length-2]);

    }


    public static void secondLargestBruteMethod(int[] arr) {

        int i = 0;
        int temp;
        for (int j = i + 1; j < arr.length; j++) {

            if(i == 2){
                System.out.println(arr[1]);
                break;
            }

            if (arr[i] >= arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            i++;
        }



    }

}
