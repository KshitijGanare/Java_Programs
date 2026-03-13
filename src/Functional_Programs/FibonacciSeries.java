package Functional_Programs;

public class FibonacciSeries {

    public static void main(String[] args){

        fSeriesByPointer(10);
        System.out.println("\n\n");
        fibonacciSwap(10);

    }

    public static void fSeriesByPointer(int num){

        int a = 0;
        int b = 1;
        int c = 0;


        for (int i = 0; i < num; i++) {

            System.out.print(a + " ");

            c = a + b;
            a = b;
            b = c;

        }

    }


    public static void fibonacciSwap(int n){

        int a = 0;
        int b = 1;

        for(int i = 0; i < n; i++){

            System.out.print(a + " ");

            b = a + b;
            a = b - a;

        }
    }

}
