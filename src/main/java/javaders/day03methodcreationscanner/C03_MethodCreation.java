package javaders.day03methodcreationscanner;

public class C03_MethodCreation {

    /*
    1-java da method main in disinda olusturulur
    2-tekrar tekrar kullanmamiz gerekiyorsa Method olustururuz.
        Acces Modifier + Return Type + methodIsmi + ( ) + { }
        datalar veya islem yapilacak olan sayilari methodIsmi parentezinin icine eklenir


        scope : kapsam alani bir variablenin bir degerin hangi alanda kapsam icinde oldugunu gosterir

     */
    public static void main(String[] args) {

        //1-verilen iki sayiyi toplayan methodu olusturunuz.
        add(20, 54);

        //2-verilen iki sayiyi carpan methodu yaziniz
        multiply(45,12);

        //3) Verilen 3 sayidan ilk ikisini carpan ve sonucu
        // ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz.
        System.out.println("firstTwoMultiplyThirdAdd (2,3,5) = " + firstTwoMultiplyThirdAdd(2, 3, 5));

        //yukaridaki gibi yazdiktan sonra asagi tarafi elimizle yazmamiza gerek yok kirmizi yanan yerin uzerine
        //gidip oradan direk sectigimizde asagiya kendisi olusturuyor

        // 4) Verilen bir ondalikli sayisinin kupunu hesaplayip kullandiran bir method olusturunuz
        //System.out.println("kup (5,6) = " + getCup(5));
        double sayininKupu = getCup(5);
        System.out.println("sayininKupu = " + sayininKupu);

        //5-dairenin cevresini olusturan methodu olusturunuz ve kullaniniz
        System.out.println("daireninCevresiMethodu (2) = " + daireninCevresiMethodu(2));

    }

    private static int daireninCevresiMethodu(int r) {
        return 2*314*r/100;
    }


    private static double getCup(int v) {
        return v*v*v;
    }

    public static int firstTwoMultiplyThirdAdd(int a, int b, int c) {
        return a*b+c;

    }

    private static void multiply(int a, int b) {
        System.out.println(a*b);
    }

    private static void add(int a, int b) {
        System.out.println(a+b);
    }

    //  static void add(int a, int b) {
    //        System.out.println(a+b);
    //    } default ta bas taraftaki kisim bos kalir


}
