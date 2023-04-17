package javaders.day15loopsarrays;

import javaders.day04memorykullanimiwrapperclass.OgrenciEmrah;

import java.util.Arrays;

public class Arrays02 {
    /*
    1-Applicationlar'da data ile bu datalari isleyen kodlar birbirinden ayrilir.
    Yani logic data'ya bagimli olmamalidir.
    Data'ya bagimli olarak yazilan kodlara hard code denir.
    Hard code hatali kod demektir.
    Asagidaki grades array'in de son elemani almak icin 4 veya grade.length-1 kullanilabilir.
    4 kullanilirsa Array'e bir eleman eklendiginde kodunuz yanlis cikti verir. Ama length-1 kullanilirsa
    hep dogru sonucu alirsiniz.
     */
    public static void main(String[] args) {
        //Array'leri kisa yoldan nasil olusturabiliriz.
        //  int grades[] = new int[5]; // bes ogrenci notu girelim

        int grades[] = {67, 98, 100, 34, 76};
        System.out.println(Arrays.toString(grades));

        //grades array'in deki en kucuk ve en buyuk grade'in toplamini ekrana yazdiran kodu ekrana yadirin.

        Arrays.sort(grades); // kucukten buyuge siralama islemi yapar 34 67 76 98 100
        System.out.println(Arrays.toString(grades)); //
        System.out.println(grades[0] + grades[grades.length - 1]);


        System.out.println("********************************");
        //size verilen bir string array'deki isimlerden 5 character az character icerenleri consola yazdiriniz.

        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        for (String a : stdNames) {
            if (a.length() < 5) {
                System.out.println(a);
            }
        }

        System.out.println("*****************");
        //Example 3: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
        //           isilerden onceki isimleri console'a yazdiriniz

        Arrays.sort(stdNames);
        System.out.println(Arrays.toString(stdNames));
        for (String a : stdNames) {
            if (a.startsWith("F")) {
                break;
            }
            System.out.println(a);

        }
        System.out.println(" ************************************** ");
        //Example 4: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
        //           isilerden onceki isimleri ve f ile baslayanlari console'a yazdiriniz

        Arrays.sort(stdNames);
        System.out.println(Arrays.toString(stdNames));
        for (String a : stdNames) {
            System.out.println(a);
            if (a.startsWith("F")) {
                break;
            }

        }

        /*
        for (String t : stdNames){

            if (t.charAt(0)<='F'){
        System.out.println(t);
                }
            }
         */

        System.out.println(" ************************************** ");
        //Example 4: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
        //           isilerden haric diger isimleri  console'a yazdiriniz

        Arrays.sort(stdNames);// bu method numeric datalari kucukten buyuge dizer.oscending denir
        //Stringleri ise alfabetik sirada dize. Alphabeticall denir
        //oscending + alphabetical ==> natural order denir.
        System.out.println(Arrays.toString(stdNames));
        for (String a : stdNames) {

            if (a.startsWith("F")) {
                continue;
            }
            System.out.println(a);

        }
    }
}
