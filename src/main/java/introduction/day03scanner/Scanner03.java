package introduction.day03scanner;

import java.util.Scanner;

public class Scanner03 {

    //kullanicidan adresini aliniz ve ekrana yazidiriniz
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("adresinizi giriniz...");
        String address = input.nextLine();
        //next methodu kullanicidan tek kelimeli stringi almak icin kullanilir
        //next line methodu ise kullanicidan cok kelimeli stringi almak icin kullanilir
        System.out.println("address = " + address);


    }
}
