package javaders.day35exceptions;

public class E02_Deneme {
    public static void main(String[] args) {

        String s = "Java";
        getNumberOfChars(s);

        String t = "";
        getNumberOfChars(t);

        String u = null;
        getNumberOfChars(u);//NullPointerException hatasi aldik
        //string methodu null oldugu zaman strign degerleri kullanamiyoruz.
    }

    public static void getNumberOfChars(String s) {
     //   int numOfChars = s.length();
      //  System.out.println(numOfChars);

        try {
            int numOfChars = s.length();
            System.out.println(numOfChars);
        }catch (NullPointerException e){
            System.out.println("null degeri icin bazi methodlar kullanilamaz...");
        }
    }
}
