package javaders.day35exceptions;

public class E02 {
    public static void main(String[] args) {


        System.out.println(getCharFromString("Java", 2));
        System.out.println(getCharFromString("Java", 8));


    }

    //Bir stringdeki characteri index kullanarak alan bir method olusturunuz.
    public static char getCharFromString(String str, int idx) {
        //   return str.charAt(idx);

        try {
            return str.charAt(idx);
        } catch (StringIndexOutOfBoundsException e) {

            idx = Math.abs(idx);
            idx = idx % str.length();

            return str.charAt(idx);
        }
    }
}
