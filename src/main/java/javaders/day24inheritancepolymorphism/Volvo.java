package javaders.day24inheritancepolymorphism;

public class Volvo extends Car{

    public void secure (){
        System.out.println("Volvo is the most secure car in the world .... ");

    }

    @Override//bu bir annotation'dir
    //@Override annotation'u override kurallrini kontrol eder
    public void move() {
      //  super.move(); // parentta'ki move'u kullanmamaik icin
        System.out.println("Volvo moves...");
    }
}
