package javaders.day10stringmanipulations;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {
        //kullanici gun numarasini girsin kod gun ismini yazsin
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun numarasi giriniz");
        int day = input.nextInt();

        if (day == 1) {
            System.out.println("Pazar");
        }
        else if (day == 2) {
            System.out.println("Pazartesi");
        }
        else if (day == 3) {
            System.out.println("Sali");
        }
        else if (day == 4) {
            System.out.println("Carsamba");
        }
        else if (day == 5) {
            System.out.println("Persembe");
        }
        else if (day == 6) {
            System.out.println("Cuma");
        }
        else if (day == 7) {
            System.out.println("Cumartes");
        }else {
            System.out.println("girilen sayi yanlis");
        }
    }
}
