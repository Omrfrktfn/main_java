package javaders.day24inheritancepolymorphism;

public class Honda extends Car {

    public void eco(){
        System.out.println("Honda engines are so economic ... ");
    }

    public String model = "Civic";
    public int price = 20000;

    public Honda(){
        System.out.println(this.model);//ayni class'ta oludug icin this ile cagrilir
        System.out.println(super.model);//farklı clss'tan cagirma islemi
    }
}
