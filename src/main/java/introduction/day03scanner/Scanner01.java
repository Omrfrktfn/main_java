package introduction.day03scanner;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //1- Scanner Class tan bir obje olustur.

        Scanner input = new Scanner(System.in);
        //Scanner ilk basta kirmizi olarak geliyor sebebi kutuphaneden import islemi yapmamiz gerekiyor.
        //obje ismi input yaptik cunku bu obje kullanicidan alinana data yi benim kodlarimin icine koyacak

        //2-Kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("lutfen yasinizi girniz...");

        //3- Uygun method u kullanarak kullanicinin verdigi datayi memory e yerlestirir
        byte age = input.nextByte();
        System.out.println("age = " + age);
    }
}
