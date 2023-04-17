package practices.day05_looparrays;

import java.util.Scanner;

public class C01_cdenOncekia {
    public static void main(String[] args) {

        /*
              Kullanıcıdan aldığınız 'c' ve 'a' iceren bir String değer içerisindeki
             'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen c ve a iceren string bir deger giriniz... ");
        String str = input.nextLine().toLowerCase();

        int counter = 0;

        for (int i = 0; i <str.indexOf("c") ; i++) {
            if (str.charAt(i)=='a'){
                counter++;
            }
        }
        System.out.println("c'den once bulunan " + counter+ " adet a vardir");

        System.out.println("*********************second way*********************************");

        int sayac = 0;
        if (str.contains("c") && str.contains("a")){

            for (int i = 0; i <str.length() ; i++) {
                if (str.charAt(i)=='a'){
                    sayac++;
                } else if (str.charAt(i)=='c') {
                    break;
                }
            }
            System.out.println("ikinci yol ile;c'den once bulunan " + sayac+ " adet a vardir");

        }else {
            System.out.println("lutfen c ve a harflerini iceren kelime giriniz...");
        }

        System.out.println("*******************************************************************");





    }
}
