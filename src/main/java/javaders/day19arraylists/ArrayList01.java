package javaders.day19arraylists;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        /*
        1-Ayni data type'indaki coklu data'lari depolamak icin Array kullaniriz
        2-Array'lerin bir negatif yonu var; icine koyacaginiz eleman saisini en basta belirlemek zorundasiniz.
        3-Array'ler eleman sayisinda esnek degildirler, bu yuzden java arrayList adli yeni bir yapi olusturdu
            bu yapi eleman sayisinda esnek'dir.Hic eleman koymzsnai eleman sayisini sifir olarak ayarlar,1000
            eleman koyarsani eleman sayisini 1000 olarak ayarlar.
        4-ArrayList yerine sadece list'de diyebiliriz.
        5-Java ArrayList'leri olusturduktan sonra Array'leri iptal etmedi cunku;
            i-Array'ler super hizlidir.
            ii-Array'ler memory'de cok az yerler kaplar
        6-Array'ler primitive data type'lari ve reference'lari depolayabilir ama ArrayList'ler non-primitive data
        type'larini depolar bu yuzden ArrayList'ler Array'lerden daha cok yer kaplar
         */


        //ArrayList nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(ages);

        //ArrayList'e eleman nasil eklenir.

        //first way
        ages.add(12);
        ages.add(24);
        ages.add(9); // add methodu elemanlari giris sirasina(insertion order) gore list'e yerlestirir.
        System.out.println(ages);

        //second way
        ages.add(1, 99);//birinci index'ten sonra ekle manasinda
        System.out.println(ages);

        ArrayList<Integer> price = new ArrayList<>();
        price.add(23);
        price.add(33);

        //third way
        ages.addAll(price);//bir list'i diger bir list'in icine yerlestiriyor.
        System.out.println(ages);

        //fourth way
        ages.addAll(3, price);//3.index'ten sonra ekleme islemi yap

        //ArrayList'te eleman sayisi nasil bulunur.
        int numOfElement = ages.size();
        System.out.println("eleman sayisi : " + numOfElement);

        //ArrayList'te specific bir eleman nasil alinir.
        int el1 = ages.get(3);//23 vermeli 3.indexteki eleman
        //get methodu index kullanrak istedigimz methodu almaya yarar.
        System.out.println(el1);


        //ArrayList'lerde specific bir eleman nasil degistirilir.
        ages.set(6,111);//index'i alti olan elemani bul ve 111 ile degistir.
        System.out.println(ages);


        //Arraylist'te specific bir elemanin var olup olmadigini kontrol eder.
        boolean r1 = ages.contains(99);//ages list'inde 99 var mi diye souryor
        System.out.println(r1);

        //bir arrayList'in bos olup olmadigini nasil kontrol ederiz.
        boolean r2 = ages.isEmpty();
        System.out.println(r2);

        //Bir arraylist'tei tum elamanlari nasil sileriz.
        ages.clear();
        System.out.println(ages);

        boolean r3 = ages.isEmpty();
        System.out.println(r3);//true

        System.out.println("*******************************************");
        //ex-1 bir list'in bos olup olmadigini kontrol eden kodu yaziniz.
        ArrayList<String> name = new ArrayList<>();
        name.add("Ajda");
        name.add("Cuneyt");
        name.add("Angelina");
        name.add("Brad");

        if (name.size() == 0 ){
            System.out.println("list is empty...");
        }else {
            System.out.println("list' has at least one element...");
        }

        //second way
        //tavsiye edilen yol

        if (name.isEmpty() ){
            System.out.println("list is empty...");
        }else {
            System.out.println("list' has at least one element...");
        }


    }
}
