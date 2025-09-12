package concepts.oops.inheritence;

public class Son extends Father {

    public Son(){
        System.out.println("Child Constructor!");
    }

    long sonMoney = 100000;

    public void sonFlat() {
        System.out.println("Son Flat");
        fatherFlat();
        System.out.println("This is fathers money = " + " " + fatherMoney);
    }


    public void sonBike() {
        System.out.println("Bullet");
        System.out.println(fatherMoney);
    }

    @Override
    public void fatherCar() {
        System.out.println("Son can use father car");
        super.fatherCar();
    }
}
