package concepts.oops;

class Parent {
    public Parent(){
        System.out.println("This is a parent constructor");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("This is child constructor");
    }

    public Child(String name){
        this();
        System.out.println("String with String parameter");
    }

    public Child(int age){
        this("Xxx");
        System.out.println("Constructor with int parameter");
    }

}

public class Constructor_Pr{
    public static void main(String[] args) {
        Child ch = new Child(20);
    }
}
