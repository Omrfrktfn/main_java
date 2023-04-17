package javaders.day13incrementdecrementloops;

public class Loops02 {
    public static void main(String[] args) {
        //Verilen bir string'de kucuk harfleri yazmayiniz.
        String str = "Pwd12?Ab"; //==> P12?A
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                continue;//eger bu karekter kucuk harf ise hicbirsey yapmadan devam et'der.
            } else {
                System.out.print(ch);
            }

        }
        /*
        break ve continue arasindaki fark
        break switch'in disina cikmak icin veya loop'u kirmak icin kullanilir.
        Continue ise loop yaparken bazi elemanalri isleme sokamamak icin kullanilir.
         */

        System.out.println(" ");
        //Bir String'i tersten yazdiran kodu yaziniz
        String str2 = "Java";
        String ters = "";
        for (int i = str2.length() - 1; i >= 0; i--) {
            ters = ters + str2.substring(i, i + 1);
            //System.out.println(ters); burada yazdirma islemimizi yaparsak butun adimlari yazdirir
            //x
            //xe
            //xep
            //xepA
        }
        System.out.println(ters);

        //2.Way:
        System.out.println("********************");
        String u = "Java";
        String ters2 = "";

        for (int i = u.length() - 1; i >= 0; i--) {
            ters2 = ters2 + u.charAt(i);
        }
        System.out.println(ters2);

        System.out.println("*************************");
        //bir tam sayinin rakamlarini veren kodu yaziniz
        //578 ==>5+7+8+=20
        // int sayi = 578;
        int num = 0;
        int n = -578; // burada eksili olanlarida almak icin bu sekilde yaptik
        n=Math.abs(n);
        for (int i = n; i > 0; i = i / 10) {//azaltma iki turlu olur. burda kalan kismida lazim oldugu icin boyle yaptik
            num = num + i % 10;
        }
        System.out.println(num);

    }
}
