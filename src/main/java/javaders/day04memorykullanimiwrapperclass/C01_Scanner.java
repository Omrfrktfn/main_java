package javaders.day04memorykullanimiwrapperclass;

import java.util.Scanner;

public class C01_Scanner {

    //kullanicidan aldiginiz bes basamakli bir sayinin ilk iki ve son iki basamagindaki sayilarin
    //toplamini yazdiran kodu olusturunuz
    //38671  3+6+7+1=19
    //38671 %10 ==> 1 fakat 38671/10 yaptigimizda virgulden sonrasini siler bize 3867 verir
    //daha sonrasinda 3867%10 yaptigimizda 7 yi elde ederiz

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bes basamakli bir sayi giriniz ...");
        int number = input.nextInt();
        int firstNumber = number%10;
        number = number/10;  // sayiyi kucultme islemi yapar

        int secondNumber = number%10;
        number = number/10;

        int thirdNumber = number%10;
        number = number/10;

        int fourtNumber = number%10;
        number = number/10;

        int fiftNumber = number%10;
        number = number/10;

        System.out.println("sonuc " + (firstNumber+secondNumber+fourtNumber+fiftNumber));

        /*
        int basamak5 = sayi%10;
        int basamak4 = (sayi/10)%10;
        int basamak3 = (sayi/100)%10;
        int basamak2 = (sayi/1000)%10;
        int basamak1 = (sayi/10000)%10;
         */


    }
}
