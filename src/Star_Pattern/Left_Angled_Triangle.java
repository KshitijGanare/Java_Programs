package Star_Pattern;

public class Left_Angled_Triangle {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++) {
                System.out.print("*");
            }
            System.out.println();

            /* For loop wale programs me hamesha limits dekhna,
            start and end limit
            */

        }

        for (int x = 1; x <= n-1 ; x++) {
            for (int j = 1; j <= x; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n-x ; k++) {
                System.out.print("*");
            }
            System.out.println();

        }


    }
}
