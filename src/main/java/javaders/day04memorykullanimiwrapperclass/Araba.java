package javaders.day04memorykullanimiwrapperclass;


public class Araba {


    public String model = "v60"; //variable'lar pasif ozellikler
    public String renk = "Beyaz";
    public int fiyat = 1500000;

    public static void main(String[] args) {
        /*
     Class ==> Variable (pasif ozellikler) ==>Object
           ==> Methodlar (Aktif ozellikler)

     */

        //Class + obje ismi + = + new + constructor==> class ismi ()
      //  Scanner input = new Scanner(System.in);
        Araba volvo = new Araba();

        hareket();//methodu asagiya otomotik olusturmak icin kirmizi olan yerin uzerine gelip o sekilde yapiyoruz
        stop();
        yakit();
        System.out.println("fiyat = " + volvo.fiyat);
        System.out.println("renk = " + volvo.renk);
        System.out.println("model = " + volvo.model);


    }

    private static void yakit() {
        System.out.println("volvolar az yakit tuketir...");
    }

    static void stop() {
        //hic bir sey yazmaksak default olur
        System.out.println("volvo guvenle durur...");
    }

    public static void hareket() {
        //aktif ozellikler
        System.out.println("volvo hizli gider...");

    }


}
