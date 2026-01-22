package DSA.String_Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateWordsCountCheck {
    public static void main(String[] args) {

        duplicateWordCheckByMap("automation");
    }

    public static void duplicateWordCheckByMap(String word){

        Map<Character, Integer> map = new LinkedHashMap<>();

        char[] wordArray = word.toCharArray();

        for (int i = 0; i < wordArray.length; i++) {

            char ch = wordArray[i];

            if (map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1 );
            }else {
                map.put(ch, 1);
            }

        }

        for (Map.Entry<Character, Integer> printMap: map.entrySet()){

            if (printMap.getValue() > 1){
                System.out.println(printMap.getKey() + "-->" + printMap.getValue());
            }

        }

    }
}
