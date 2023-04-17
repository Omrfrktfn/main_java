package practices.day07_practice;

import java.util.Scanner;

public class C01_While {
    public static void main(String[] args) {
        // Kullanıcıdan sisteme bir rakam girmesini isteyiniz
        // kullanıcının girdigi sayının while loop kullanarak faktoriyelini bulunuz

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir rakam giriniz...");
        int number = input.nextInt();

        int num = 1;
        int faktoriyel = 1;

        while (num <= number) {

            faktoriyel = faktoriyel * num;
            num++;
        } System.out.println(number + "!= " + faktoriyel);


        System.out.println("***************************************************************");
    }
}
