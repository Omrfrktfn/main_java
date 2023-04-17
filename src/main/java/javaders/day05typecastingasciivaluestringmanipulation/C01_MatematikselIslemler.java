package javaders.day05typecastingasciivaluestringmanipulation;

public class C01_MatematikselIslemler {
    public static void main(String[] args) {

        /*
        1-javada farkli data type'lari arasinda islem yapiliyorsa sonuc buyuk olan
        data type'nin turunde olur.
        2-karsilastirma operatorlerinde sonuc hep boolean doner
        < > == != <= >= &&(ve) ||(veya)
         */


        System.out.println(4 * (5 + 2) / 3);

        double sonuc= 4 * (5 + 2) / 3;
        System.out.println("sonuc = " + sonuc);

        double sonuc2= 4.0 * (5 + 2) / 3;
        System.out.println("sonuc2 = " + sonuc2);

        System.out.println("4*(1+5)*3 = " + 4 * (1 + 5) / 3);

    }
}
