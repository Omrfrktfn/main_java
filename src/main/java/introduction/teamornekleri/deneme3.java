package introduction.teamornekleri;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class deneme3 {
    public static void main(String[] args) {
        int i = 1;
        while (i < 14) {

            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println("********************************");
        int a = 100;

        while (a < 1000) {

            if (a % 15 == 0 && a % 20 == 0 && a % 90 == 0) {
                System.out.print(a + " ");
            }
            a++;
        }

        System.out.println(" ");
        System.out.println("**************************************");
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen baslangic degerini giriniz....");
        int b = input.nextInt();
        System.out.println("Lutfen baslangic degerini giriniz....");
        int b1 = input.nextInt();

        int c = b;
        while (b < b1) {
            if (b % 2 == 0) {
                System.out.print(b + " ");
            }
            b++;
        }

        System.out.println(" ");
        System.out.println("*****************************************");
        System.out.println("Lutfen bir harf giriniz....");
        char ch = input.next().charAt(0);
        System.out.println("Lutfen bir harf daha giriniz...");
        char ch1 = input.next().charAt(0);

        int d = ch;
        while (ch < ch1) {
            System.out.print(ch + " ");
            ch++;
        }

        System.out.println(" ");
        System.out.println("************************************");
        System.out.println("Lutfen bir rakam giriniz....");
        int e = input.nextInt();
        int f = 1;
        while (f < 11) {
            System.out.print(e + "*" + f + "=" + (e * f) + " ");
            f++;
        }

        System.out.println(" ");
        System.out.println("****************************************");
        System.out.println("Lutfen bir sayi giriniz...");
        int g = input.nextInt();
        int h = 1;

        while (h <= g) {
            if (g % h == 0) {
                System.out.print(h + " ");
            }
            h++;
        }

        System.out.println(" ");
        System.out.println("*********************************************");

        System.out.println(" ");
        System.out.println("*********************************************");
        System.out.println("Lutfen bir sayi degeri giriniz...");
        int k = input.nextInt();
        int adet = 0;
        int toplam = 0;

        while (k!= 0) {
            toplam = (k%10)+toplam;
            k/=10;
            adet++;

        }
        System.out.println("Basamak toplami : " + toplam);


    }
}
