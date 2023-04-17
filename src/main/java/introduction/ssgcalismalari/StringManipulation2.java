package introduction.ssgcalismalari;

public class StringManipulation2 {
    public static void main(String[] args) {
        String cumle = "Java Buyuk,Dunya Kucuk";
        cumle =cumle.toLowerCase();
        if ((cumle.contains("buyuk") && cumle.contains("kucuk"))){
            System.out.println("karar ver buyuk mu kucuk mu");
        }else if (cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
        }else System.out.println("cumle kucuk yada buyuk kelmesi icermiyor");
    }
}
