package javaders.day08stringmanipulations;

public class C01_StringManipulations {
    public static void main(String[] args) {
        //********************replaceFirst*************************//
        /*
        replaceFirst () : replace ile ayni isi yapmakla birlikte ilk gordugu datayi degistirir.
         */

        String str = "Bizimle Java ogrenmek cok kolay";

        String a1 = str.replace("i","e");
        System.out.println("a1 = " + a1);
        System.out.println("**************************");
        //ex-1 :a harflerinin yerine e harfi yerlestiriniz
        String a= str.replaceFirst("i","e");
        System.out.println("a = " + a);

        //**********************trim()******************
        /*
        trim() Bir string de bastaki ve sondaki space karekterlerini siler ortada ki space karekterlerine
        dokunmaz.String bir data dondurur.
         */

        String name = "    Omer Faruk Tufan    ";
        System.out.println(name);

        //ex-2: bastaki sondaki olan spaceleri silin
        String name1 = name.trim();
        System.out.println(name1);

        // Ex : Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        // String tv =599.99$            String laptop = 299.99$
        String tv = "599.99$";
        System.out.println("tv = " + tv);
        String pc = "299.99$";
        System.out.println("pc = " + pc);

        String tv2 = tv.replace("$","");
        System.out.println("tv2 = " + tv2);
        String pc2 = pc.replace("$","");
        System.out.println("pc2 = " + pc2);

        Double toplamPrice = Double.valueOf(tv2)+Double.valueOf(pc2);
        System.out.println("toplamPrice = " + toplamPrice);

        // Ex : Verilen ismin ilk isminin ilk harfini
        // ve soyisminin ilk harfini ekrana yazdiriniz

        char first = name.trim().toUpperCase().charAt(0);
        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
        char third = name.trim().toUpperCase().split(" ")[2].charAt(0);
        System.out.println("ilk harfler = " + first + second + third);

    }
}
