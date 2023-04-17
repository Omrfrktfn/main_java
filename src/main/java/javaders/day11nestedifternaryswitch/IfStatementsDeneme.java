package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class IfStatementsDeneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir gun giriniz....");
        String day = input.nextLine();

        if (day.equalsIgnoreCase("pazartesi") ){
            System.out.println("Hafta ici");
        } else if (day.equalsIgnoreCase("sali") ){
            System.out.println("Hafta ici");

        }else if (day.equalsIgnoreCase("carsamba") ){
            System.out.println("Hafta ici");

        }else if (day.equalsIgnoreCase("persembe") ){
            System.out.println("Hafta ici");

        } else if (day.equalsIgnoreCase("cuma") ){
            System.out.println("Hafta ici");

        }else if (day.equalsIgnoreCase("cumartesi") ){
            System.out.println("Hafta sonu");

        }else if (day.equalsIgnoreCase("pazar") ){
            System.out.println("Hafta sonu");
        }else{
            System.out.println("Girilen metin gun degil...");
        }

        System.out.println("*****************************************");
        //kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup olmadigi yazdirin
        System.out.println("lutfen dikdortgenini bir kenar uzunlugunu giriniz...");
        int a = input.nextInt();
        System.out.println("lutfen dikdortgenini bir kenar uzunlugunu giriniz...");
        int b = input.nextInt();

       if (a == b){
           System.out.println("Karedir...");
       } else if (a!=b) {
           System.out.println("Dikdortgendir...");
       }else {
           System.out.println("girilen deger sayi degildir...");
       }

       /*
        System.out.println("*************************************************");
        System.out.println("lutfen kutsal bir gun ismi giriniz...");
        String kutsalGun = input.nextLine();

        if (kutsalGun.equalsIgnoreCase("Cuma")){
            System.out.println("Muslumanlar icin kutsal gun....");
        } else if (kutsalGun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun....");
        }else if (kutsalGun.equalsIgnoreCase("Pazar")) {
            System.out.println("Hiristiyanlar icin kutsal gun....");
        }else {
            System.out.println("Girilen gun kutsal bir gun degildir....");
        }

        */
    }
}
