package javaders.day12switchincrementdecrementloops;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        /*
        Ay numarasi verildiginde numarasi verilen ayin ismini ve decembere kadarki tum aylarin isimlerini
         consola yazdirann kodu yaziniz
        Bizden istenen duruma gore o ay ve sonraki ay yada birden fazla ay derse
        break kisimlari silinir.
         */

        /*
        switch parentezi icerisinde :String int byte short ve char da kullanilabilir.
        boolean long float double kullanamayiz hata verir.
         */
       int monthNumber = 9 ;
       switch (monthNumber){
           case 1 :
               System.out.println("January");

           case 2 :
               System.out.println("February");

           case 3 :
               System.out.println("March");

           case 4 :
               System.out.println("April");

           case 5 :
               System.out.println("May");

           case 6 :
               System.out.println("June");

           case 7 :
               System.out.println("July");

           case 8 :
               System.out.println("August");

           case 9 :
               System.out.println("September");

           case 10 :
               System.out.println("October");

           case 11 :
               System.out.println("November");

           case 12 :
               System.out.println("December");
               break; // en sonda break birakmamizin sebebi en altta olan kismida yazdirmamasi icin.
           default:
               System.out.println("invalid month number ....");
       }
    }
}
