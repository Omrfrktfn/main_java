package javaders.day22stringbuilder;

public class Student {
    //stdName public oldugu icin diger class'lardan ulasilabilir.
    public String stdName = "Ali Can";

    //Acces Modifier'i default olan ile public olan class member'lar ayni
    //package icinde kullanildiklarinda ayni ozellikleri gosterirler.
    //Fakat farkli package gectiginizde public olanlar ulasilabilir
    //default olanlara ulasilamaz
    int age = 23; //Default oldugu icin basina yazmamiza gerek yok


    //Acces modifier'i private olan class memberler sadece olusturuldikarli
    //class icinde gorulurler.Olusturuldiklari class'in disina ciktiklrinda
    //ulasilmaz olurlar
    private String healthConditon = "Cancer";

    //Acces Modifier'i protected olan class memberlar ayni package icindeyken
    //public gibi davranirlar.Farkli package gectiginiz'de protected olanlar
    //sadece child class'lar tarafindan gorulebilir
    protected int salary = 3000;

    //NOT- Class'lar public ve default olabilir ama private ve protected olamazlar.


}
