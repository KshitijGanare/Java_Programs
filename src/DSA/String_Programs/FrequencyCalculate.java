package DSA.String_Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyCalculate {
    public static void main(String[] args) {
        byAscii();
        byMap();
    }

    public static void byAscii(){
        String name = "Selenium";
        int[] freq = new int[256];

        for (int i = 0; i < name.length()-1; i++) {
            freq[name.charAt(i)]++;
        }

        for (int i = 0; i < freq.length-1; i++) {
            if (freq[i] >= 1){
                System.out.println((char)i+ "->" + freq[i]);  // Printed i as character, and freq count
            }
        }
    }


    public static void byMap(){
        String name = "Selenium";
        Map<Character, Integer> map = new LinkedHashMap<>();

        char[] ch = name.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            map.put(ch[i], map.getOrDefault(ch[i],0)+1);
        }

        for (Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }


    }
}
