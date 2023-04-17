package introduction.day03scanner;

import java.util.Scanner;

public class Scanner02 {

    //Kullanicidan ilk ismini ve soyismini alip ekrana yazidiriniz
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("isminizi giriniz...");
        String fistName = input.next();

        System.out.println("soyisminizi giriniz...");
        String lastName = input.next();

       // System.out.println(fistName + lastName);
        System.out.println("fistName = " + fistName + " lastName =" + lastName);


    }





}
