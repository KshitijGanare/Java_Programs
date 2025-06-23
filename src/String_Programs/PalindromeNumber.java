package String_Programs;


import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

         // 1st Method: By comparing normal and reverse directly
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String to check palindrome: ");
//
        String normalString = scan.nextLine();
//        String reverseString = new StringBuffer(normalString).reverse().toString();
//
//        if (normalString.equalsIgnoreCase(reverseString)){
//            System.out.println("It's a Palindrome");
//        }else {
//            System.out.println("Not a Palindrome");
//        }

//         2nd Method: By using loop
        System.out.println(checkPalindrome(normalString));

    }

    static boolean checkPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                System.out.println("Not a Palindrome!");
                return false;
            }
            left++;
            right--;
        }

        return true;

    }

}
