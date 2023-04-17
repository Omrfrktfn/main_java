package practices.day11_practice;

public class C02_Static {

    static String okulIsmi="Yildiz Koleji"; //instancelerde basina birsey yazilmaz

    static int okulNo;

    static boolean okulAcikMi;


    public static void main(String[] args) {

             /*

             okulIsmi, okulNo, okulAcikMi seklinde uc tane static variable olusturalım.
             Bu static variable'leri main icerisinde yazdıralım

            */


        //Static variable'lara class icerisindeki tum methodlardan direk ulasabiliriz.

        System.out.println(okulIsmi);//static variablelre class icindeki tum methodlardan ulasabiliriz
        System.out.println(okulNo);
        System.out.println(okulAcikMi);


        //static variable'lar gokteki ay gibidir.
        //static variable'lar class'a baglidir.
        //static variable'larin degeri bir kisi tarafindan degistirilirse herkes icin degisiklige ugrar.

        okulNo=102;
        System.out.println(okulNo);

        staticMethod();
        System.out.println(okulNo);//200

    }


    private static void staticMethod() {

        okulNo=200;

        System.out.println(okulNo);//200
    }
}
