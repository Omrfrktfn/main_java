package javaders.day07stringmanipulations;

import java.io.PipedWriter;
import java.util.Scanner;

public class C02_StringManipulations {
    public static void main(String[] args) {
        /*Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz

                i) En az 8 karakterden olussun
                ii)Password space icermesin
                iii)En az 1 tane buyuk harf olsun
                iv) En az 1 tane kucuk harf olsun
                v) En az 1 tane sembol olsun
                vi) En az 1 tanede rakam olsun


            Pozitif Senaryo ==> Ac123?d.    true
            Negatif Senaryo ==>Ac123? sd
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi  i) En az 8 karakterden olussun\n" +
                "                ii)Password space icermesin\n" +
                "                iii)En az 1 tane buyuk harf olsun\n" +
                "                iv) En az 1 tane kucuk harf olsun\n" +
                "                v) En az 1 tane sembol olsun\n" +
                "                vi) En az 1 tanede rakam olsun\nuygun olarak giriniz ");

        String pwd = input.nextLine();
        boolean sife = pwd.length() > 7;

        boolean noSpace = !pwd.contains(" ");//olumsuz eki unlem ! ile yapilir

        boolean bykHarf = pwd.replaceAll("[^A-Z]", "").length() > 0;

        boolean kckHarf = pwd.replaceAll("[^a-z]", "").length() > 0;

        boolean semboll= pwd.replaceAll("[a-zA-Z0-9]", "").length() > 0;

        boolean rakam = pwd.replaceAll("[^0-9]","").length() > 0;

        System.out.println("sifre gecerlimi : "+(sife && noSpace && bykHarf && kckHarf && semboll && rakam));
    }
}
