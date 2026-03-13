package Functional_Programs;

public class FibonacciSeries {

    public static void main(String[] args){

        fSeriesByPointer(10);

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

}
