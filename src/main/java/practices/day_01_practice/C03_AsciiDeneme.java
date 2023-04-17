package practices.day_01_practice;

import java.sql.SQLOutput;

public class C03_AsciiDeneme {
    public static void main(String[] args) {
        //CEM isminin icerisinde bulunana harflari kullanmadan yaziniz
        int b = 'B';
        System.out.println("b ascii degeri : " + b);

        int d = 'D';
        System.out.println("d ascii degeri = " + d);

        int l = 'L';
        System.out.println("l ascii degeri = " + l);

        char firstCharacter = 'B' + 1; //C
        char secondCharacter = 'D' + 1; //E
        char thirdCharacter = 'L' + 1; //M

        System.out.println("result : "+firstCharacter+secondCharacter+thirdCharacter);
    }
}
