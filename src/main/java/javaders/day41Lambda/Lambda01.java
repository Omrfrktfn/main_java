package javaders.day41Lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(8);
        nums.add(9);
        nums.add(7);
        nums.add(-4);
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(15);

        System.out.println(getTheSumOfSquareOfOdds1(nums));
        System.out.println(getTheSumOfSquareOfOdds2(nums));
        System.out.println(getTheSumOfSquareOfOdds3(nums));

        System.out.println(getMultiplicatonOfSquareOfEvens(nums));
       System.out.println(getMultiplicatonOfSquareOfEvens1(nums));

        System.out.println(getTheSumOfEvenMaxAndOddMin(nums));
        System.out.println(getTheSumOfEvenMaxAndOddMin1(nums));

        System.out.println(getTheSumOfEvenLessThanSevenMaxAndOddMin(nums));

    }

    //ex-1 : Verilen bir list'teki tek sayi olan elemanlarin kareleri toplamini hesaplayan method olusturunuz.
    public static int getTheSumOfSquareOfOdds1(List<Integer> nums) {
        return nums.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                reduce(0, (t, u) -> t + u);
        //Note: reduce() methodundaki toplama isleminde "t" ilk parametrenin ilk degerini daha sonraki tum degerleri
        // toplamdan alir, "u" ise stream'den alir
    }

    public static int getTheSumOfSquareOfOdds2(List<Integer> nums) {
        return nums.
                stream().
                filter(utils::isOdd).
                map(utils::getSquare).//ihtiyacinin olan method java class'larinda yoksa utils class olusturup icinde
                        //ihtiyaciniz olan method'u olusturunuz ve method reference kullaniniz.
                reduce(0, Math ::addExact);//class ismi :: method ismi ; bu soz dizimine method reference denir.
        //Note: reduce() methodundaki toplama isleminde "t" ilk parametrenin ilk degerini daha sonraki tum degerleri
        // toplamdan alir, "u" ise stream'den alir
    }

    public static int getTheSumOfSquareOfOdds3(List<Integer> nums) {
        return nums.
                stream().
                filter(utils::isOdd).
                map(utils::getSquare).
                reduce( Math ::addExact).
                get();//optional integer'i integer'a cevirir
        //Note: reduce() methodundaki toplama isleminde "t" ilk parametrenin ilk degerini daha sonraki tum degerleri
        // toplamdan alir, "u" ise stream'den alir
    }

    //ex-2 : Verilen bir list'teki cift sayi olan elemanlarin tekrarsiz olarak kareleri carpimini hesaplayan method
    public static int getMultiplicatonOfSquareOfEvens(List<Integer> nums) {
        return nums.stream().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                distinct().
                reduce(1, (t, u) -> t * u);
    }


    public static int getMultiplicatonOfSquareOfEvens1(List<Integer> nums) {
        return nums.stream().
                filter(utils::isOdd1).
                map(utils::getSquare1).
                distinct().
                reduce(utils::getSquare2).
                get();
    }

    //ex-3 : Verilen bir list'teki cift sayi olan elemanlarin max degeri ile tek sayi olan elemanlarin min degerinin
    //toplamini hesaplaylan methodu olusturunuz.

    public static int getTheSumOfEvenMaxAndOddMin(List<Integer> nums) {
        int maxEven = nums.stream().
                filter(t -> t % 2 == 0).
                reduce((t, u) -> t > u ? t : u).
                get();

        int minOdd = nums.stream().
                filter(t -> t % 2 != 0).
                reduce((t, u) -> t < u ? t : u).
                get();

        return maxEven+minOdd;

        //reduce() methodunu etkisiz eleman kullanmadan kullanirsak data tipleri uyusmadigi icin hata verir(Optional Integer verir).
        // Burada reduce() methodundan sonra get() methodunu kullanmamiz gerekir

    }

    public static int getTheSumOfEvenMaxAndOddMin1(List<Integer> nums) {
        int maxEven = nums.stream().
                filter(utils::isOdd2).
                reduce(utils::getSquare3).
                get();

        int minOdd = nums.stream().
                filter(utils::isOdd3).
                reduce(utils::getSquare4).
                get();

        return maxEven+minOdd;

        //reduce() methodunu etkisiz eleman kullanmadan kullanirsak data tipleri uyusmadigi icin hata verir(Optional Integer verir).
        // Burada reduce() methodundan sonra get() methodunu kullanmamiz gerekir

    }

    //ex-3 : Verilen bir list'teki cift sayi olan elemanlarin 7'den kucuk max degeri ile tek sayi olan elemanlarin
    // 8'den buyuk min degerinin toplamini hesaplaylan methodu olusturunuz.

    public static int getTheSumOfEvenLessThanSevenMaxAndOddMin(List<Integer> nums) {
        int max = nums.stream().
                distinct().
                filter(t -> t % 2 == 0 && t<7).
                reduce((t, u) -> t > u ? t : u).
                get();

        int min = nums.stream().
                distinct().
                filter(t -> t % 2 != 0 && t>8).
                reduce((t, u) -> t < u ? t : u).
                get();

        return max + min;
    }
}
