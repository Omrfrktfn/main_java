package introduction.scoop;

public class C01_scope {

    int yas = 20;
    static String isim = "Ali";

    public static void main(String[] args) {

        int yas= 15;
        C01_scope obj1 = new C01_scope();
        System.out.println(obj1.yas);//normalde yazdiramayiz obje olusturarak bu sekilde yazdirabiliriz.
        System.out.println(yas);
        System.out.println(isim);
        String isim="AliCan";
        System.out.println(isim);
    }
}
