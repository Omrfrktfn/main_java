package practices.day_02_practice;

import java.util.Scanner;

public class C08_Ternary {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 100 üzerinden notunu sisteme girmesini isteyiniz.
        Girilen not;
        not>100 ise konsola "100 den buyuk not giremezsiniz" yazdırın
        not>89 ise konsola "A" yazdırın
        not>79 ise konsola "B" yazdırın
        not>69 ise konsola "C" yazdırın
        not>59 ise konsola "D" yazdırın
        not>49 ise konsola "E" yazdırın
        not>-1 ise konsola "F" yazdırın
        degilse " negatif not giremezsiniz" yazdırın
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz...");
        int a = input.nextInt();

        String b = a > 100 ? "100'den buyuk not giremezsiniz" : a > 89 ?
                "A" : a > 79 ?
                "B" : a > 69 ?
                "C" : a > 59 ?
                "D" : a > 49 ?
                "E" : a > -1 ?
                "F" : "Negatif not giremezsiniz...";
        System.out.println(b);
    }
}
