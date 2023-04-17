package javaders.day05typecastingasciivaluestringmanipulation;

public class C03_TypeCasting {
    public static void main(String[] args) {

        /*
        Numeric data type'larinin birbirine donusturulmesine type casting denir.
        Numeric data type'lari byte<short<int<long<float<double

        kucuk data type'larinin buyuk data type'larina donusturulmesi Auto Widening (otomotik genisletme)
        kucuk kutunun buyuk kutu icerisine yerlestirilmesi.

        Buyuk kutunun kucuk kutuya donusturulmesinde java sorumlulugu kabul etmez data kaybi olabilecegi icin
        kodu yazanlara birakir. Buna Explicit Narrowing (aciktan daraltma denir.)


         */

        byte age = 13;
        int newAge = age; // AutoWidening otomatik genisletme islemi diyoruz.
        short newShort = age;
        float newFloat = age;

        System.out.println("newAge = " + newAge);
        System.out.println("newShort = " + newShort);
        System.out.println("newFloat = " + newFloat);

        long weight = 1234l;
        //short weightShort = weight; bu sekilde hata verdiginzde kirmizi yazan yerden cut yapiliyor
        short weightShort = (short) weight; // Aciktan daraltma ; explicit narrowing

        int boy = 170;
        float boyFloat = boy;
        System.out.println("boyFloat = " + boyFloat);
    }

}
