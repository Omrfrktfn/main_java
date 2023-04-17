package practices.day05_looparrays;

public class C02_Butce {
        /*
        // Tum aile uyelerinin birikiminin
        // bulundugu ortak ihtiyaclar icin
        // kullanildigi bir butce ile kisisel
        // harcamalarin yapildigi
        // harclik'larin oldugu basit bir ev bütçesi kodu yazınız.
         */

    public static int butce;
    public int harclik;

    public void maasAl(int aLinanMaas) {
        butce += aLinanMaas;
    }

    public void harclikAl(int aLinanHarclik) {
        butce -= aLinanHarclik; //ortakhesaptan harclik alinir. alan herkimse
        harclik += aLinanHarclik;//butceden alinan harcliga ekleniyor.
    }

    public void butcedenHarca (int hacanacakPara){
        butce-=hacanacakPara;
    }

    public void harcliktanHarca (int harclikHarcamasi){
        harclik -=harclikHarcamasi;
    }



}
