package Star_Pattern;

public class PyramidPattern {
    public static void main(String[] args) {

        // Pyramid Pattern Program
        int n = 5;


        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {     // 2 * i - 1
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
