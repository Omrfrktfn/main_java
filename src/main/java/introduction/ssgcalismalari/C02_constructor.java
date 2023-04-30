package introduction.ssgcalismalari;

public class C02_constructor {

    String marka;
    String model;
    int fiyat;
    C02_constructor(String marka, String model, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;

        System.out.println(marka);
        System.out.println(model);
        System.out.println(fiyat);
    }


}
