package javaders.day11nestedifternaryswitch;

import java.util.Objects;
import java.util.Scanner;

public class Ternary04 {
    /*
    kullanicidan aldiginiz sayi cift ise yarisini  ekrana yazdiriniz. Tek ise bu sayi ikiye bolunmez yazdiriniz.
     */
    /*
    1-ternary'de true ve false durumlari icin size verilen data type'lari farkli ise olusuturdugunuz
    container'in data type'ini object yapin.
    2-Object java'da bir class'dir.
    3-Object java'daki butun class'larin parent'tidir. Yani babasidir.
    4-Object class'in parent'i yoktur.
    Java'da parent'i olmayan tek class Object Class'dir.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a integer...");
        int num = input.nextInt();

        //farkli data turunde sonuc aliniyorsa object ile alinir cunku object hepsi icin kullanilir.
        Object result = num % 2 == 0 ? num / 2 : "bu sayi ikiye bolunmez";
        System.out.println(result);

    }
}
