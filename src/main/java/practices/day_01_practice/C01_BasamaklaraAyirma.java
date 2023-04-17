package practices.day_01_practice;

public class C01_BasamaklaraAyirma {
    public static void main(String[] args) {
        // 12345 sayısının rakamları toplamını bulunuz
        int number = 12345;
        int a = number % 10;
        System.out.println(a);
        number = number / 10;
        int b = number % 10;
        System.out.println("b = " + b);
        number = number / 10;
        int c = number % 10;
        System.out.println(c);
        number = number /10;
        int d = number % 10;
        System.out.println(d);
        number =number /10;
        int e = number%10;
        System.out.println(e);
        number = number /10 ;

        System.out.println("sonuc : " + (a+b+c+d+e));




    }
}
