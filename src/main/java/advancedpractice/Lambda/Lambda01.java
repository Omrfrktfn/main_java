package advancedpractice.Lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {

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

        elemanlariyazdir1(nums);
        System.out.println(" ");

        elemanlariyazdir2(nums);
        System.out.println(" ");

        ciftElemanlar(nums);
        System.out.println(" ");

        ciftElemanlar2(nums);
        System.out.println(" ");

        tekSayiOlanKareleri(nums);
        System.out.println(" ");

        tekSayiKup(nums);
        System.out.println(" ");

        System.out.println(ciftKareToplami(nums));
        System.out.println(" ");

        benzersizCiftElKareCarpimiYazdir(nums);
        System.out.println(" ");

    }

    //1)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void elemanlariyazdir1 (List<Integer> nums){
     for (Integer w : nums) {
        System.out.print(w + " ");
    }
}

    //2)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void elemanlariyazdir2 (List<Integer> nums){
        nums.stream().forEach(t-> System.out.print(t + " "));
    }

    //3)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)

    public static void ciftElemanlar (List<Integer> nums){
        for (Integer w: nums ) {
            if (w%2==2){
                System.out.print(w+ " ");
            }
        }
    }

    //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void ciftElemanlar2 (List<Integer> nums){
       nums.stream().
               filter(t->t%2==0).
               forEach(t-> System.out.print(t+ " "));
    }

    //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void tekSayiOlanKareleri (List<Integer> nums){
        nums.stream().
             filter(t->t%2!=0).
                map(t->t*t).
                forEach(t-> System.out.print(t + " "));
    }

    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void tekSayiKup (List<Integer> nums){
        nums.stream().
                distinct().
                filter(t->t%2!=0).
                map(t->t*t*t).
                forEach(t-> System.out.print(t+ " "));
    }

    //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz
    public static int ciftKareToplami (List<Integer> nums){

        return nums.
                stream().
                distinct().filter(t-> t % 2 == 0).
                map(t-> t*t).
                reduce(Math::addExact).
                get();

// 456

    }

    //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz

    public static void benzersizCiftElKareCarpimiYazdir(List<Integer> nums) {
        Integer benzersizCiftKareToplam =
                nums.stream().
                        distinct().
                        filter(t->t%2 ==0).
                        map(t->t*t).
                        reduce(Math::multiplyExact).
                        get();//45158400

        System.out.println(benzersizCiftKareToplam);
    }

    //9)Liste ogelerinden max degeri veren bir method olusturunuz
    public static void listedenMaxYazdirMethodu(List<Integer> nums) {
        //firstway

    }

    //10)Liste ogelerinden minumum degeri veren method olusturunuz
}
