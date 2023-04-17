package javaders.day41Lambda;

public class utils {
    //sik kullanilan faydali methodlarin depolandigi yerdir.

    public static int getSquare(int a) {
        return a * a;
    }

    public static boolean isOdd(int a) {
        return a % 2 != 0;
    }

    public static boolean isOdd1(int a) {
        return a % 2 == 0;
    }

    public static int getSquare1(int a) {
        return a * a;
    }

    public static int getSquare2(int a, int b) {
        return a * b;
    }

    public static boolean isOdd2(int a) {
        return a % 2 == 0;
    }

    public static int getSquare3(int a, int b) {
        return a > b ? a : b;
    }

    public static boolean isOdd3(int a) {
        return a % 2 != 0;
    }

    public static int getSquare4(int a, int b) {
        return a < b ? a : b;
    }

    public static int getSomOfDigits(int a) {
        int sum = 0;
        while (a > 0) {
            sum = sum + a % 10;
            a = a / 10;
        }
        return sum;
    }
}
