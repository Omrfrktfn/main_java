package javaders.day08stringmanipulations;

import java.util.Scanner;

public class C01_StringManipulationsDeneme {
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
        System.out.println("Lutfen mail adresinizi  \n" + " i)mail adresi \"@gmail\" icermeli\n" +
                "               ii)Space characteri mail'de olmamali\n" +
                "               iii)mail adresinde buyuk harf olmamali\n" +
                "               iv)En az bir tane noktalama isareti bulunmali");

        String mail = input.nextLine();
        boolean firts = mail.contains("@gmail");
        System.out.println("firts = " + firts);

        boolean second = !mail.contains(" ");
        System.out.println("second = " + second);

        boolean third = mail.replaceAll("[a-z0-9]","").
                replaceAll("[\\p{Punct}]","").
                replace(" ","").length()==0;
        System.out.println("Buyuk Harf Olmamali = " + third);

        boolean fourth = mail.replaceAll("[a-zA-Z0-9]","").replace(" ","").length()>0;
        boolean fourth2 = mail.replaceAll("[^\\{Punct}]","").length()>0;
        System.out.println("nokta olmali = " + fourth);
        System.out.println("noktalama isareti olmali  = " + fourth2);

        boolean dort = mail.replaceAll("[a-zA-Z0-9]","").replace(" ", "").length()>1;
        System.out.println("dort = " + dort);

        System.out.println(firts && second && third && fourth);

        String str = "burada bir gariplik var.?-!";
        System.out.println("str.replaceAll(\"[^\\\\p{Punct}]\",\"\") = " + str.replaceAll("[^\\p{Punct}]", ""));
    }

}
