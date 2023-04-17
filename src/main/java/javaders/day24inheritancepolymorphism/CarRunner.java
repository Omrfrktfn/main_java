package javaders.day24inheritancepolymorphism;
/*
CarRunner Class'tan constructor'a giderken CarRunner icindeki object parantezi icinde parametre koyduysak, ilgili
Class'a gider ve icinde parametresi olani bulup calistirir.

Toyota Class'i icinde iki constructor var. Parametresi String olani kullanacagiz. Parametresi String olan
constructor {} icinde ilk satirda super(5)'i ekledik. Bu durumda CarRunner'dan Car Class'ina gidilir
ve oradaki constructorlardan parametresi tam sayi olana gidecek ve onu calistiracak.
Car Classi icinde constructorlardan birinin parametresi int i idi. 5 sayisina en uygun buydu, bunu calistirdi.
Ekrana Car constructor 2 yazildi.

Daha sonra super(5)'i alt constructor'dan ust constructor'a koyduk. Toyota Class icindeki ust constructor parametresiz
Java bu durumda hangisini sececek? Java bu nedenle once parametresiz olana gidecek. Bunun icinde super(5) var. 5'in bulundugu
yere bakinca integer oldugu anlasiliyor. Java Car class'i icinde once parametresi int olana gider onu calistirir.
Ekranda once Car constructor 2'yi goruruz, daha sonra parametresiz constructor'a gider ve onu calistirir. Ekranda daha sonra
Toyota constructor 1'i goruruz.
 */


public class CarRunner {

    public static void main(String[] args) {
      //  Toyota t1 = new Toyota();

        Honda h1 =new Honda();

        String s = "Ali";

        Volvo v1 =new Volvo();
        v1.move();

   //     t1.model="Prius";
   //    System.out.println("t1.model = " + t1.model);

    }
}
