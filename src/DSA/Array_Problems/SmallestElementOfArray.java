package DSA.Array_Problems;

public class SmallestElementOfArray {
    public static void main(String[] args) {
       smallestElementArray();
    }

    public static void smallestElementArray(){
        int[] arr = {22,10,3,4,5,6,2,255,23,3};
        int num = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < num){
                num = arr[i];
            }
        }

        System.out.println(num);


    }
}
