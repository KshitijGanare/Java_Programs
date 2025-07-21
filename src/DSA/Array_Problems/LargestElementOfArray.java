package DSA.Array_Problems;

public class LargestElementOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,3,122,122,33,11};
        int max = arr[0];

        for (int elm: arr){
           if(elm >= max) {
               max = elm;
           }
        }

        System.out.println(max);

    }

}
