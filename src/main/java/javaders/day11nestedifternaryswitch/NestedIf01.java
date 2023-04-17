package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class NestedIf01 {
    /*
    Kullanicidan 120'den buyu0'dan kucuk k deger giremiyecek sekilde datalari aldiktan sonra
    Eger calisan kadinsa 60 yasindan buyukse "Emekli Olabilir "yazdirin
    Eger calisan erkek ise 65 yasindan buyukse "Emekli Olabilir" yazdiran.
     */
     /*
     1-if icinde if kullanirsaniz nested if olusturmussunuz demektir.
     2-Nested if javayi yavaslatir. Bu yuzden mecbur kalmadikca kullanmayiz.
     3-Nested if gibi java'yi yavaslatan kodlar "Time Consuming" olarak adlandirilir.
      */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age : ");
        int age = input.nextInt();

        System.out.println("Please enter your gender : ");//Male or Female
        String gender = input.next();
        //stringleri karsilastirmak icin equals kullanilir.Esittir kullanilmaz
        if (age < 0 || age > 120) { //age 0'dan kucuk ve 120'den buyukse yazdirma manasinda
            System.out.println("negative ages  or ages greater than 120 are invalid...");
        } else if (gender.equalsIgnoreCase("male")) {
            //equalIgnoreCase: Buyuk harf kucuk harfi umursamaz, kullanici male de Male MALE yazsa kabul et manasinda.
            if (age > 65) {
                System.out.println("Can be retired...");
            } else {
                System.out.println("Should work...");
            }
        } else if (gender.equalsIgnoreCase("female")) {
            if (age > 60) {
                System.out.println("Can be retired...");
            } else {
                System.out.println("Should work...");
            }

        } else {
            System.out.println("Undefined gender...");
        }

    }
}
