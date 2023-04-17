package practices.day_01_practice;

import java.sql.SQLOutput;

public class C02_Ascii {
    public static void main(String[] args) {
        // Rakam kullanmadan 65, 66, 67, 68, 69, 70 sayilarinin toplamını bulunuz

        /*
        ASCİİ

        A ==> 65
        B ==> 66
        C ==> 67
        D ==> 68
        E ==> 69
        F ==> 70
         */
        int ch = 'A';
        System.out.println(ch);

        int ch1 = 'B';
        System.out.println(ch1);

        System.out.println((int)'A'+(int)'B'+(int)'C'+(int)'D'+(int)'E'+(int)'F');
        //bu A charini integere donusturerek int degerlrini topladik.Type castin
        //Type casting yapmasaydik ascii table degerleri toplanirdi


    }
}
