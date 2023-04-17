package practices.day_01_practice;

import java.util.Scanner;

public class C06_IfDeneme {
    public static void main(String[] args) {
        /*
        Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        ilk sayinin ikinci sayidan buyik olup olmadigini yazdirina kodu yaziniz.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir deger giriniz....");
        int a = input.nextInt();

        System.out.println("Lutfen bir deger giriniz....");
        int b = input.nextInt();

        if (a > b){
            System.out.println("\"ilk girilen deger ikincisinden  \" =  " + "buyuktur");
        }else {
            System.out.println("\"ilk girilen deger ikincisinden \" =  " + "kucuktur");
        }
    }
}
