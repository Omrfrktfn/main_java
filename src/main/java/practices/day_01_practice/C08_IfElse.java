package practices.day_01_practice;

import java.util.Scanner;

public class C08_IfElse {
    public static void main(String[] args) {
        /*

    Kullanicidan hizmet yılını ve maasını ayri ayri sisteme girmesini isteyin.
    Eger 5 ve 5 yıldan daha fazla calısmıssa %10 zamlı maasını konsolda yazdırın.
    5 yıldan daha az calısanların zam alabilmek icin kac yıl daha calısması gerektigini konsola yazdırın

    */
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen hizmet yilinizi giriniz....");
        int hizmetYili = input.nextInt();

        System.out.println("lutfen maasinizi giriniz....");
        int maas= input.nextInt();

        if (hizmetYili >= 5 ){
            System.out.println("yeni maas : " + (maas+(maas*10/100)));
        }else {
            System.out.println("calismasi gereken yil : " + (5-hizmetYili) + " yil daha calismalisiniz....");
        }
    }
}
