package advancedpractice.Lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        allEvenPrint(nums);
        System.out.println(" ");

        anyMatchOdd(nums);
        System.out.println(" ");

        enKucukAtla(nums);
        System.out.println(" ");

        ciftElemanlar(nums);
        System.out.println(" ");

        tekSayiOlanKareleri(nums);
        System.out.println(" ");

        tekSayiKup(nums);
        System.out.println(" ");

        ciftKareToplami(nums);
        System.out.println(" ");

        benzersizCiftSayilarinKareCarpimiYazdir(nums);
        System.out.println(" ");

        maxDeger(nums);
        System.out.println(" ");

        minDeger(nums);
        System.out.println(" ");






    }//main

    //1)  Bir listedeki elemanların hepsinin çift sayı olup olmadığını kontrol eden method'u oluşturunuz.

    public static void allEvenPrint(List<Integer> nums) {
        boolean even = nums.stream().
                allMatch(t -> t % 2 == 0);
        System.out.println(even);
    }


    //2)  Bir listedeki elemanların herhangi birinin tek sayı olup olmadığını kontrol eden method'u oluşturunuz
    public static void anyMatchOdd (List<Integer> nums) {
        boolean odd = nums.stream().
                anyMatch(t -> t % 2 != 0);
        System.out.println(odd);
    }

    //3)  Bir listedeki en kucuk ilk 3 eleman haricindekilere %50 artis yapan method'u oluşturunuz.
    public static void enKucukAtla (List<Integer> nums) {

        nums.stream().sorted().forEach(t-> System.out.print(t+" "));
        System.out.println();
       nums.stream().
                sorted().
               skip(3).
               map(t->t*1.5).
               forEach(t-> System.out.print(t+" "));

    }


    //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.
    public static void ciftElemanlar (List<Integer> nums){
        nums.stream().
                filter(t->t%2==0).
                forEach(t-> System.out.print(t+ " "));
    }

    //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.
    public static void tekSayiOlanKareleri (List<Integer> nums){
        nums.stream().
                filter(t->t%2!=0).
                map(t->t*t).
                forEach(t-> System.out.print(t + " "));
    }

    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.
    public static void tekSayiKup (List<Integer> nums){
        nums.stream().
                distinct().
                filter(t->t%2!=0).
                map(t->t*t*t).
                forEach(t-> System.out.print(t+ " "));
    }

    //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz
    public static void ciftKareToplami (List<Integer> nums){

        Integer benzersizCiftKareToplam = nums.
                stream().
                distinct().
                filter(t-> t % 2 == 0).
                map(t-> t*t).
                reduce(Math::addExact).
                get();
        System.out.println(benzersizCiftKareToplam);
    }

    //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz
    public static void benzersizCiftSayilarinKareCarpimiYazdir (List<Integer> nums) {
        Integer benzersizCiftKareCarpimi =
                nums.stream().
                        distinct().
                        filter(t->t%2 ==0).
                        map(t->t*t).
                        reduce(Math::multiplyExact).
                        get();

        System.out.println(benzersizCiftKareCarpimi);
    }

    //9)Liste ogelerinden max degerini veren bir method olusturunuz
    public static void maxDeger( List<Integer> nums ){

        int maxDeger =
                nums.
                        stream().
                        distinct().
                        reduce(0,(t,u)->t>u?t:u);

        System.out.print(maxDeger);

    }

    //10)Liste ogelerinden minumum degerini veren method olusturunuz

    public static void minDeger( List<Integer> nums ){

        int minValue =
                nums.
                        stream().
                        distinct().
                        reduce(Integer.MAX_VALUE,(t,u)->t<u?t:u);

        System.out.println("minValue = " + minValue);

    }
}