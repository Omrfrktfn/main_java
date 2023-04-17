package introduction.list01;

import java.util.Arrays;

public class C01_mda {

    public static void main(String[] args) {

        int arr [][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(arr));

        int arr1 [][]={{1,2,3},{4,5,6},{7,8,9}};
        elementYazdir(arr1);
    }

    private static void elementYazdir(int [][] arr1) {
        for (int[] a :arr1) {
            for (int w:a) {
                System.out.print(w+ " ");
            }
            System.out.println("\n" + "----------------------");
        }
    }


}
