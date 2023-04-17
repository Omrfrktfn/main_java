package javaders.day04memorykullanimiwrapperclass;

import java.util.Scanner;

public class OrtalamaHiz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen alinan yolu girniz : ");
        int x = input.nextInt();

        System.out.println("lutfen toplam zamani giriniz : ");
        int y = input.nextInt();

        int ortalama = x/y;
        System.out.println("ortalama = " + ortalama);

        //eksik tam olmadi


    }


}
