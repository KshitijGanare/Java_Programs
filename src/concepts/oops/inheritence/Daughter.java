package concepts.oops.inheritence;

public class Daughter extends Son{

    long daugherMoney = 50000;

    public void daughterFlat(){
        System.out.println("Daughter Flat");
        sonFlat();

    }

    public void daughterScooter(){
        System.out.println("Activa");

    }

    public static void main(String[] args) {
        Daughter daughter = new Daughter();
        daughter.daughterFlat();
    }

}
