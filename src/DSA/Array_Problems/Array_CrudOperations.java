package DSA.Array_Problems;

import java.util.Arrays;

public class Array_CrudOperations {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};
        insertElementInArray(arr);
        deleteArray(arr);

    }


    public static void insertElementInArray(int[] arr) {

        // Insert 100 in between 20 and 30

        int[] newArr = new int[arr.length+1];

        int indexPos = 2;
        int element = 100;

        for (int i = 0; i < indexPos; i++) {

            newArr[i] = arr[i];

        }

        newArr[indexPos] = element;

        for (int i = indexPos; i < arr.length; i++) {

            newArr[i+1] = arr[i];
        }

        System.out.println(Arrays.toString(newArr));

//        for (int ele: newArr){
//            System.out.println(ele);
//        }


    }

    public static void deleteArray(int[] arr){

        int[] newArr = new int[arr.length - 1];

        int j = 0;
        int element = 30;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] == 30){
               continue;
            }

            newArr[j] = arr[i];
            j++;

        }

        System.out.println(Arrays.toString(newArr));

    }

}