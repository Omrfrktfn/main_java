package practices.day_01_practice;

public class C01_BasamaklaraAyirmaDeneme {
    public static void main(String[] args) {
        //12345 sayisinin rakamlari toplamini bulunuz.
        int sayi = 12345;

        int first = sayi % 10;
        System.out.println("first = " + first);
        int second = (sayi / 10) % 10;
        System.out.println("second = " + second);
        int third = (sayi / 100) % 10;
        System.out.println("third = " + third);
        int fourth = (sayi / 1000) % 10;
        System.out.println("fourth = " + fourth);
        int fifth = (sayi / 10000) % 10;
        System.out.println("fifth = " + fifth);

        System.out.println("Rakamlari toplami :"+(first+second+third+fourth+fifth));


    }
}
