package javaders.day24inheritancepolymorphism;

public class Toyota extends Car { //baglanti olmasi icin

    public void hybrid() {
        System.out.println("Toyota uses hybrid engine");
    }

    public Toyota() {
        this("Prius");
        System.out.println("Toyota constructor 1");
    }

    public Toyota(String s) {
        super(7);
        System.out.println("Toyota constructor 2");
    }


}
