package practices.denemeler;

import java.util.Arrays;

public class ArraysDeneme {
    public static void main(String[] args) {

        //verilen bir integer array'de en kucuk pozitif ve en buyuk negatif elemani bulunuz.
        int arr[]={-12,18,-5,23,-2,0};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        if (contains(arr, 0)){

            System.out.println("bu arrayde 0 var 1, yol calisir");
            int minPozitif = 0;
            int maxNegatif = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0 && arr[i+2] > 0){
                    maxNegatif = arr[i];
                    minPozitif = arr[i+2];
                }
            }
            System.out.println("En kucuk pozitif sayi : "+minPozitif);
            System.out.println("En buyuk negatif sayi : "+maxNegatif);


        }else {

            System.out.println("bu arrayde 0 var 2, yol calisir");
            int minPositive = arr[arr.length-1];
            int maxNegative = arr[0];

            for (int w : arr){
                if (w  >=0)
                    minPositive = Math.min(minPositive, w);

                else
                    maxNegative=Math.max(maxNegative,w);
            }
            System.out.println("En kucuk pozitif sayi : "+minPositive);
            System.out.println("En buyuk negatif sayi : "+maxNegative);
        }



        System.out.println("*************2.yol***********************");


        System.out.println();


        for (int i = 100; i >= 0; i = i - 1) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


    }

    public static boolean contains(int [] array, int number){
        boolean result = false;
        for (int w : array){
            if (w == number)
                result =true;
        }
        return  result;
    }

}
