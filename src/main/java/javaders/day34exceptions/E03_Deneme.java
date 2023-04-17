package javaders.day34exceptions;

public class E03_Deneme {

    public static void main(String[] args) {

        String s = "Java";
        getCharFromString(s,2); // v
        getCharFromString(s,4);
    }

    public static void getCharFromString (String s,int idx){
      // char ch = s.charAt(idx);
       // System.out.println(ch);
        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            e.printStackTrace();//direk consola yazdirir. detaylari gormek icin. kod durma islemi yapmaz sadece gormemizi saglar

        }
        System.out.println("try catch method gorev tamamlandi...");
    }

}
