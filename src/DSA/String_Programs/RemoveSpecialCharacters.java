package DSA.String_Programs;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {

        replaceByFunction("ab$#cd");
        byBruteForce("ab!@#cde");

    }


    public static void replaceByFunction(String word){
       String noSpecialCharacters = word.replaceAll("[^a-zA-Z0-9]", "");
       System.out.println(noSpecialCharacters);

    }


    public static void byBruteForce(String word){

        StringBuilder stb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch >='a' && ch <= 'z' || ch >='A' && ch <= 'Z' || ch >= '0' && ch <= '9'){
                stb.append(ch);
            }

        }

        System.out.println(stb);  // internal conversion to String, so not used toString()

    }

}
