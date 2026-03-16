package DSA.Array_Problems;

import java.util.Arrays;

public class MinAndMaxElementsOfArray {
    public static void main(String[] args) {
        int[] arr = {22,10,3,4,5,6,2,255,23,3};

        usingSortMethod(arr);
        usingVariableSingleIteration(arr);
    }

    public static void usingSortMethod(int[] arr){

        Arrays.sort(arr);
        System.out.println("Min value: "+ "-->" + arr[0]
        + "\nMax Value: "+ " --> " + arr[arr.length-1]
        );

    }

    public static void usingVariableSingleIteration(int[] arr){


        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(max < arr[i]){
                max = arr[i];
            }

            if(min > arr[i]){
                min = arr[i];
            }

        }

        System.out.println(max + "\n" + min);

    }

}
