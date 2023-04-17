package javaders.day24inheritancepolymorphism;

    /*
      1)Inheritance'da object olustururken constructor'lar yukaridan(Parent)
      asagiya(Child) dogru calisir
      2)Parent ve Super es anlamlidir, Child ve Sub es anlamlidir.
      3)super() her constructor'in ilk satirinda gorunmez olarak bulunur.
      4)super() sizi parant class'daki constructor'a tasir.
      5)this() sizi ayni class icindeki constructor'lar arasinda gezdirir.
      6)"this()" icinde bulundugunuz variable'lari cagirmaya yarar
      "super()" parent class'daki variable'lari cagirmaya yarar
      7-Parent ten Child a HAS-A ilişkisi var. yukarıdan aşağıya yani.
//Animal-Mammal-Cat-Van Cat
//Animal has a cat, mammal a van cat, cat has a van cat
//Child dan parent a IS-A ilişkisi vardır.
Cat is a animal, van cat is a mammal, mammal is a animal,
eğer data tipleri arasında IS-A ve HAS-A ilişkisi varsa bu data tiplerine COVARI
    */

/*
      1)Polymorphism ==> Coklu sekil
       Yani bir method 'un farkli sekillerde karsimiza cikmasi demektir.
       Polymorphism = Overloading + Overridign
       2) Overridding parent class daki methodu chil class ın ihtiyaçlarına göre özelleştirerek kullnamk demektir
     3)Overriding'de method'un body'si degistirilir.
    4)Overriding'de method signature'a dokunulmaz. Dokunursaniz Java kizar.
    Parent child iliskisi olmalidir.
      */
public class Car {

    public void move(){
        System.out.println("Cars move .... ");
    }

    public void getbreak(){
        System.out.println("Cars break .... ");
    }

    public void engine(){
        System.out.println("Cars have engine  .... ");
    }

    public String model = "Car";
    public int price = 0;

    public Car(){
        System.out.println("Car constructor 1");
    }

    public Car(int i){
        this();
        System.out.println("Car constructor 2");
    }
}
