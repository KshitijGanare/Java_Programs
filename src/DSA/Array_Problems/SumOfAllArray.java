package DSA.Array_Problems;

import java.util.Arrays;

public class SumOfAllArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,8,96,2};
        String stringArray = Arrays.toString(arr);
        sumOfAllArray(arr);

    }

    public static void sumOfAllArray(int[] arr){
        int sum = 0;
        for (int add: arr){
            sum += add;
        }
        System.out.println(sum);
    }

}
