package practices.denemeler;

public class Q01_Variables {
    public static void main(String[] args) {
        //Bir variable baslat
        int age = 25;
        int number = 55;
        String name = "omer";

        System.out.println(age);
        System.out.println("number = " + number); // number.soutv ile variablenin adi ve degeri ile birlikte yazar .
        System.out.println("name = " + name);

        //kodu duzeltmenin kisa yolu code bolumunden reformat code yada ctrl alt L yaparsak da duzelir

        //Variable degerini kopyala
        int hisAge = age;
        System.out.println("hisAge = " + hisAge);
        String herName = name;
        System.out.println("herName = " + herName);

        //ayni satirda coklu variable deklere et
        int year = 2022, month = 3, day = 15;
        System.out.println("year = " + year);
        System.out.println("day = " + day);
        System.out.println(year + " " + month + " " + day);

        //Bir variable degerini guncelleme
        year = 2023;
        System.out.println("year = " + year);
        year = year +2;
        System.out.println("year = " + year);


        //ORNEK-1
        //Bir variable deklere et : x
        double x;
        //Bir variable başlat : y
        double y= 10.2;
        //Başka bir variable başlat : z
        double z=20.5;
        //x değişkenini y değişkeni ile başlat
        x = y;
        //X degiskenini güncelle
        x=3.14;
        //Değişkenleri yazdır
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }

}
