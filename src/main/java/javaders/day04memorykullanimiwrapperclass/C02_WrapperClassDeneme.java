package javaders.day04memorykullanimiwrapperclass;

public class C02_WrapperClassDeneme {
    /*
    java da sonucta bir urundur. Oracale firmasinin bir urunudur. Developerler sadece data barindiran primitive
    data type larnin non-primitivler gibi method da barindirmasini istemislerdir. Bunun uzerine java primitive
    data type larina method ekleyerek ozel bir class olusturmustur.Buna da wrapper class denir.

            Primitive Data                  Non-primitive
            byte                            Byte
            short                           Short
            int                             Integer ******
            long                            Long
            float                           Float
            double                          Double
            boolean                         Boolean
            char                            Character *******

     */

    public static void main(String[] args) {

        byte primitiveByt = 12;
        Byte wrapperByte = 12;
        
        //byte data type nin en buyuk ve en kucuk degerini ekrana yazdirin
        
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("maxByte = " + maxByte);
        
        byte minByte = Byte.MIN_VALUE;
        System.out.println("minByte = " + minByte);

        //int data tipinin byt data tipini toplamini veren methodu yaziniz

       int maxValue= Integer.MAX_VALUE;
       byte minValue =  Byte.MIN_VALUE;
       System.out.println("Toplam "+ (maxValue+minByte));


       //primitive data type lari wrapper classlara cevirme
        float primitiveFloat = 12.33f;
        Float wrapperFloat = primitiveFloat; // buna Autoboxing denir ==> otomotik kutulama kucuk kutuyu
        // buyuk kutuya kendisi yerlestirir.

        //wrapper classlari ptimitive data type larina nasil ceviririz
        Character wrapperChar = 'a';
        char primitiveChar = wrapperChar; // bu isleme de unboxing denir

        //verilen iki string datanin toplamini veren kodu yazinin
        String str1 = "12345";
        String str2 = "678";
        System.out.println("sonuc " + (str1+str2)); // string datalar da resim olarak gorur
        //ve concatination denir. birlestirme islemi yapar (+) islemi birlestirme yapar

        int value = Integer.valueOf(str1)+Integer.valueOf(str2);
        System.out.println("value = " + value);
        //  System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2)); //ikinci yol olarak ta yapilablir
        // Integer.valueOf() ==> valueOf string olan bir datayi sayiya cevirme islemi yapar

        /*
        java da (+) sembolu iki int icin matematikteki gibi toplama islemi yapar.
        Iki string data arasinda yada bir string bir int arasinda ise yan yana yazdirir buna
        concatination denir.
        java matematik bilir ve islem onceligine gore calisir.
            i-uslu sayi hesaplar
            ii-parentez ici hesaplanir
            iii-carpma ve bolme yaptirir ; soldan saga asagidan yukari ilk once hangisi varsa o calisir
            iiii-toplama ve cikarma
         */

        String harf = "A";
        int sayi = 7;
        /*
        harf + sayi ==> A7
        8+3+"K" == 11K
         */

        String a="K";
        int b = 3, c=5, d=2;
        System.out.println(a+b*c/d);







    }
}
