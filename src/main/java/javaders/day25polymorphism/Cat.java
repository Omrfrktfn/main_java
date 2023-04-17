package javaders.day25polymorphism;

import javaders.day24inheritancepolymorphism.Car;

public class Cat extends Animal{

    @Override
    /*override method ismi degistirilmez
    overrde'da parametre degismez
    override'de child'daki methodun kalibini daraltamayiz
    yani public olan yer degistirilemez
     */
    public void move() {
       // super.move();
        System.out.println("Cats move...");
    }
/*
overried yapmak icin sag tik generate override'den yapilir
retun type override'de daraltilamiyor ve genisletilemiyor
aynisi olmak zorundadir.
 */
    @Override
    protected int add(int a, int b) {
        return super.add(a, b);
    }

    @Override
    public Animal create() {
       // return super.create();
        return new Cat();
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
      //  return super.multiply(a, b);
        return 2*a*b;//oylsine bir method yazdik
    }


}
