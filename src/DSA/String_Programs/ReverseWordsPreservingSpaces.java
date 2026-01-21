package DSA.String_Programs;

public class ReverseWordsPreservingSpaces {
    public static void main(String[] args) {

        reversePreservingSpaces("Hi    World");
    }


    public static void reversePreservingSpaces(String word){

        char[] ch = word.toCharArray();

        int i = 0;
        int j = ch.length -1;

        while (i<j){

            if (ch[i] == ' '){
                i++;
            }else if (ch[j] == ' '){
                j--;
            }else if(ch[i] != ' ' && ch[j] != ' ') {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;

                i++;
                j--;
            }

        }

        for (int k = 0; k < ch.length; k++) {
            System.out.print(ch[k]);
        }


    }

}

