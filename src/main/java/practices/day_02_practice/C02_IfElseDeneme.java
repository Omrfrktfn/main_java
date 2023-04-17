package practices.day_02_practice;

import java.util.Scanner;

public class C02_IfElseDeneme {
    public static void main(String[] args) {
        /*
        Kullanicidan bir gun alin
        Eger gun cuma ise "Muslumanlar Icin Kutsal Gun" ;
        Eger gun cumartesi ise "Yahudiler icin Kutsal Gun"
        Eger gun pazar ise "Hristyanlar icin Kutsal Gun"
         yazdiran kodu olusturunuz
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");
        String str = input.next().toLowerCase();

        if (str.equalsIgnoreCase("cuma")){
            System.out.println("Muslumalar icin mubarek bir gun");
        } else if (str.equalsIgnoreCase("cumartesi")) {
            System.out.println("Hiristiyanlar icin kutsal gun");
        } else if (str.equalsIgnoreCase("pazar")) {
            System.out.println("Yahudiler icin kutsal bir gun");
        }else {
            System.out.println("Girilen gun kutsal bir gun degil");
        }


    }
}
