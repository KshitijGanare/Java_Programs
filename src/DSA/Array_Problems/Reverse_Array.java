package DSA.Array_Problems;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3};
        revArray(arr);
    }

    public static void revArray(int[] arr){
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.print(arr[i]);
        }
    }
}
