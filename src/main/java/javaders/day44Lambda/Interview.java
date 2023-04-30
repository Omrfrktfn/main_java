package javaders.day44Lambda;

import java.util.stream.IntStream;

public class Interview {

    public static void main(String[] args) {
/*
       INTERWIEW QUESTIONS
       Bir Array'in Mountain Array olup olmadığını kontrol eden bir kod yazınız.
       Mountain Array: Element değerleri bir noktaya kadar sürekli artıp o noktadan
       sonra sürekli azalan Array.
       int arr[]= {1,2,3,2,1}
       int brr[]= {1,3,7,11,8,7,3}
       int crr[]= {3,5,1,11,8}
*/
        int arr[] = {1, 2, 3, 2, 1};
        System.out.println(isMountainArray(arr));


    }

    private static boolean isMountainArray(int[] arr) {

        int lenght = arr.length;//5
        int diff[] = new int[lenght - 1];
        IntStream.range(0,lenght-1).
                forEach(t->diff[t]=arr[t+1]-arr[t]);

        int i = 0;
        //yukari cikis kontrolu
        while (i<lenght-1 && diff[i]>0) {
            i++;
        }

        //zirve kontrolu
        if (i==0 || i==lenght-1){
            return false;
        }

        //asagi inis kontrolu
        while (i<lenght-1 && diff[i]<0) {
            i++;
        }

        return i == lenght-1;

    }
}
