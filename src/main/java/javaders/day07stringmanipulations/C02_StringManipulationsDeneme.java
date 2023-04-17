package javaders.day07stringmanipulations;

import java.util.Scanner;

public class C02_StringManipulationsDeneme {
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
        System.out.println("Lutfen sifrenizi yaziniz : " + " En az 8 katakterden olusmali\n" + "Password space icermesin\n" +
                "En az 1 tane buyuk harf olsun\n" + "En az 1 tane kucuk harf olsun\n" + "En az 1 tane sembol olsun\n" +
                "En az 1 tanede rakam olsun" + "lutfen bu kurallara uygun giriniz...");
        String pwd = input.nextLine();
        boolean sifre = pwd.length() > 7;

        boolean noSpace = !pwd.contains(" ");
        // boolean noSpce1 = pwd.replaceAll("[^ ]","").length()==0;

        boolean bykHarfolmali = pwd.replaceAll("[^A-Z]", "").length() > 0;
        System.out.println("bykHarfolmali = " + bykHarfolmali);

        boolean kckHarfolmali = pwd.replaceAll("[^a-z]", "").length() > 0;
        System.out.println("kckHarfolmali = " + kckHarfolmali);

        boolean sembolOlmali = pwd.replaceAll("[a-zA-Z0-9]", "").length() > 0;
        System.out.println("sembolOlmali = " + sembolOlmali);

        boolean rakamOlmali = pwd.replaceAll("[^0-9]", "").length() > 0;
        System.out.println("rakamOlmali = " + rakamOlmali);

        System.out.println("Password Gecerlimi : " +(sifre && noSpace && bykHarfolmali && kckHarfolmali && sembolOlmali
        && rakamOlmali));

    }
}
