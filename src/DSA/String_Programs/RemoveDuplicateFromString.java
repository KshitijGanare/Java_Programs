package DSA.String_Programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString {
    public static void main(String[] args) {
        String str = "banana";
        byBruteForce(str);
        byFunction(str);

    }

    public static void byBruteForce(String str) {
        int n = str.length();

        for (int i = 0; i < n; i++) {
            boolean hasAppeared = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)){
                    hasAppeared = true;
                    break;
                }
            }
            if(!hasAppeared){
                System.out.print(str.charAt(i));
            }
        }

    }

    public static void byFunction(String str){
        Set<Character> set = new LinkedHashSet();
        StringBuilder stringbuilder = new StringBuilder();

        for (char ch: str.toCharArray()){
            if(set.add(ch)){
                stringbuilder.append(ch);
            }
        }

        System.out.println(set);
        System.out.println(stringbuilder);
    }
}
