package practices.day_01_practice;

import java.util.Scanner;

public class C07_IfDeneme {
    public static void main(String[] args) {
        /*
        Kullanicidan hizmet yilini ve maasini ayri ayri sisteme girmesini isteyin.
        Eger bes ve bes yildan daha fazla calismisa %10 zamli maasini konsolda yazdirin
        Bes yildan daha az calisanlarin zam olabilmek icin kal yil daha calismasi gerektigin konsola yazdirin.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen maasinizi giriniz....");
        int a = input.nextInt();
        System.out.println("Lutfen hizmet yilinizi giriniz.....");
        int b = input.nextInt();

        if (b >= 5){
            System.out.println("zamli maas : " + (a + (a*10/100)));
        }else {
            System.out.println("zam alabilmek icin : " +(5-b)+ " yil daha calismaniz lazim");
        }

    }
}
