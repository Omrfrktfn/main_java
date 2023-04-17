package javaders.day13incrementdecrementloops;

public class ForLoopDeneme01 {
    public static void main(String[] args) {
        //ex-1 21'den 180'e kadar hem dort hem de alti ile bolunebilen tam sayilari ekrana yazdirna kodu yaziniz.

        for (int i = 21; i < 180; i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + "-");
            }

        }

        System.out.println(" ");
        //ex-2 Size verilen kucuk harfle yazilmis stringi'in indexi cift sayi olan characterlerini
        //buyuk harfe donusturunuz.

        /*
        Bir string'de son index her zaman length-1'dir.Cunku index'ler sifir ile baslar.
        Yazdiginiz kod belli senaryolar icin calisiyor ancak tum senaryolar icin calismiyorsa bu tarz koda
        hard-code denir ve mutlaka duzeltilmelidir.
         */
        String a = "ankara";
        for (int i = 0; i < a.length(); i++) {
            String ch = a.substring(i,i+1);//tek tek tum indexleri kontrol etmek icin
            if (i % 2 == 0) {
                System.out.print(ch.toUpperCase());
            }
        }
        System.out.println(" ");

    }
}
