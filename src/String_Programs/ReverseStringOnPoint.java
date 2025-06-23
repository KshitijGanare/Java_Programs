package String_Programs;

public class ReverseStringOnPoint {
    public static void main(String[] args) {

        String reverseString = "Kshitij is the Best"; // Reversing the string with words in same position

        String[] storeWords = reverseString.split(" ");

        for (String singleWords : storeWords) {

            char[] lettersPrint = singleWords.toCharArray();

            for (int i = lettersPrint.length-1; i >= 0 ; i--) {
                System.out.print(lettersPrint[i]);
            }

            System.out.print(" ");


        }

    }
}
