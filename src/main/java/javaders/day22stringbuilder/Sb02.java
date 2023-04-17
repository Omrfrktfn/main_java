package javaders.day22stringbuilder;

public class Sb02 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);

        sb1.reverse();//Var olan string'i ters cevirir.
        //String'in ters cevrilmesi looplar ile de yapilabilir.Bu kisa bir yoldur.
        System.out.println(sb1);

        sb1.deleteCharAt(6);//Verilen index'teki character'i siler
        System.out.println(sb1);

        sb1.delete(4,7);//Baslangic index'i dahil bitis index'i ne (haric) kadar olan characterleri siler.
        System.out.println(sb1);

        sb1.replace(2,5,"X");//2 dahil 5 haric olan kismi sadece X'e cevirir
        System.out.println(sb1);

        sb1.insert(3,"2023");
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Kava");

        int r1 = sb2.compareTo(sb3);
        System.out.println(r1);//0 ==>Alfabetik olarak yani siradadir demek
                                //Sonuc mesela -3 ise sb1 sb2'den alfabetik olarak 3 onde demektir.
                                //Sonuc mesela 3 ise sb1 sb2'den alfabetik olarak 3 sonra demektir.
        //StringBuilder nasil String'e cevrilir?
        String str = sb1.toString().toUpperCase();
        System.out.println(str);//String  YSX2023VAJ

        //String nasil StringBuilder'e cevrilir?
        StringBuilder newSb1 = new StringBuilder(str);
        System.out.println(newSb1);//StringBuilder  YSX2023VAJ


    }
}
