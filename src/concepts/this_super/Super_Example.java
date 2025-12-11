package concepts.this_super;

public class Super_Example {

    public static void main(String[] args) {
        System.out.println("Super Example!");

        Child childObj = new Child();
        childObj.Method();

    }

}


class Parent{

    String variable = "Parent variable";

    void Method(){
        System.out.println("Parent Method");
    }

}


class Child extends Parent{

    String variable = "Child variable";

    @Override
    void Method(){
        super.Method();
        System.out.println("Parent variable: " + super.variable);

    }

}