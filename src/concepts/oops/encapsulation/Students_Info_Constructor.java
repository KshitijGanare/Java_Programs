package concepts.oops.encapsulation;

public class Students_Info_Constructor {

    // Student Data
    private String first_name;
    private String last_name;
    private int rollno;
    private int age;

    public Students_Info_Constructor(String first_name, String last_name, int rollno, int age){
        this.first_name = first_name;
        this.last_name = last_name;
        this.rollno = rollno;
        this.age = age;

    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getRollno() {
        return rollno;
    }

    public int getAge() {
        return age;
    }
}



/*



 */