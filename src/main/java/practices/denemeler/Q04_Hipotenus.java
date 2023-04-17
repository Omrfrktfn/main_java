package practices.denemeler;

public class Q04_Hipotenus {
    //Hipotenüs hesaplayan bir kod yazınız

    public static double hipotenusHesapla(double dikKenar1, double dikKenar2){

       // Math.sqrt() ==>karekok alma islemi. Math yazip matematiksel islemleri oradan bulabiliriz
        return Math.sqrt(dikKenar1*dikKenar1+dikKenar2*dikKenar2);
        //komple isim degistirmek isin sectikten sonra sag tik refactor ve rename diyerek degistiririz
    }

    public static void main(String[] args) {
        System.out.println(hipotenusHesapla(5,12)*5);//ekstradan da matematik islemi ekliyebiliriz

    }
}
