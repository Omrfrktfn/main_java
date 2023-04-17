package javaders.day35exceptions;

public class E03_Deneme {
    public static void main(String[] args) {
        Object obj = 13;
      //  String str = (String) obj; //type casting
       // System.out.println(str);
        //Birbirine donusturulemeyecek data type'larini donusturmek'te israr ederseniz java ClassCastException hatasi atar.

        try {
            String str = (String) obj; //type casting
             System.out.println(str);
        }catch (ClassCastException e){
            System.out.println("Her data type'i her data type cevrilmez.");
            System.err.println("Her data type'i her data type cevrilmez.");
            //err komutu ile da yazilir ve error mesaji oldugu anlasilir. Consol'daki olan yer kirmizi olur.
        }

    }
}
