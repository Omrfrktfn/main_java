package javaders.day23inheritance;

public class Animal {
    /*
    1-eat(){} methodu gibi bir cok class'in kullanmasi gereken methodlari her class'a ayri ayri yazarsak
        i- Tekrar yapmis oluruz, Tekrar ideal kod'da olmamalidir.
        ii-Ayni method'u tekrar tekrar yazmak zaman kaybidir.
        iii-Tekrar tekrar yazilan methodun tamiri cok zaman alir.
        iv-Tekrar tekrar yazilan methodun gelistirilmesi cok zaman alir.
        v-Methodu tekrar tekrar yazmak atomic yapi'ya terstir.

     2-private class member'lar child class'lar tarafindan kullanilamaz
        i-public class member'lar child class'lar tarafindan kullanilabilir.
        ii-default class member'lar ayni package'de child class'lar tarafindan kullanilabilirler.
        iii-protected clas member'lar farkli package'de de olsalar child lass'lar tarafinda kullanilabilir.

     3-Java'da bir class'in sadece bir tane parent'i olabilir.
        i-Coklu parent'a multiple inheritance derler. Tekli parent'a single inheritance derler.
        ii-Java multiple inheritanceyi desteklemez . Java single inheritance kullanir.

     4-Apartman seklindeki inheritance yapisina multilevel inheritance denir.
        i-java multilevel inheritance'yi destekler.
     */

    public void eat (){
        System.out.println("Animals eat...");
    }

    public void drink(){
        System.out.println("Animals drink...");
    }


}
