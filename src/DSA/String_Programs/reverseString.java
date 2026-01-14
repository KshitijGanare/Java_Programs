package DSA.String_Programs;

public class reverseString {
    public static void main(String[] args) {
        printReverseWithoutSpace("AUTOmation");
        byPointerWithSpace("Selenium");
        System.out.println(reverseUsingStringBuffer("automation"));


    }


    public static void printReverseWithoutSpace(String str){

        for (int i = str.length()-1; i >= 0 ; i--) {
            System.out.print(str.charAt(i));
        }

        // Time O(n) Space O(1)
    }


    public static void byPointerWithSpace(String str) {
        char[] charArray = str.toCharArray();
        for (int i = charArray.length-1 ; i >= 0 ; i--) {
            System.out.print(charArray[i]);
        }

       // Time O(n)  Space O(n)
    }


    public static StringBuffer reverseUsingStringBuffer(String str) {
        StringBuffer stringBufferObj = new StringBuffer(str);

        return stringBufferObj.reverse();

        // Time O(n) Space O(n)

    }

}
