package javaders.day18constructorsstatickeyword;

public class Car {
    /*
    1-Constructor nasil olusturulur :
        Acces modifier + Class ismi + () + { }
    2-Method ile constructor arasindaki farklar nelerdir :
        i-method'larda return type olur. Constructor'larda olmaz
        ii-Method'lar yaptklari ise gore isimlendirilirler.Constructorlar ise her zaman class ismi ile isimlendirilirler
        iii-Method'lar bir aksiyon yapmak icin olusturulur. Constructor'lar ise object olusturmak icindir.
        iv-Method isimleri kucuk harfle baslar. Constructor isimleri class ismi ile ayni oldugu icin buyuk harfle baslar
    3-Parametreli constructor'lar olusturarak ayni class'tan farkli ozelliklere sahip object'ler olusturabiliriz
     */

    String make = "Honda";
    String model = "Accord";
    int year = 2021;
    int price = 18000;

    //Default constructor : Javanin otomotik olarak verdigi
    //Default construstor'lar parametre kullanmazlar
    //Default constructor'larin body'si bostur.
    //java kiskanctir arkadaslar
    //Siz default constructor'u elle yazdiginizda java object class icindeki default constructor'u siler
    public Car (){

    }


    //Custom Constructor :


    public Car(String make, String model, int year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Car(String make) {
        this.make = make;
    }

    public Car(String make, int price) {
        this.make = make;
        this.price = price;
    }
}
