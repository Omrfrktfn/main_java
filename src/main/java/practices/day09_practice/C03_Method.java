package practices.day09_practice;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Method {

    public static void main(String[] args) {

        /*
            kullanıcıdan bir cumle sisteme girmesini isteyiniz.
            method olusturarak cumlede gecen sesli harfleri konsola yazdırınız
            a e i o u
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("please write a sentences...");
        String cumle = scan.nextLine();

        String arr[] = cumle.split("");//butun harfleri tek tek bulmak icin hiclik'ten bolmeliyiz
        System.out.println(Arrays.toString(arr));

        sesliharfleriyazdir(arr);

    }

    public static void sesliharfleriyazdir(String[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equalsIgnoreCase("a")
            || arr[i].equalsIgnoreCase("e")
            || arr[i].equalsIgnoreCase("i")
            || arr[i].equalsIgnoreCase("o")
            || arr[i].equalsIgnoreCase("u")){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
