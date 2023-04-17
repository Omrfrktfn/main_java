package introduction.calismalar;

import java.util.Scanner;

public class donguler {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            System.out.print(i + "-");
        }
        System.out.println(" ");
        int sayi = 5;
        while (sayi < 15) {
            System.out.println(sayi);
            sayi = sayi + 5;//while'de donguyu nerde bitecegini kendimiz eklriz.
        }

        int b = 35;
        do {
            System.out.println(b);
        } while (b != 35);

        System.out.println("*******************");

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();//alt satira gecmesi icin
        }

        String m = "Java guzeldir.";
        for (int i = 0; i < 10; i++) {
            System.out.println(m);

        }

        System.out.println("******************************");
        for (int i = 10; i < 31; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("******************************");
        for (int i = 100; i > 49; i--) {
            System.out.print(i + ",");
        }
        System.out.println(" ");
        System.out.println("*******************************");

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk tam bir sayi giriniz....");
        int a = input.nextInt();

        for (int i = 0; i <= a; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        System.out.println("*****************");

        Scanner input1 = new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk tam bir sayi giriniz....");
        int b1 = input1.nextInt();

        for (int i = 0; i <= b1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }


        System.out.println(" ");
        System.out.println("***************************************");

        Scanner input2 = new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk tam bir sayi giriniz....");
        int b2 = input1.nextInt();
        for (int i = 0; i <= b2; i++) {
            if (i % 3 == 0) {
                System.out.print("java" + " ");
            } else {
                System.out.print(i + " ");
            }
        }

        System.out.println(" ");
        System.out.println("**********************************************");
        Scanner input3 = new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk tam bir sayi giriniz....");
        int b3 = input1.nextInt();
        for (int i = 0; i < b3; i++)
            if (i % 5 == 0) {
                System.out.print("Guzeldir" + " ");
            } else {
                System.out.print(i + " ");
            }


        System.out.println(" ");
        System.out.println("********************");
        for (int i = 1; i <= 5; i++) {
            for (int j = (5 - i); j > 1; j--) {
                System.out.print(i + j);
            }
            System.out.println();
        }


    }
}
