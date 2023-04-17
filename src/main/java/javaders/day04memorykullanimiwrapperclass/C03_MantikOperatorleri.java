package javaders.day04memorykullanimiwrapperclass;

public class C03_MantikOperatorleri {

    public static void main(String[] args) {
        /*
        javada islem yaptiran
        == Esittir
        != Esit degildir
        < kucuktur
        > buyuktur
        = assigment atama operatoru

        i<4<5 ==> matematik uclu kiyas yapar ama java bunu yapamiyor
        i<4 && 4<5 ==> java bu sekilde ikili kiyas yapip mantik operatorleri ile birlestirme yapar.

        && ==> ve hem operatoru mukemmeliyetci yapidadir. True dondurmesi icin her iki sartinda saglanmasi gerekir.
        cay ve limion
        +   &&   +  ==> True
        +   &&   -  ==> False
        -   &&   +  ==> False
        -   &&   -  ==> False

        || ==> veya operatoru polyanaci yapidadir. En ufak bir pozitiflikte true dondurur
        cay ve limion
        +   ||   +  ==> True
        +   ||   -  ==> True
        -   ||   +  ==> True
        -   ||   -  ==> False



         */

        System.out.println(5 + 2 == 8);//false

        boolean sonuc1 = 5 > 4 && 7 < 9 && 6 + 3 == 9 && 5 + 2 != 8;
        System.out.println("sonuc1 = " + sonuc1);

        int sayi1 = 15;
        System.out.println(10 < sayi1 || sayi1 < 28);

        int sayi2 = 5;
        System.out.println(sayi2 < 10 || sayi2 > 20);

        short a = 1000;
        System.out.println(a<15000 || a>28000 || a<-23);

        System.out.println(a<=1000 && a==1000 && a<12);

    }
}
