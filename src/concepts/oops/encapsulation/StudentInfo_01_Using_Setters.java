package concepts.oops.encapsulation;

public class StudentInfo_01_Using_Setters {

    public static void main(String[] args) {
        Students_Info_Getter_Setter_Master sinfo = new Students_Info_Getter_Setter_Master();

        sinfo.setFirst_name("Rohit");
        System.out.println(sinfo.getFirst_name());

        sinfo.setLast_name("Sharma");
        System.out.println(sinfo.getlast_name());

        sinfo.setRollno(15);
        System.out.println(sinfo.getRollno());

        sinfo.setAge(35);
        System.out.println(sinfo.getAge());

    }

}
