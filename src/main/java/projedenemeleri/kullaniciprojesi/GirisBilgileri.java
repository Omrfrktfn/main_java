package projedenemeleri.kullaniciprojesi;

import java.util.Scanner;

public class GirisBilgileri {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen isminizi giriniz : ");
        String firstName = input.nextLine();

        System.out.print("Lutfen soyisminizi giriniz : ");
        String lastName = input.nextLine();

        System.out.println("Lutfen sifrenizi giriniz : ");
       // int ccn = input.nextInt();
        String ccn = input.nextLine(); // sifreler genellikle karakter dizisi veri tipinde tutulur.

        firstName=firstName.substring(0,1).toUpperCase();
        lastName=lastName.substring(0,1).toUpperCase();

        System.out.println("Name: " +firstName.charAt(0) + "***" + lastName.charAt(0)+"****");

        System.out.println("CCN : **** **** **** "+ (ccn.substring(ccn.length()-4) ));


    }
}
