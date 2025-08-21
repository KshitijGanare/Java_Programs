package concepts.encapsulation;

public class Students_Info_Getter_Setter_Master {

    // Student Data
    private String first_name;
    private String last_name;
    private int rollno;
    private int age;


    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String firstname){
        this.first_name = firstname;
    }

    public String getlast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}



/*
Encapsulation: Binding data members and member methods(nethods acting on that data) into single unit via getters
and setter methods

3 ways to use Encapsulation:
1. If data members are initialized in global variables then we can directly use getter method to get its value
2. If data members are not initialized, we can initialize them dynamically using setter method then get value
using getter method

3. Another way to initialize is by using constructor, BUT for every global variable/data member we will have to create
one parameterized constructor
constructor - to initialize
getter - to get those values


 */