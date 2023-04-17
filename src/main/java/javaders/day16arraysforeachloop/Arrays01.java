package javaders.day16arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        //Kullanicinin coklu datayi bir array'e yerlestirebilmesi icin gereken kodu yaziniz.
        /*
        Bir kullanicidan data almak icin scanner object olusturmaliyim
        coklu data'yi yerlstirmek icin bir Array olusturmaliyim
        Array olusturabilmek icin kullanicidan Array'a kac tane eleman koyacagini almaliyim
        Loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyim
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of elements you want to add...");
        int numOfElements = input.nextInt();
        String stdName[] = new String[numOfElements];

        for (int i = 0;i<stdName.length;i++){
            System.out.println("enter the " + (i+1) + ".student name");
            System.out.println("To stop adding press 'q' " );
            String name = input.next();

            if (name.equalsIgnoreCase("q")){
                break;
            }else {
                stdName[i] = name;
            }
        }
        System.out.println(Arrays.toString(stdName));
    }
}
