package advancedpractice.day01;

public class RusRuleti {

    public static void main(String[] args) {

        int ilkSayi = -456;
        int ikinciSayi = -219;

        //  Math.abs(ilkSayi);//suan kullanmiyoruz cunku kullanicin verdigi data'yi degistirmis oluyoruz.
        System.out.println(carpim(ilkSayi, ikinciSayi));
    }

    private static int carpim(int ilkSayi, int ikinciSayi) {

        boolean negative = false;
        if (ilkSayi < 0) {
            ilkSayi = -ilkSayi;//kodun dogru calismasi icin negatif olursa pozitife cevirmis olduk
            negative = !negative;
        }
        if (ikinciSayi < 0) {
            ikinciSayi = -ikinciSayi;
            negative = !negative;
        }

        int toplam = 0;
        do {

            ilkSayi = ilkSayi / 2;
            ikinciSayi = ikinciSayi * 2;
            if (ilkSayi % 2 == 1) {
                toplam = toplam + ikinciSayi;//ilk sayi tek sayi ise ikinci sayi'yi toplam variabl'ina toplayarak ata
            }

        } while (ilkSayi >= 1);// ilkSayi 1 oluncaya kadar calis

        if (negative)
            toplam = -toplam;
            return toplam;

    }


}
