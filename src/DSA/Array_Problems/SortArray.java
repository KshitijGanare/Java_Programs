package DSA.Array_Problems;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {3,2,7,3,2,2,1,1};
        selectionSort(arr);
        bubbleSort(arr);
    }

    public static void selectionSort(int[] arr) { // Sorting the array
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

        for (int num: arr){
            System.out.print(num);
        }
    }

    public static void bubbleSort(int[] arr){

        int n = arr.length;
        int temp;

        for (int i = 0; i < arr.length; i++) {

            boolean isSwapped = false;

            for (int j = 0; j < n-i-1 ; j++) {     //

               if (arr[j] > arr[j+1]){          // we swap j and j+1 here if value of j > j+1
                  temp = arr[j];               // due to it, with each iteration of i max value goes to the last index
                  arr[j] = arr[j+1];          // So we exclude that index during next jth iteration
                  arr[j+1] = temp;

                  isSwapped = true;
               }
            }

            if(isSwapped == false){
                break;
            }
        }



        System.out.print("\n"+"Bubble Sort:");
        for (int elm: arr){
            System.out.print(elm);
        }
    }
}
