package DSA.String_Programs;

public class ReverseStringPreserveWordOrder {
    public static void main(String[] args) {
    // Reverse characters of each word while keeping word positions intact
        reverseStringCharacters();
        reverseStringCharactersIgnSpace();
    }

    public static void reverseStringCharacters() {
        String sentence = "Kshitij     is  the   Best";
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {

            char[] singleWord = words[i].toCharArray();

            for (int j = singleWord.length-1 ; j >= 0 ; j--) {
                System.out.print(singleWord[j]);
            }

        }
    }


    public static void reverseStringCharactersIgnSpace() {
        String sentence = "Kshitij   is  the Best";
        String[] words = sentence.split("\\s+");
        System.out.println(words.length);
        System.out.println(sentence.length());

        for (int i = 0; i < words.length; i++) {

            char[] singleWord = words[i].toCharArray();

            for (int j = singleWord.length-1 ; j >= 0 ; j--) {
                System.out.print(singleWord[j]);
            }
            System.out.print(" ");
        }
    }
}
