package String_Programs;

public class StringWordCounter {
    public static void main(String[] args) {
        wordCounter("12323QWDQWoeriner");

    }

    public static void wordCounter(String name){

        int count = 0;
        int num = 0;

        char[] ch = name.toCharArray();

        for (int i = 0; i < name.length(); i++) {
            if (String.valueOf(ch[i]).matches("[a-zA-Z]")) {
                count++;
            }else  {
                num++;
            }
        }

        System.out.println(count);
        System.out.println(num);
    }
}

