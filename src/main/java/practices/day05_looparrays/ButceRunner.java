package practices.day05_looparrays;

public class ButceRunner {
    public static void main(String[] args) {

        C02_Butce baba = new C02_Butce();
        System.out.println("maas oncesi butce" + C02_Butce.butce);

        baba.maasAl(30000);
        System.out.println("maas sonrasi butce" + C02_Butce.butce);

        baba.harclikAl(100);
        baba.harcliktanHarca(80);
        System.out.println(C02_Butce.butce);

        C02_Butce anne = new C02_Butce();
        anne.maasAl(50000);

        anne.harclikAl(500);
        anne.harcliktanHarca(500);
        System.out.println(C02_Butce.butce);
        System.out.println(anne.harclik);

        C02_Butce cocuk = new C02_Butce();
        cocuk.harclikAl(200);
        cocuk.harcliktanHarca(180);
        System.out.println(C02_Butce.butce);
        System.out.println(cocuk.harclik);

    }
}
