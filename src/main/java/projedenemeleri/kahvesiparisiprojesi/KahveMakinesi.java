package projedenemeleri.kahvesiparisiprojesi;

import java.util.Scanner;

public class KahveMakinesi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String hangiKahve, sut , seker , boyut;


        System.out.println(" <<< Hangi Kahveyi istersiniz? >>>");
        System.out.println("1.Turk Kahvesi");
        System.out.println("2.Filtre Kahve");
        System.out.println("3.Espresso");

        hangiKahve = input.nextLine();


        if (hangiKahve.equalsIgnoreCase("Turk Kahvesi")){
            System.out.println("Turk kahvesi hazirlaniyor ...");
        } else if (hangiKahve.equalsIgnoreCase("Filtre Kahve")) {
            System.out.println("Filtre kahve hazirlaniyor ....");
        }else if (hangiKahve.equalsIgnoreCase("Espresso")){
            System.out.println("Espresso hazirlaniyor ...");
        }else {
            System.out.println("Gecersiz islem yapildi ...");
            return;
        }

        System.out.println( " -------------------------------------- ");

        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız): ");
        sut = input.nextLine();
        if (sut.equalsIgnoreCase("Evet")){
            System.out.println("Süt ekleniyor... ");
        } else if (sut.equalsIgnoreCase("Hayir")) {
            System.out.println("Sut eklenmiyor...");
        }else {
            System.out.println("Gecersiz islem yapildi...");
        }

        System.out.println( " -------------------------------------- ");

        int kacSeker;
        System.out.println("Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) :");
        seker=input.nextLine();
        if (seker.equalsIgnoreCase("Evet")){
            System.out.println("Kac seker olsun...");
            kacSeker=input.nextInt();
            String bosKod = input.nextLine();
            System.out.println(kacSeker +" seker ekleniyor");
        }else if (seker.equalsIgnoreCase("Hayir")){
            System.out.println("Seker eklenmiyor...");
        }else {
            System.out.println("Gecersiz secim yapildi...");
            return;
        }
       // input.nextLine(); //dummy kod

        System.out.println("Hangi boyutta olsun? (buyuk boy - orta boy - kucuk boy olarak giriniz.) : ");
        boyut= input.nextLine();
        if (boyut.equalsIgnoreCase("buyuk boy")){
            System.out.println("Kahveniz buyuk boy hazirlaniyor...");
        } else if (boyut.equalsIgnoreCase("orta boy")) {
            System.out.println("Kahveniz orta boy hazirlaniyor...");
        } else if (boyut.equalsIgnoreCase("kucuk boy...")) {
            System.out.println("Kahveniz kucuk boy hazirlaniyor...");
        }else {
            System.out.println("Gecersiz boyut secimi...");
            return;
        }

        System.out.println(hangiKahve + " "+ boyut + " hazirdir. Afiyet olsun !!!");

    }
}
