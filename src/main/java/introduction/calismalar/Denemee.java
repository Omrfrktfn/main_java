package introduction.calismalar;

import java.sql.SQLOutput;

public class Denemee {
    public static void main(String[] args) {
        int sayi=5;
        int sayi1=2;
        double sayi2 = sayi / sayi1;
        System.out.println(sayi2);

        int num1 = 4;
        int num2= 5;
        String str = "Ali";

        System.out.println(str+num1+num2);
        System.out.println(num1+str+num2);
        System.out.println(num1+num2+str);

        System.out.println("***************");
        String str1 = "ali";
        String str2 = "Ali";

        System.out.println(str1.equals(str2));

        String str3 = "seyhan yavuz";
        System.out.println(str3.replace('s','S'));
        System.out.println(str3.replaceAll("s","S"));

        String s = "Java is Java";
        System.out.println(s.indexOf("va",2));


    }
}
