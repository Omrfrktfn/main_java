package javaders.day08stringmanipulations;

import java.util.Scanner;

public class C02_StringManipulations {
    public static void main(String[] args) {
         /*
           Kullanicidan email adresini girmesini isteyin,
           Asagidaki kurallara gore kullanicinin
           girdigi email adresini kontrol ediniz.
               i)mail adresi "@gmail" icermeli
               ii)Space characteri mail'de olmamali
               iii)mail adresinde buyuk harf olmamali
               iv)En az bir tane noktalama isareti bulunmali
         */
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen verilen bilgileri giriniz\ni)mail adresi \"@gmail\" icermeli\n" +
                "               ii)Space characteri mail'de olmamali\n" +
                "               iii)mail adresinde buyuk harf olmamali\n" +
                "               iv)En az bir tane noktalama isareti bulunmali\nyaziniz");
        String email = input.nextLine();
        boolean first = email.contains("@gmail");
        System.out.println("email = " + first);

        boolean first2 = !email.contains(" ");
        System.out.println("bosluk icermesin = " + first2);

        boolean third =email.replaceAll("[a-z0-9]","").replaceAll("[\\p{Punct}]","")
                .replaceAll(" ","").length()==0;
        System.out.println("third = " + third);

        boolean fourth =email.replaceAll("[a-zA-Z0-9]","").replace(" ","").length()>0;
        System.out.println("fourth = " + fourth);

        boolean fourth1 = email.replaceAll("[^\\p{Punct}]","").length()>0;
        System.out.println("fourth1 = " + fourth1);

        boolean fourth2 = email.replaceAll("[\\P{P}]","").length()>0;
        System.out.println("fourth2 = " + fourth2);

        System.out.println(first && first2 && third && fourth);

    }
}
