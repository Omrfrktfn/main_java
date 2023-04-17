package javaders.day06typecastingstringmanipulation;

public class TypeCasting {
    public static void main(String[] args) {

        // ExplicitNarrowing

        /*
        ExplicitNarrowin yaparken dikkat edilmeli cunku cok ciddi data kaybi hatta data'nin degismesine neden
        olabilir. Eger donusturmeye calistigimiz variable'nin sinirlari disinda ise java sayiyi mod islemine
        alir ve kalani yazdirir
        Kalan bolenin yarisindan fazla ise kalan sayiyi java kucultmek ister ve bolumu bir buyuterek kalani eksi
        - isaretli olacak sekilde yazdirir.
         */

        //short dat type'inde bir variable olusturup byte data type'na ceviririnz
        short num =260;
        System.out.println("num = " + num); //260
        byte newNum = (byte) num;
        System.out.println("newNum = " + newNum); // 4 ; java 260/256 yapip kalani bize verir

        short num2 = 1023;
        System.out.println("num2 = " + num2);
        byte num2New = (byte) num2;
        System.out.println("num2New = " + num2New);

        short num3 = 1000;
        System.out.println("num3 = " + num3);
        byte num3New = (byte) num3;
        System.out.println("num3New = " + num3New);

        int sayi=8880;
        System.out.println(sayi);
        short newSayi= (short) sayi;
        System.out.println(newSayi); // Her zaman data kaybina ugranilacak diye bir sart yok

    }
}
