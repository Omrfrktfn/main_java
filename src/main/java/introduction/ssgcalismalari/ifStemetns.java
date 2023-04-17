package introduction.ssgcalismalari;

import java.util.Scanner;

public class ifStemetns {
    public static void main(String[] args) {
        int sayi1=15;
        int sayi2=20;

       boolean bb=  sayi1 < sayi2;
        if (sayi1 > sayi2){
            System.out.println("Buyuk olan sayi : " + sayi1 );
            System.out.println("Kucuk olan sayi : " + sayi2 );
        }

        if (sayi2>sayi1){
            System.out.println("Buyuk olan sayi " + sayi2);
            System.out.println("Kucuk olan sayi " + sayi1);
        }

        System.out.println(" ****************************************");

        //Kullanicidan bir tam sayi isteyin ve tek mi cift mi oldugnu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi degeri giriniz...");
        int sayi= input.nextInt();

        if ( sayi%2 == 0){
            System.out.println("Girilen sayi cift");
        }else {
            System.out.println("Girlen sayi cift degil");
        }
        System.out.println("**********************************************");



    }
}
