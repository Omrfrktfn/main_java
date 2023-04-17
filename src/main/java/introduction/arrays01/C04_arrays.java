package introduction.arrays01;

import java.util.Arrays;

public class C04_arrays {

    public static void main(String[] args) {

        int arr[]={42,37,20,90,15};
        maxSayiYazdir(arr);
    }
    public static void maxSayiYazdir(int[] arr){
          //  Arrays.sort(arr);
           // System.out.println(Arrays.toString(arr));
          //  System.out.println(arr[arr.length-1]);

        int maxSayi = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>maxSayi){
                maxSayi=arr[i];
            }
        }
        System.out.println(maxSayi);
    }

}
