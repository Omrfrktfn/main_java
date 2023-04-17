package javaders.day32maps;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {

        HashMap<String , Integer> stdAges = new HashMap<>();

        stdAges.put("Ajda" , 77);
        stdAges.put("Ezel" , 38);
        stdAges.put("Tom" , 76);
        stdAges.put("Brad" , 58);
        stdAges.put("Angelina" , 58);
        stdAges.put("Tom" , 83);//key'i tekrarli kullandigimizda hata vermez en son verdiginizi kabul eder.
        //Bu yontem value guncellemede kullanilabilir. Bu isleme "overwrite" denilir

        //HashMap'ler entry'leri rastgele siralar bu yuzden cok hizli calisir.
        //Map'ler entry'leri siralarken key'lere bakarak siralama yapar
        System.out.println(stdAges);

        stdAges.replace("Ezel", 39);//ezelin 38 olan degeri 39 olur .valualeri uptdate etmek icin kullanilir.
        System.out.println(stdAges);

        //stdAges.replace("Angelina", 58,61); methodu map'in icinde Angelina 57 varsa 57'yi 61'e donusturur
        stdAges.replace("Angelina", 58,61);
        System.out.println(stdAges);

        //   stdAges.putIfAbsent("Ali", 60); methodu map'ta Ali key olarak yoksa map'e Ali 60 olarak ekleme yapar
        stdAges.putIfAbsent("Ali", 60);//yoksa ekleme yapar.
        System.out.println(stdAges);

       // System.out.println(stdAges.get("Tom")); her ikiside tom'un degerini verir
       // System.out.println(stdAges.getOrDefault("Tom",0));// farkli ise biri null biri 0 verir

        //System.out.println(stdAges.getOrDefault("Ayse",0)); map'te var olan key'ler icin get methodu ile ayni
        //ciktiyi verir. Map'ta olmayan key'ler icin ise get olan null getOrDefault olan 0 verir.
        System.out.println(stdAges.get("Ayse"));//null verir
        System.out.println(stdAges.getOrDefault("Ayse",0));//0 verir

        //containsValue(77); methodu value'larin icerisinde 77 olup olmadigini kontrol eder.
        System.out.println(stdAges.containsValue(77));//True
        System.out.println(stdAges.containsValue(99));//False

        //containsKey("Ali"); methodu key'lerin icerisinde Ali olup olmadigini kontrol eder.
        System.out.println( stdAges.containsKey("Ali"));

        //containsKey("Ali"); methodu key kullanarak entry'i silmeye yarar.
        stdAges.remove("Ali");
        System.out.println(stdAges);

       // stdAges.remove("Tom", 83); methodu map'te key'si Tom Valuesi 81 olan bir entry varsa onu siler
        stdAges.remove("Tom", 83);
        System.out.println(stdAges);

        HashMap<String , Integer> kidsAges = new HashMap<>();
        kidsAges.put("John",12);
        kidsAges.put("Jim",22);
        kidsAges.put("Jack",32);

        stdAges.putAll(kidsAges);//bir map'i diger map'in icine koymaya yarar.
        System.out.println(stdAges);//{Angelina=61, John=12, Ajda=77, Brad=58, Jack=32, Ezel=39, Jim=22}

    }

}
