package DSA.String_Programs;

public class FindLongestWordInString {

    public static void main(String[] args) {

        String str1 = "I am the Best";
        findLongestWord(str1);

    }


    public static void findLongestWord(String str1) {

        String[] stringArray = str1.trim().split("\\s+");

        String longest = "";

        for (int i = 0; i < stringArray.length; i++) {

            if (stringArray[i].length() > longest.length()) {
                longest = stringArray[i];
            }

        }

        System.out.println(longest);

    }

}
