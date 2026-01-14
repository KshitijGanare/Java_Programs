package DSA.String_Programs;


public class PalindromeNumber {
    public static void main(String[] args) {

        String name = "madam";

        checkPalindrome_By2Pointer(name);
        checkPalindrome_By2Pointer("maam");

        System.out.println(checkPalindrome_By1Pointer(name));
        System.out.println(checkPalindrome_By1Pointer("maam"));

        checkPalindromeByString("mazddam");

    }


    // 2 pointer, while loop
    static boolean checkPalindrome_By2Pointer(String str){
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

        System.out.println("Palindrome!");
        return true;

        // Time O(n) Space O(1)
    }


    // 1 pointer for loop
    public static String checkPalindrome_By1Pointer(String str){

        int n = str.length() - 1;

        for (int i = 0; i < n/2; i++) {
            if (str.charAt(i) != str.charAt(n-i)){
                return "Not a Palindrome!";
            }

        }

        return "Palindrome";

        // Time O(n) Space O(1)
    }


    // Using StringBuffer
    public static boolean checkPalindromeByString(String str){

        StringBuffer bufferedString = new StringBuffer(str);
        String reverse = bufferedString.reverse().toString();

        if (str.equals(reverse)){
            System.out.println("Its a Palindrome!");
            return true;
        }

        System.out.println("Not a Palindrome!");
        return false;

    }

}


/*

   // Approaches:
     1. 2 Pointer Approach (Best) since space O(1)
     2. 1 Pointer Approach (Good)
     3. StringBuffer using reverse


   // Gap:
     1. In 1 pointer approach, keep n = length()-1; reduce 1 for index at this step only
     2. In both odd/even limit of loop will be = length/2 if reduces 1 in length before



🎯 Interview Follow-up Questions (Be Ready)
   ❓ Q1: Why is two-pointer approach better?
   Answer: “It avoids extra space and stops early if mismatch occurs.”

   ❓ Q2: Can you check palindrome ignoring case?
   Answer: “Convert string to lowercase once, then apply same logic.”

   ❓ Q3: Why can’t we reverse string in-place?
   Answer: “Because String is immutable in Java.”


 */