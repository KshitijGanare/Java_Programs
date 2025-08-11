package DSA.String_Programs;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintOnlyDuplicates {
    public static void main(String[] args) {
//        String word = "sfcwefnqoiwd";
//        bySet(word);
        ascii();
//        byCount(word);

    }


    public static void bySet(String word){
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder builder = new StringBuilder();

        for (char ch: word.toCharArray()){
            if (seen.add(ch)){
                builder.append(ch);
                if ((builder.toString()).contains(String.valueOf(ch))){
                    
                }
            }
        }

    }

    public static void byCount(String word){
        char[] ch = word.toCharArray();
        Arrays.sort(ch);
        int count = 1;

        for (int i = 0; i < ch.length-1 ; i++) {
            if (ch[i] == ch[i+1]){
                count++;
            }else if (ch[i] != ch[i+1]) {
                System.out.println(ch[i] + " = " + count);
                count = 1;
            }
        }

        System.out.println(ch[ch.length-1] + " = " + count);

    }



    public static void ascii(){
        String name = "Selenium";
        int[] freq = new int[256];

        for (int i = 0; i < name.length()-1; i++) {
            freq[name.charAt(i)]++;
        }

        for (int i = 0; i < freq.length-1; i++) {
            if (freq[i] > 1){
                System.out.println((char)i+ "->" + freq[i]);
            }
        }


    }
}
