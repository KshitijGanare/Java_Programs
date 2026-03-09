package DSA.Array_Problems;

import java.util.Arrays;

public class SecondLargest_Smallest {
    public static void main(String[] args) {

        int[] arr = {5,4,6,8,9,7};

        simpleSort(arr);
        byManualSort(arr);
        System.out.println("\n");
        secondLargestSmallest(arr);

    }

    public static void simpleSort(int[] arr){

        if (arr.length <= 2){
            System.out.println("Array too small");
            return;
        }

        Arrays.sort(arr);
        System.out.println("Second Smallest:" + arr[1]);
        System.out.println("second Largest:"+ arr[arr.length-2]);

    }


    public static void byManualSort(int[] arr){

        if (arr.length <= 2){
            System.out.println("Array too small");
            return;
        }

        int temp = 0;

        for (int i=0 ; i< arr.length; i++){

            for (int j=i+1; j< arr.length; j++){

                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

        }

        System.out.println("Second Smallest:" + arr[1]);
        System.out.println("second Largest:"+ arr[arr.length-2]);

    }


    public static void secondLargestSmallest(int[] arr) {

        if (arr.length < 2) {
            System.out.println("Array too small");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            int x = arr[i];

            // smallest
            if (x < smallest) {
                secondSmallest = smallest;
                smallest = x;
            }
            else if (x < secondSmallest && x != smallest) {
                secondSmallest = x;
            }

            // largest
            if (x > largest) {
                secondLargest = largest;
                largest = x;
            }
            else if (x > secondLargest && x != largest) {
                secondLargest = x;
            }
        }

        System.out.println("Second Smallest: " + secondSmallest);
        System.out.println("Second Largest: " + secondLargest);
    }


}
