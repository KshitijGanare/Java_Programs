package concepts.oops.inheritence;

public class InheritedExampleClass {
    public static void main(String[] args) {
        Son son = new Son();
        Father father = new Father();

        System.out.println(son.sonMoney);
        System.out.println(son.fatherMoney);
        son.fatherFlat();
    }
}
