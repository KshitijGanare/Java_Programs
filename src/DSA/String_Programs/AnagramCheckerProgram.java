package DSA.String_Programs;

import java.util.Arrays;

public class AnagramCheckerTwo {
    public static void main(String[] args) {

        String str1 = "silent";
        String str2 = "listen";

        bySort(str1, str2);
        byAscii(str1, str2);

    }


    public static void bySort(String str1, String str2){

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        if (ch1.length != ch2.length){
            System.out.println("Not an Anagram!");
            return;
        }

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1, ch2)){
            System.out.println("Its an Anagram");
        }else {
            System.out.println("Not an Anagram");
        }

    }


    public static void byAscii(String str1, String str2){

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        if (ch1.length != ch2.length){
            System.out.println("Not an Anagram!");
            return;
        }

        int[] freq = new int[256];

        for (int i = 0; i < ch1.length; i++) {
            freq[ch1[i]]++;

        }


        for (int i = 0; i < ch1.length; i++) {
            freq[ch2[i]]--;

        }


        for (int i = 0; i < freq.length; i++) {

            if (freq[i] != 0){
                System.out.println("Not an Anagram");
                return;
            }

        }

        System.out.println("Its an Anagram!");

    }

}

