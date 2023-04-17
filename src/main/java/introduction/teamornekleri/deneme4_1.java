package introduction.teamornekleri;

import java.util.Scanner;

public class deneme4_1 {
    public static void main(String[] args) {

        int i = 9;

        do {

            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i < 191);

        System.out.println(" ");
        System.out.println("**************************");

        char m = 'm';
        char c = 'c';

        // char str = m;

        do {
            System.out.print(m + " ");
            m--;

        } while (c < m);

        System.out.println(" ");
        System.out.println("********************************");

        Scanner input = new Scanner(System.in);
        System.out.println("Cikmak icin sifira basin");
        int sum = 0;
        int count = 0;
        int nCount = 0;

        do {
            System.out.println("Lutfen pozitif bir tam sayi giriniz");
            int sy = input.nextInt();

            if (sy == 0) {
                System.out.println("see you again");
                break;
            }
            if (sy < 0) {
                System.out.println("Negatif bir sayi girdiniz lutfen pozitif giriniz...");
                nCount++;
                continue;
            }
            sum = sum + sy;
            count++;

        } while (true);
        System.out.println("Girilen sayilarin toplami : " + sum);
        System.out.println("Girilen pozitif sayi adeti : " + count);
        System.out.println("Girilen negatif sayi adeti : " + nCount);

        System.out.println(" ");
        System.out.println("*****************************************");
        //sifr Techpro.06

        System.out.println("Lutffen gecerli bir parola giriniz....");
        String prw = input.next();
        boolean kucukHarf = prw.replaceAll("[^a-z]", "").length() > 0;
        boolean buyukHarf = prw.replaceAll("[^A-Z]", "").length() > 0;
        boolean ozelKarekter = prw.replaceAll("[\\p{Punct}]", "").length() > 0;
        boolean uzunluk = prw.length() > 7;
        do {
            boolean gecerli = kucukHarf && buyukHarf && ozelKarekter && uzunluk;

            if (gecerli == true) {
                System.out.println("sifrenizi kabul edimistir " + (kucukHarf && buyukHarf && ozelKarekter && uzunluk));
                break;

            } else {
                System.out.println("Grilen sifre yanlistr...");
                break;
            }
        } while (true);


    }
}
