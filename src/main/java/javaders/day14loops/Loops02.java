package javaders.day14loops;

import java.awt.*;
import java.util.Scanner;

public class Loops02 {
    public static void main(String[] args) {
        //3'ten 8'e kadar tum tam sayilari consola yazdiran kodu yaziniz

        //first way
        for (int i = 0; i < 9; i++) {
            System.out.print(i + "-");
        }

        System.out.println(" ");
        System.out.println("***********************************");
        //second way
        /*
        for da parentez icin de olanlar ilki disarda ikincisi icerde ucuncuus disarda
         */
        int i = 0;
        while (i < 9) {
            System.out.print(i + " ");
            i++;
        }


        System.out.println(" ");
        //first way
        //21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz
        for (int k = 21; k < 181; k++) {
            if (k % 4 == 0 && k % 6 == 0) {
                System.out.print(k + " ");
            }
        }
        System.out.println(" ");
        //second way
        int k = 21;
        while (k < 181) {
            if (k % 4 == 0 && k % 6 == 0) {
                System.out.print(k + " ");
            }
            k++;
        }

        System.out.println(" ");
        //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
        //miami ==> MiAmI
        String s = "miami";
        int m = 0;
        while (m < s.length()) {
            String ch = s.substring(m, m + 1);
            if (m % 2 == 0) {
                System.out.print(ch.toUpperCase());
            }
            m++; // bu kisim eklenmezse sonsuz loop olusur
        }

        System.out.println(" ");
        System.out.println(" **************************************");
        //size verilen tamsayinin rakmlari toplamini kconsole yazidirin
        int r = 578;
        r = Math.abs(r);
        int sun = 0;
        while (r > 0) {
            sun = sun + r % 10;

            r = r / 10;
        }
        System.out.println(sun);

        System.out.println(" ");
        System.out.println("***************");
        //Kullanicidan aldiginiz sayi icin carpim tablosu olusturan kodu yaziniz
        //3x1=3  3x2=6  3x3=9 ... 3x10=30

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = input.nextInt();
        int u = 1;

        while (u < 11) {
            System.out.println(n + "x" + u + "=" + (n * u));
            u++;
        }

        //Kullanicidan alginiz stringdeki sessiz harfleri consola yazdiriniz.
        //alabama ==>lbm

        String x = "Alabama";
        System.out.println("please enter a word...");
        String y = input.next();
        int z = 0;
        while (z < y.length()) {

            char ch = y.charAt(z);
            boolean x1 = ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
            if (x1) {
                z++;
                //continue; // tekrar olmamasi icin continue yi kapat
            } else {
                System.out.print(ch+" ");
            }
            z++;
        }

    }


}
