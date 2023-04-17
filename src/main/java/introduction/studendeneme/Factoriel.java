package introduction.studendeneme;

public class Factoriel {
    public static void main(String[] args) {
        int d=5;

        int sum = 1;

        factoriyeliBul(5);
    }

    public static int factoriyeliBul (int sayi){
        if(sayi == 0 || sayi ==1 ){
            return 1;
        }else
            return (sayi *factoriyeliBul(sayi -1));
    }


}
