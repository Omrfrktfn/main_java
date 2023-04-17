package practices.day10_practice;

public class C03_Instance {

    int sayi;
    String bransIsmi="Java";
    boolean okuldaMi; ///false

    public static void main(String[] args) {

         /*

         sayi, bransIsmi, okuldaMi seklinde uc tane instance variable olusturalım.
         Bu instance variable'leri main icerisinde yazdıralım

        */

        //instance variablelere static method'dan ulasibilmek icin ibje olusturmamiz gerekir.
        C03_Instance obj1 = new C03_Instance();

        System.out.println(obj1.sayi);
        System.out.println(obj1.bransIsmi);
        System.out.println(obj1.okuldaMi);

        obj1.sayi=10;
        System.out.println(obj1.sayi);

        C03_Instance obj2 = new C03_Instance();

        System.out.println(obj2.sayi);

        obj1.bransIsmi="SQL";
        System.out.println(obj1.bransIsmi);

        System.out.println(obj2.bransIsmi);
    }
}
