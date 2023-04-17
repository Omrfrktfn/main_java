package introduction.ssgcalismalari;

import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        //bir okul ismi donduren method olusturun
        //o okulun o yil aktif olmadigini dondurun
        //hangi yil oldugunu dondurun
        okulIsmiYazdir();
        isActiv();

    }
    public static void okulIsmiYazdir(){
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir okul ismi giriniz...");
        String okulIsmi = scan.nextLine();
        System.out.println(okulIsmi);
    }

    public static void isActiv(){
        Scanner scan = new Scanner(System.in);
        int suankiTarih=2023;
        System.out.println("lutfen girdiginiz okul"+suankiTarih+" tarihin de aktif ise lutfen girdiginiz okul aktif ise true degil ise false giriniz ...");
        boolean isActivmi = scan.nextBoolean();
        System.out.println(isActivmi);
    }




}
