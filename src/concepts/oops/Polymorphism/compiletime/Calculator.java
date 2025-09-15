package concepts.oops.Polymorphism.compiletime;

public class Calculator {

    public void sum(){
        System.out.println("Sum Program!");
    }

    public void sum(int a, int b){
        System.out.println(a + b);
    }

    public void sum(double a,double b){
        System.out.println(a + b);
    }

}

class User{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum();
        calculator.sum(10, 20);
        calculator.sum(1.2, 44.5);

    }
}
