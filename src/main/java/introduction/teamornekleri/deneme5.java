package introduction.teamornekleri;

import java.util.Arrays;

public class deneme5 {
    public static void main(String[] args) {

        String name [] = {"Ali","Veli","Ayse","Fatma"};
        System.out.println(Arrays.toString(name));

        System.out.println("**********************************");

        name [0]="Can";
        name [2]="Gul";
        System.out.println(Arrays.toString(name));

        System.out.println("**********************************");

        int number [] = {1,2,3};
       // int numberNew = number[0];
        System.out.println(Arrays.toString(number));

        number [0]=2;
        number [1]=3;
        number [2]=1;
        System.out.println(Arrays.toString(number));

        System.out.println("**********************************");


        int say [] = {5,2,3,7,9};
        int sum =0;
        for ( int w : say){
            sum=sum+w;
        }
        System.out.println("Toplamlari : " + sum);

        System.out.println("**********************************");

        int nums[][]= {{1,2,3},{4,5,6}};
        int sum1 =1;

        for (int[] w : nums){
            for (int k : w){
                sum1 = sum1*k;
            }
            System.out.println(sum1);
        }

        System.out.println("***************************************");




    }
}
