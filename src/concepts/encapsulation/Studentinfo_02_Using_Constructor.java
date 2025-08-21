package concepts.encapsulation;

public class Studentinfo_02_Using_Constructor {

    public static void main(String[] args) {
        Students_Info_Constructor sic = new Students_Info_Constructor("Virat", "Kohli",18,36);
        System.out.println(
                "Firstname:"+ sic.getFirst_name()+
                        "\nLastname:" + sic.getLast_name()+
                        "\nrollno:" + sic.getRollno() +
                        "\nage:" + sic.getAge());

    }
}
