package introduction.teamornekleri;

import java.util.Scanner;

public class calisma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz...");
        String sayi = input.nextLine();

        try {
            int deger = Integer.valueOf(sayi);

            int result = deger*2;
            System.out.println("sonuc " + result);
        }catch (NumberFormatException e){
            System.out.println("Girdigiz string sayiya cevrilemez...");
            System.out.println(e.getMessage());
        }

        System.out.println(" ");
        System.out.println("*********************************************");

        String str []={"A","B","C","D"};
        System.out.println("lutfen bir urun numarasi giriniz...");
        int sira = input.nextInt();


        try {
            String secilenUrun= str[sira-1];
            System.out.println(secilenUrun);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Girdiginiz sira urun sayisindan buyuk ...");
        }

    }
}
