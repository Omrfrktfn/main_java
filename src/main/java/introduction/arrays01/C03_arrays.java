package introduction.arrays01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C03_arrays {
    public static void main(String[] args) {

        int sayilar[] = {1, 2, 3};

        int temp = sayilar[0];

        for (int i = 0; i < sayilar.length - 1; i++) {
            sayilar[i] = sayilar[i + 1];
        }
        sayilar[sayilar.length - 1] = temp;
        System.out.println(Arrays.toString(sayilar));

    }
}
