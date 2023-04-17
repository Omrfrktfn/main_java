package javaders.day08stringmanipulations;

public class C02_StringManipulationsDeneme {
    public static void main(String[] args) {
        // **************** replaceFirst () ********************\\

        /*
        replace () ayni isi yapiyor ancak ilk gordugu datayi degistiriyor
         */
        String str = "Hayirli Olsunda ";

        // EX : str String'indeki ilk gorunen "a"'yi "e" ile degistiriniz
        String a = str.replaceFirst("a", "e");
        System.out.println("a = " + a);

        // *************************** trim () ******************************\\
        /*
        trim () bir String'deki basinda ve sonundaki space karakterlerini siler
        Aradaki spacelere dokunmaz.Saclar icin uclarindaki kiriklarin aldirilmasi gibi
        Cumledeki spacelerin silinmesi
         */

        //EX : str String'indeki bas ve sonda varsa space karakterlerini siliniz
        String str2 = "         Ali Can              ";
        System.out.println("str2 = " + str2);
        System.out.println("*********************");
        String b = str2.trim();
        System.out.println("b = " + b);
        System.out.println("**********************");

        // Ex : Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        // String tv =599.99$            String laptop = 299.99$
        String tv = "599.99$";
        System.out.println("tv = " + tv);
        String pc = "299.99$";
        System.out.println("pc = " + pc);

        String tv2 = tv.replace("$", "");
        System.out.println("tv2 = " + tv2); // 599.99
        String pc2 = pc.replace("$", "");
        System.out.println("pc2 = " + pc2);

        System.out.println(tv2 + pc2); //string oldugu icin concat yapar

        Double totlaprice = Double.valueOf(tv2) + Double.valueOf(pc2);
        System.out.println("totlaprice = " + totlaprice);
         /*
        valueOf() methodu String olan datayi bize sayi haline getirir
         */

        // Ex : Verilen ismin ilk isminin ilk harfini
        // ve soyisminin ilk harfini ekrana yazdiriniz

        String fullName = "Omer Faruk Tufan";
        System.out.println("fullName = " + fullName);
        char first = fullName.trim().toUpperCase().charAt(0);
        char second = fullName.trim().toUpperCase().split(" ")[1].charAt(0);
        char third = fullName.trim().toUpperCase().split(" ")[2].charAt(0);
        System.out.println("fullName = " + first + second + third);


    }
}
