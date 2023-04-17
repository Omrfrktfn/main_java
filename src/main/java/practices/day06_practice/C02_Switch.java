package practices.day06_practice;

import java.io.BufferedReader;
import java.lang.annotation.ElementType;
import java.util.Scanner;

public class C02_Switch {
    public static void main(String[] args) {
         /*
     Bir ATM'de aşağıdaki banka işlemlerini yapmak için, kullanicidan 1-4 arası işlem numarasını sisteme girmesini isteyiniz.

     işlem 1: Bakiye Sorgulama
     işlem 2: Para Cekme
     işlem 3: Para Yatırma
     işlem 4: İşlemi Sonlandırın

     Ve bu islemleri Switch case kullanarak yaptırınız.
     */

        Scanner input = new Scanner(System.in);
        System.out.println("1-4 arasi islem numaranizi giriniz..." + "\n" +
                "Islem-1: Bakiye sorgulama" + "\n" +
                "Islem-2: Para cekme" + "\n" +
                "Islem-3: Para yatirma" + "\n" +
                "Islem-4: Islemi sonlandirma");
        int islemNo = input.nextInt();

        int bakiye = 1000;
        switch (islemNo) {
            case 1://bakiye sorgulama yapicaz
                System.out.println("Bakiyeniz " + bakiye + " TL");
                break;

            case 2:
                System.out.println("Lutfen cekmek istediginiz parayi giriniz...");
                int cekilenPara = input.nextInt();

                if (cekilenPara <= bakiye) {
                    bakiye = bakiye - cekilenPara;
                    System.out.println("Para cekme isleminden sonraki mevcut bakiyeniz: " + bakiye + " TL");
                } else {
                    System.out.println("Bakiyeniz yetersiz...");
                }
                break;

            case 3:
                System.out.println("Lutfen yatirmak istediginiz parayi giriniz...");
                int yatirilanPara = input.nextInt();
               // bakiye=bakiye+yatirilanPara;
                if (yatirilanPara<=2000){
                    bakiye=bakiye+yatirilanPara;
                    System.out.println("Para yatirma isleminden sonraki mevcut bakiyeniz: " +bakiye+" TL");
                }else {
                    System.out.println("ATM'de gunluk para yatirma limiti 2000 TL");
                }
                break;

            case 4: //ISLEMI SONLANDIRMA
                System.out.println("Techpro Bank'i kullandiginiz icin tesekkur ederiz...");
                break;

            default:
                System.out.println("Gecerli bir numara giriniz...");
        }

    }
}
