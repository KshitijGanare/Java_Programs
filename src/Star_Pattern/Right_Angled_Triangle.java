package Star_Pattern;

public class Right_Angled_Triangle {
    public static void main(String[] args) {

        // Print right triangle

        int n = 7;

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Extra Code for half diamond
        for (int i = 1; i <= n-1 ; i++) {
            for (int j = n-1 ; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
