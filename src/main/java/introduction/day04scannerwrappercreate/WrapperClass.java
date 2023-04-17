package introduction.day04scannerwrappercreate;

public class WrapperClass {

    public static void main(String[] args) {

        //primitive :     char         boolean    byte    short   int       long     float     double
        //Wrappe Class:  Chareacter    Boolean    Byte     Short  Integer    Long     Float     Double
        //Not wrapper classlar buyuk hafr ile baslar

        // Wrapper Class lar non primitiv dir. O yuzden memory de cok yer kaplar
        //o yuzden sart degil kullanmayi bilmeliyiz

        int n = 12;
        Integer m = 12; // non primitive yapiyoruz
        //bu satirda n. yaptigimizda methot goremeyiz cunku primitivler methot icermez
        //ama m. yaptigimizda methotlari gorucez ve onlari kullanicaz bunlar wrapper class dir.

        //ornek-1 : short data type nin minumum ve max degerleriniz bulunuz

        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);
        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);

        //ornek -2 int data type nin min degeri ile byte data type nin max degerininin toplamlarini bulunuz

        int minInt = Integer.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;


        System.out.println("toplam : " + minInt + maxByte);

        //ornek-3 primitive int i warapper integer a ceviriniz.
        int num = 13;
        Integer wrapperNum = num; // primitive olan num nonprimitive cevrildi suan

        //bu islem inteviewler de sorulabiliyor Autoboxing denir

        // wrapper Byte i primitive byte a ceviriniz
        Byte k = 33;
        byte primitveK = k;//methoddan cikartik sadece deger kaldi
        // buna da Unboxing denir. Kutudan cikarma metoddan cikarma

        /*
        Wrapper bir kutu icinde bazi methodlarla birlikte bulunana degeri alarak primitve yani method
        bulunmayan bir kutuya atarma yaparsak bu isleme Unboxing denir

        ptimitve yani method bulunmayan bir kutudaki degeri alarak icinde bazi methodlar bulunan wrapper
        kutuya atama yaparsak bu isleme Autoboxing denir.

         */

        //primitive chari wrapper character e ceviriniz
        char initial= 'd';
        Character initialWrapper= initial; //Bu islemin adi Autoboxin dir

        //wrapper booleani primitve booleana ceviriniz
        Boolean isOld=true;
        boolean isOldPr= isOld;
    }
}
