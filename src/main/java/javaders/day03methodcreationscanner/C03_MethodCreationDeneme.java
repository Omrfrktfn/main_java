package javaders.day03methodcreationscanner;

public class C03_MethodCreationDeneme {

    public static void main(String[] args) {
        //dikdortgenin alanini hesaplayan bir method olusturunuz;
        dikdortgeninAlani(10, 20 );

        //karenin alanini hesaplatan methodu yazini
        int solution = kareAlani(10);
        System.out.println("solution = " + solution);

    }

    private static int kareAlani(int a) {
        return a * a;
    }

    private static void dikdortgeninAlani(int a, int b) {
        System.out.println("alan cevap=" +a * b);
    }
}
