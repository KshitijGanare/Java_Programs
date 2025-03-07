package Java_Task_Programs;

public class count_Program {
    public static void main(String[] args) {

        // Count vowels and consonants in a String.  -Shantanu, → vowels - 3, consnants - 4

        String name = "Shantanu";

        int vowels = 0, consonants = 0;

        for (char naam : name.toCharArray()){

            if(naam == 'a' || naam == 'e' || naam == 'i' || naam == 'o' || naam == 'u' )
            {
                vowels++;

            }else {
                consonants++;

            }

        }

        System.out.println(vowels);
        System.out.println(consonants);
    }
}
