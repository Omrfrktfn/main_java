package javaders.day34exceptions;

public class E03 {

    public static void main(String[] args) {

        System.out.println("getNumOfChars(\"Java\") = " + getNumOfChars("Java"));
        System.out.println("getNumOfChars(\"Money\") = " + getNumOfChars("Money"));
        System.out.println("getNumOfChars(\"Money\") = " + getNumOfChars(""));
        System.out.println("getNumOfChars(\"Money\") = " + getNumOfChars(null));//bazi string methodlari null ile calismaz
        //sorun olan handel ediliryor asagida

    }

    //Bir stringdeki karakter sayisni veren method olusturunz.

    public static int getNumOfChars(String s) {

      //  return s.length();

        int result =0;
        try {
            result = s.length();

        }catch (NullPointerException e){//String class'ta null ile uyunlu olmayan method'lar kullanildiginda atilir.
          //  return 0;
            System.out.println("Some string methods do not work with null..."); // bu sekilde mesajda verebiliriz.
            System.out.println(e.getMessage());//java'nin exception urettigi teknik mesaji varsa verir.
        }
        return result;
    }
}
