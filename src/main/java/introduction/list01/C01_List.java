package introduction.list01;

import java.util.*;

public class C01_List {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(15);
        myList.add(30);
        myList.add(42);
        System.out.println(myList);

        myList.add(2, 27);
        System.out.println(myList);

        System.out.println("**************************************************");

        List<String> sehirler = new ArrayList<>();
        sehirler.add("Mersin");
        sehirler.add("Amasya");
        sehirler.add("Ankara");
        sehirler.add("Izmir");

        System.out.println(sehirler);
        Collections.sort(sehirler);
        System.out.println(sehirler);

        System.out.println("***************************************************");

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(36);
        sayilar.add(42);
        sayilar.add(64);
        sayilar.add(21);

        int sum = 0;
        for (Integer a : sayilar) {
            sum += a;
        }
        System.out.println(sum);

        System.out.println("****************************************************");

        List<Integer> dogalSayilar = new ArrayList<>();
        dogalSayilar.add(28);
        dogalSayilar.add(33);
        dogalSayilar.add(46);

        int sum1 = 0;
        for (int i = 0; i < dogalSayilar.size(); i++) {
            if (dogalSayilar.get(i)%2==0){
                sum1+=dogalSayilar.get(i);
            }
        }
        System.out.println(sum1);

        System.out.println("******************************************************");

        List<Integer> number= new ArrayList<>();
        number.add(1);
        number.add(3);
        number.add(5);
        number.add(3);
        number.add(5);
        number.add(6);
        number.add(1);
        number.add(7);

        System.out.println(tekrarsizListOlustur(number));

        System.out.println("*********************************************************");

        List<Double>number1=new ArrayList<>();
        number1.add(1.0);
        number1.add(3.0);
        number1.add(4.5);
        number1.add(5.4);
        number1.add(6.2);
        number1.add(10.5);
        number1.add(1.1);
        number1.add(5.6);

        double toplam=0.0;
        double ortalama=0.0;

        for (int i = 0; i < number1.size(); i++) {
            toplam+=number1.get(i);
        }
        System.out.println(toplam);
        ortalama=toplam/number1.size();
        System.out.println(ortalama);
        int counter=0;

        for (int i = 0; i < number1.size(); i++) {
            if (number1.get(i)>ortalama){
                System.out.println(number1.get(i));
                counter++;
            }
        }
        System.out.println("adet sayisi : " + counter);

        System.out.println("********************************************");

        Random randomnumber2=new Random();
        int num =0;
        List<Integer>sayiListesi=new ArrayList<>();
        while (sayiListesi.size()<200){
            num=randomnumber2.nextInt(1000);
            if (!sayiListesi.contains(num)){
                sayiListesi.add(num);
            }
        }
        System.out.println(sayiListesi);

        Scanner scan = new Scanner(System.in);
        int kalanTahmin = 5;
        int tahminSayisi = 0;
        int tahmin = scan.nextInt();
        if (sayiListesi.contains(tahmin)){
            System.out.println("listin icinde var ");
        }else {
            System.out.println("listin icinde yok");
        }
        do {
            System.out.println("lutfen tahminde bulunmak icin syi giriniz");
            num=scan.nextInt();
            if (sayiListesi.contains(num)){
                System.out.println("tebrikler dogru tahminde buldunuz");
                break;
            }
            kalanTahmin--;
        }while (kalanTahmin>0);
        if (kalanTahmin==0){
            System.out.println("Malesef bulamadiniz...");
        }

    }

    public static List<Integer> tekrarsizListOlustur(List<Integer>x){
        List<Integer>tekrarsizList= new ArrayList<>();
        for (int i = 0; i < x.size(); i++) {
            if (!tekrarsizList.contains(x.get(i))){
                tekrarsizList.add(x.get(i));
            }
        }
        return tekrarsizList;
    }

}
