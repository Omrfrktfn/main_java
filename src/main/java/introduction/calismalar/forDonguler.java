package introduction.calismalar;

import java.awt.*;
import java.util.Scanner;

public class forDonguler {
    public static void main(String[] args) {
        //while loop sorulari
        //soru-1
        int a = 3;
        while (a <= 14) {

            if (a % 2 != 0) {
                System.out.print(a + " ");
            }
            a++;
        }
        System.out.println(" ");
        System.out.println(" ********************************** ");

        //soru-2
        //first way
        for (int i = 100; i < 1000; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        //second way
        int b = 100;
        while (b < 1000) {
            if (b % 5 == 0) {
                System.out.print(b + " ");
            }
            b++;
        }

        System.out.println(" ");
        System.out.println(" ***************************************** ");
        //sour-3

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz...");
        int c = input.nextInt();
        System.out.println("lutfen bir tam sayi daha giriniz...");
        int c1 = input.nextInt();

        int d=c;
        while (c<c1){

            if (c% 2==0){
                System.out.print(d+" ");

            }
            d++;
        }


        System.out.println(" ");
        System.out.println("**********************************");
        //soru-5
        Scanner input1 = new Scanner(System.in);
        System.out.println("lutfen bir rakam giriniz...");
        int a1=input1.nextInt();
        int a2=1;
        while (a2<11){

            System.out.println(a1+"x"+a2 +"="+(a1*a2));
            a2++;

        }
        System.out.println(" ");
        System.out.println("***************************************");

        //
    }
}
