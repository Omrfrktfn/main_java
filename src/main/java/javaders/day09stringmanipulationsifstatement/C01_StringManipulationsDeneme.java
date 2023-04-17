package javaders.day09stringmanipulationsifstatement;

public class C01_StringManipulationsDeneme {
    public static void main(String[] args) {
        //****************************isEmpty*************************
        /*
        isEmpty() bosmu dolumu diye kontrol eder
         */
        //ex-1 Bir stringin hic karakter icermedigini gosteren kodu yaziniz
        String str = "";
        boolean result = str.length()==0;
        System.out.println("result = " + result);

        boolean reslult1 = str.isEmpty();
        System.out.println("reslult1 = " + reslult1);

        System.out.println("**********************************************");

        //bir stringin bosluk haric hicbir karakter icermediginiz yaziniz
        String t = "  ";
        Boolean sonuc = t.isBlank();
        System.out.println("sonuc = " + sonuc);

        boolean sonuc1=t.replace(" ","").length()==0;
        System.out.println("sonuc1 = " + sonuc1);

        System.out.println("**********************************************");
        //ex- Bir string de a,i,e karakterlerinin son  gorunumunun indexleri toplamini ekrana yazdiriniz

        String s = "Java is easy to Learn";
        int aIndx = s.indexOf('a');
        System.out.println("aIndx = " + aIndx);

        int eIndx = s.indexOf('e');
        System.out.println("eIndx = " + eIndx);

        int iIndx = s.indexOf('i');
        System.out.println("iIndx = " + iIndx);

        System.out.println("toplam sonuc : "+ (aIndx+eIndx+iIndx));

        System.out.println("**************************************");

        int aLast = s.lastIndexOf('a');
        System.out.println("aLast = " + aLast);

        int eLast = s.lastIndexOf('e');
        System.out.println("eLast = " + eLast);

        int iLast = s.lastIndexOf('i');
        System.out.println("iLast = " + iLast);

        System.out.println("toplam sonuc : "+ (aLast+eLast+iLast));

        System.out.println("*********************************************");




    }
}
