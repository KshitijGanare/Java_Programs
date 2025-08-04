package DSA.String_Programs;

public class ReverseStringOnPoint {
    public static void main(String[] args) {

        reverseStringCharacters();
    }

    public static void reverseStringCharacters() {
        String sentence = "Kshitij is the Best";
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {

            char[] singleWord = words[i].toCharArray();

            for (int j = singleWord.length-1 ; j >= 0 ; j--) {
                System.out.print(singleWord[j]);
            }
            System.out.print(" ");
        }
    }
}
