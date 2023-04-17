package introduction.teamornekleri;

import java.util.Scanner;

public class deneme2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir string deger giriniz...");

        String name = input.next();
        String newName = "";

        for (int i = name.length()-1;i>-1;i--){
            newName = newName + name.charAt(i);
            
            
        }
        System.out.print(newName + " ");

        System.out.println(" ");
        boolean polindrome = name.equalsIgnoreCase(newName);
        System.out.println("polindrome = " + polindrome);

        System.out.println("lutfen bir tam sayi giriniz");
        int a1=input.nextInt();
        System.out.println("Lutfen bir tam sayi daha giriniz.");
        int a2 = input.nextInt();
        int sum = 0;
       // int sum1 = 0;
        if (a1 < a2){
            for (int i = a1 ;i<=a2;i++){
                sum = sum+i;
            }
        } else {
            for (int i = a2 ;i<=a1;i++){
                sum = sum+i;
            }
        }
        System.out.println(sum);

        System.out.println("lutfen 10'dan kucuk bir tam sayi giriniz");
        int s =input.nextInt();
        int s1 = 1;
        
        for (int i =1; i<=s;i++){
            s1 = s1*i;
        }
        System.out.println("s1 = " + s1);

        




        

    }
}
