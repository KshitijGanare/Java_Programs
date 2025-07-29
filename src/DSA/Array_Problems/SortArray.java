package DSA.Array_Problems;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {3,2,7,3,2,2,1,1};
        sortWithBruteForce(arr);
    }

    public static void sortWithBruteForce(int[] arr) { // Sorting the array
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            temp = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    arr[i] = arr[j];
                    arr[j] = temp;
                    temp = arr[i];
                }

            }
        }

        for (int num: arr){       // array ko sort karke alagse print kiya bc sorting ka function alag hai
            System.out.print(num); // Sprting function ka kam sirf sort karna hona chahiye naki print ka bhi
        }
    }
}
