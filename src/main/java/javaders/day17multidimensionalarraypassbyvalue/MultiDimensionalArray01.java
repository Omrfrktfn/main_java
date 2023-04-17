package javaders.day17multidimensionalarraypassbyvalue;

import javaders.day04memorykullanimiwrapperclass.Araba;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    /*
    1-Bir array'in elemanlari'da array olursa bu tarz arraylere "multidimensional array" denir
     */
    public static void main(String[] args) {

        //Muldidimensional array'lere eleman nasil eklenir.
        String names[][] = new String[3][2];
        names[1][0] = "P";
        names[2][1] = "Z";
        names[0][0] = "A";
        names[0][1] = "K";
        names[1][1] = "M";
        names[2][0] = "C";

        //Multidimensional arrayleri consola yazdirmak icin toString metodu degil deepToString methodunu kullaniniz.
        //toString methodu sadece bir duvari asar fakat ic ice olanlarda deep derinlemesine olan kullanilir.
        System.out.println(Arrays.deepToString(names));

        //Multidimensional Array icinden specific bir eleman nasil yazdirilir.
        System.out.println(names[1][1]);

        //Multidimensional Array icindeki bir Array'i yazdirmak.
        System.out.println(Arrays.toString(names[0]));
        System.out.println(Arrays.toString(names[1]));
        System.out.println(Arrays.toString(names[2]));

        System.out.println("****************************************************");
        //Kisa yoldan multidimensional array nasil olusturulur.
        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};
        //Bu sekilde icerilerine farkli sayida koyabiliriz.Diger turlu yukarida belirttigmiz syai kadar gireriz

        //EX yukaridaki students array'in de toplam kac isim oldugunu bulunuz.
        int sum = 0;
        for (String[] w : students) {
            sum = sum + w.length;
        }
        System.out.println(sum);

        //ex2 Yukaridaki students array'in de icinde "m" olan isimleri concola yazdiriniz.
        for (String[] w : students) {
            for (String k : w) {
                if (k.contains("m")) {
                    System.out.println(k);
                }
            }
        }

        //Bir integer multidimensional array olusturunuz tum elemanlarin carpimini hesaplayiniz.
        int nums[][] = {{5, 4}, {2, 3, 2}, {7}};
        int sum1 = 1;

        for (int[] w : nums) {

            for (int k : w) {

                sum1 = sum1 * k;
            }
            System.out.println(sum1);

        }

        System.out.println("***********************");
        //Iki boyutlu bir array'i tek boyutlu bir array e ceviriniz
        int numbers[][] = {{5, 4}, {2, 3, 2}, {7}};//==> {5 4 2 3 2 7} sekline cevirme

        //1.step iki boyutlu array'de kac eleman oldugunu bulan kodu yazmaliyiz.
        int toplamElemanSayisi = 0;

        for (int[] w : numbers) {
            toplamElemanSayisi = toplamElemanSayisi + w.length;
        }

        //2.step Tek boyutlu array'i iki boyutlu array'in eleman sayisini kullanarak olusturmaliyiz.

        int newArr[] = new int[toplamElemanSayisi];

        //3.step iki boyutlu array'de ki elemanlari tek boyutlu array'e transfer etmeliyim
        int idx = 0;
        for (int[] w : numbers) {
            for (int k : w) {
                newArr[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));

        System.out.println(" **************************************** ");
        //example bir integer multidimensional array'de ki en buyuk ve en kucuk elemanin toplamini bulunuz
        int ages[][] = {{15, 4}, {12, 43, 21}, {7}};

        int small = ages[0][0];
        int tall = ages[0][0];
        for (int[] w : ages) {
            for (int k : w) {
                small = Math.min(small, k);//en kucugu bulmak icin
                tall = Math.max(tall, k);
            }
        }
        System.out.println(small);
        System.out.println(tall);
        System.out.println("toplam : " + (small + tall));



    }
}

