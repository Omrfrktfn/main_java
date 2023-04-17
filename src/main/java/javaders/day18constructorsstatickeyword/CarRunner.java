package javaders.day18constructorsstatickeyword;

public class CarRunner {
    public static void main(String[] args) {

        Car c1 = new Car();
        System.out.println(c1.make + " "+c1.model + " "+c1.model + " "+c1.year );
        Car c2 = new Car("Mercedes", "C300", 2023 , 30000);
        System.out.println(c2.make + " "+c2.model + " "+c2.model + " "+c2.year );
        Car c3 = new Car("Audi" , "R8" ,2023 , 50000);
        Car c4 = new Car("BMW");
        System.out.println(c4.make );


    }

}
