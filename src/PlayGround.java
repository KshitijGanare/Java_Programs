import java.util.LinkedHashSet;
import java.util.Set;

public class PlayGround {

    public static void main(String[] args) {
        String str = "Selenium";
//        byBruteForceg(str);
        System.out.println(str.contains("b"));

    }


    public static void byBruteForce(String str) {
        char[] ch = str.toCharArray();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < ch.length; i++) {
            if ("aeiou".indexOf(ch[i]) != -1) {
                vowels++;
            } else {
                consonants++;
            }

        }
        System.out.println("Vowels:" + vowels);
        System.out.println("Consonants:" + consonants);

    }

}


