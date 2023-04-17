package introduction.day02datatypesmethodcreate;

public class MethodCreation01 {

    /*
    java da method nasil olusturulur.

    1-main method'un disinda olusturulur.
    2-Access modifier + return type + method name + () + {}

    Olusturulan methodlar nasil kullanilir.
    1-main method un icinden kullanilir.
    2-method name + ()
    3-Islem yapilacak parametreler parentez icine konur.
     */

    //Ornek1 toplama islemei yapan bir method olusturunuz.
    public static int makeAddition (int a, int b){
        return a+b;
    }

    //ornek2 iki sayi carpma islemi yapan bir method olusturunuz
    protected static long multiplication (int a, int b){
        return a*b;
    }

    //ornek3 verilen uc sayidan ilk ikisini carpan ve sonuncu sayi ile toplayan bir methot olusturunuz

    private static int firstTwoMultiplyThirdAdd (int a, int b, int c){
        return a*b+c;
    }

    //ornek4 verilen bir ondalikli sayinin kupunu hesaplayan method olusturup
    //NOT: Access Modifier i eger default yapmak istersek access modifier yazilmaz
     static double getCube (double a){
        return a*a*a;
    }

    //ornek5 girilen bir kelimeyi ekrana yazdiran bir method olusturunuz
    //return type void oldugu zaman yeniden return kullanilmaz
    private static void print (String str){
        System.out.println(str);
    }


    public static void main(String[] args) {
        int solution = makeAddition(3,5); // a ve b yi biz yazmiyoruz sadece sayi degeri giryoruz.
        System.out.println(solution);
        long conclusion = multiplication(3,5);
        System.out.println(conclusion);
        int sonuc = firstTwoMultiplyThirdAdd(5,8,9);
        System.out.println(sonuc);
        double sonucOndalik=getCube(3.5);
        System.out.println(sonucOndalik);
        System.out.println(getCube(3.5)); // bu şekilde de yazılabiliyor
        print("hey hey");
        //shift + f10 run yapar


    }



}
