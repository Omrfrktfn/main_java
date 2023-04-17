package introduction.teamornekleri;

import java.util.Scanner;

public class deneme1 {
    public static void main(String[] args) {
        //Ekrana 10 kez "Java guzeldir" yazdirin

        String m = "Java guzeldir";
        for (int i =1;i<11;i++){
            System.out.println(m);
        }


        //10 ile 30 arasindaki sayilari aralarinda virgul olarak ayni satira yazdirin

        for (int i = 10;i <31;i++){
            System.out.print(i + " , ");
        }
        System.out.println(" ");
        //100'den baslayarak 50'ye kadar olan sayilari aralarinda virgul olarak ayni satirda yazdirin

        for (int i =100;i>49;i--){
            if (i%2==0){
                System.out.print(i +" -");
            }

        }
        System.out.println(" ");

        //Kullanicidan 100'den kucuk bir tamsayi isteyin. 1'den baslayarak girilen sayiya kadar 3'un kati olan
        //sayilari yazdirin.
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen 100'den kucuk bir tam syai giriniz...");
        int a = input.nextInt();
        for (int i =1; i<=a;i++){
            if (i%3==0){
                System.out.print(i+ "-");
            }
        }

        System.out.println(" ");
        //Kullanicidan 100'den kucuk bir tamsayi isteyin.1'den baslayarak girilen sayiya kadar 3'un
        //veya 5'in kati olan sayilari yazdirin
        System.out.println(" lutfen 100'den kucuk bir tam syai giriniz...");
        int a1 = input.nextInt();
        for (int i =1;i<=a1;i++){
            if (i%3==0 && i%5==0){
                System.out.print(i +"-");
            }
        }
        System.out.println(" ");

        /*
        Kullanicidan 100'den kucuk bir tamsayi isteyin.1'den basliyarak girilen sayiya kadar tum sayilari yazdirin
        Ancak;
        -sayi 3'un kati ise sayi yerine "java" yazdirin
        -sayi 5'in kati ise sayi yerine "Guzeldir" yazdirin...
        -sayi hem 3'un hem 5'in kati ise sayi yerine "Java Guzeldir" yazdirin.
         */

        System.out.println("lutfen bir tam syi giriniz...");
        int b = input.nextInt();

        for (int i =1; i<=b;i++){
            if (i%3==0){
                System.out.print("java");
            }else {
                System.out.print(i);
            }
        }
        System.out.println(" ");
        for (int i =1; i<=b;i++){
            if (i%5==0){
                System.out.print("java");
            }else {
                System.out.print(i);
            }
        }

        System.out.println(" ");
        for (int i =1; i<=b;i++){
            if (i%3==0 && i%5==0){
                System.out.print("java guzeldir");
            }else {
                System.out.print(i);
            }
        }

    }
}
