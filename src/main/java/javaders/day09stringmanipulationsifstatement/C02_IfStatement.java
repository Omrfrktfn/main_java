package javaders.day09stringmanipulationsifstatement;

public class C02_IfStatement {
    public static void main(String[] args) {
        //interwiew questions QA
        //String str = "abbccdc"; tekrarsiz karakterleri ekrana yazdiriniz.
        /*
        indexOf ve lastIndexOf methodu bir birine esitse tekrarsizdir.
         */

        /*
        ifStatement : Bazen kodlarin calismasi belirli kosullara baglidir.Mesela cok calisirsam, java ogrenecegim
        java ogrenme eylemi cok calisma eylemine baglanmistir.
        Birinci eylem gerceklesmeden ikinc eylem gerceklesmez.

         */
        String str = "aac";
        char ch = str.charAt(0);
        if (str.indexOf(ch) == str.lastIndexOf(ch)) {
            System.out.println(ch);
        }
        char ch1 = str.charAt(1);
        if (str.indexOf(ch1) == str.lastIndexOf(ch1)) {
            System.out.println(ch1);
        }
        char ch2 = str.charAt(2);
        if (str.indexOf(ch2) == str.lastIndexOf(ch2)) {
            System.out.println(ch2);
        }

        System.out.println("***********************************");
        String str1 = "abbccdc"; //tekrarsiz karakterleri ekrana yazdiriniz.

        char a = str1.charAt(0);
        if (str1.indexOf(a) == str1.lastIndexOf(a)) {
            System.out.println(a);
        }

        char b = str1.charAt(1);
        if (str1.indexOf(b) == str1.lastIndexOf(b)) {
            System.out.println(b);
        }

        char c = str1.charAt(3);
        if (str1.indexOf(c) == str1.lastIndexOf(c)) {
            System.out.println(c);
        }

        char e = str1.charAt(5);
        if (str1.indexOf(e) == str1.lastIndexOf(e)) {
            System.out.println(e);
        }

        System.out.println("******************");
        //sayi pozitif ise ekrana poztif sayi yazdiran kodu yazdiriniz
        int num = 20;
        if (num > 0) {
            System.out.println("Pozitif sayi");
        } else {
            System.out.println("Girlen deger hatali");
        }

        System.out.println("*********************************");
        //sayi eksi bir ile on arasinda ise ekrana rakam yazdirin
        int sayi = 1;
        if (sayi > -1 && sayi < 10) {
            System.out.println("Girilen sayi rakamdir");
        } else {
            System.out.println("Girilen sayi rakam degildir.");
        }

        System.out.println("*****************************************");
        //sayi uc basamaki ise ekrana sayi uc basamaklidir yazdiririnz
        int sayi1 = 23;
        sayi1 = Math.abs(sayi1); // sayi eksili ise eksi ifadeyi siler.
        /*
        Math clasi onemli bir class'dir. Icerisinde bir cok method barindiri.
        Math.abs icerisine arguman olarak verilen sayinin mutlak degerini yani pozitif halini verir.
         */
        if (sayi1 > 99 && sayi1 < 1000) {
            System.out.println("Girilen sayi uc basamaklidir");
        }else {
            System.out.println("Girilen sayi uc basamakli degildir");
        }



    }
}
