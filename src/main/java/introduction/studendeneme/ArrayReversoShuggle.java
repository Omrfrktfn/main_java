package introduction.studendeneme;

import javaders.day04memorykullanimiwrapperclass.Araba;

import java.util.Arrays;

public class ArrayReversoShuggle {
    public static void main(String[] args) {
        int [] arr = {21,564,6,8,232,65};

        sortByDescendingOrder(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void sortByDescendingOrder (int... args){
        Arrays.sort(args);

        for (int i = 0; i < args.length/2; i++) {
            int temp = args[i];
            args[i] = args[args.length-1-i];
            args[args.length-1-i] = temp;
        }
    }
}
