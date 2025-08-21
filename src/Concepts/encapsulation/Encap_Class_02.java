package Concepts.encapsulation;

public class StudentInfo_01 extends Students_Info{


    public static void main(String[] args) {
        Students_Info sinfo = new Students_Info();
        String .setFirst_name("Kshitij");
        sinfo.setLast_name("Ganare");

    }

    public void printData(){
        System.out.println(Students_Info.getlast_name());
        System.out.println(stdinfo.getFirst_name());

    }

}
