package javaders.day34exceptions;

public class E02_Deneme {

    public static void main(String[] args) {
        String s = "1234";
        convertStringToInt(s);

        String t = "1234a";
        convertStringToInt(t);
    }

    public static void convertStringToInt (String s){
     //  int intS = Integer.valueOf(s);
     //   System.out.println(intS + 1 );
        //eger icinde rakamlar disinda character olan bir string i sayiya cevirmek isterseniz java NumberFormatEception atar
        try {
            int intS = Integer.valueOf(s);
            System.out.println(intS + 1 );
        }catch (NumberFormatException e){
            System.out.println("Bir stringin sayiya donusturebilmesi icin rakam disi character icermemesi gerekir...");
            System.out.println(e.getMessage());
        }
    }
}
