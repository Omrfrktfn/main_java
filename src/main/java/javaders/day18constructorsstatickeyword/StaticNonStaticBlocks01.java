package javaders.day18constructorsstatickeyword;

import java.time.LocalDate;

public class StaticNonStaticBlocks01 {

    /*
    1-static block'lar static variable'lara ilk degerlerini atamak(initialize) icin kullanilir.
    2-static bir variabl'a deger atama k icin kod yazmaniz gerekirse staic block kulllaniniz
    3-sttic bir variable'a deger atamak icin yazilmasi gereken kod main method icine de yazilabilir ama
    static block icine yazilan kod'dan once calistirilir.
    4-bir class da birden fazla static block varsa ustteki onde calistirilir.
     */

    //static variable'ler static block kullanilmadan da initialize edilebilirler.
    public static double pi =3.14;


    //Asagidaki gibi static bir variableye kod yazilmasi gerekirse static block kullaniniz.
    public static double price;//ikinci yazilis sekli
    static {

        System.out.println("Hey i am a static block");
        LocalDate d = LocalDate.now();
        if (d.getMonthValue()==3){
            price = 2.71;
        }else {
            price=1200;
        }

    }
    public static void main(String[] args) {
        System.out.println("Hey i am a main method");
        LocalDate d = LocalDate.now();
        if (d.getMonthValue()==3){
            price = 2.71;
        }else {
            price=1200;
        }
    }

    static {
        System.out.println("hey i am a static block2");
    }
}
