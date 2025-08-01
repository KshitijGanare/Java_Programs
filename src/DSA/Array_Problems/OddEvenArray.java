package DSA.Array_Problems;

public class OddEvenArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3};
        oddEvenProgram(arr);
    }

    public static void oddEvenProgram(int[] arr) {

        for (int num: arr){
            if (num%2 != 0 ) {
                System.out.print(num);
            }
        }

    }
}
