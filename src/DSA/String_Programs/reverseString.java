package DSA.String_Programs;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        byPointer("Selenium");
        reverseStringBuffer("Selenium");

    }

    public static void byPointer(String str) {
        char[] charArray = str.toCharArray();
        for (int i = charArray.length-1 ; i >= 0 ; i--) {
            System.out.print(charArray[i]);
        }

    }

    public static void reverseStringBuffer(String str) {
        StringBuffer stringBufferObj = new StringBuffer(str);
        System.out.print("\n"+stringBufferObj.reverse());

    }

}
