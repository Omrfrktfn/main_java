package javaders.day25polymorphism;

public class Animal {
        /*
        buradaki public olan kisim degistirilebilr protecded vs olabilir
        ama cat clasii icindek child'da olamaz.
        1)Parent'taki method ile Child'da Override edilen method'un access modifier'lari ayni olabilir.
        2)Child'da Override edilen method'un access modifier'i Parent'taki method'un access modifier'indan dar olamaz.
        3)Parent'taki method'un access modifier'i Child'da Override edilen method'un access modifier'indan dar
         olabilir.d'da overried edilen mothodun acces modifier i parenttaki methodun acces

        4)Method'un retun type'i primitive ise override yapildiginda retun type degistirilemez.
        5)Methoud'un return type'i void ise override yapildiginda return type i degistirilemez.

        6)Child'da override edilen methodun retun type'i ile parentta'ki methodun retun type'i arasinda IS A iliskisi varsa return type degistirilebilir. Aksi takdidr degistirilemez
        Mesela: Integer wrapper class ile Long WRAPPER class arasinda IS A iliskisi yoktur o yuzden return type Integer oldugunda
        Longa a degistirilemez.
        7)Return type wrapper class oldugunda override yaparken return type degistirilemez.

        8)Final method'lar override edilemezler.
        9)Final methodlarin body'si degistirilemez ama override ederken method body'i degistiririz.
            Bu yuzden java final methodlarin override edilmesine musade etmez.

        10)Static methodlar override edilemezler.Cunku Static methodlar tum child'lar icin ortak methodlardir. Bir child'in
        ortak methodu degistitildiginde diger child'lar bunlar etkilenir. Bu etkilenme ummadik sonuclar ortaya cikarabilir.
        Bu yuzden java static methodlarin override edilmesine musade etmez.

        11)Private methodlar override edilemezler.
        */
    public void move(){
        System.out.println("Animals move...");
    }

    protected int add(int a, int b){
        return a+b;
    }

    public Animal create(){
        return new Animal();
    }

    public Integer multiply(Integer a, Integer b){
        return a*b;
    }

    public final double circleArea(double r){
        return 3.14*r*r;
    }
    //final methodalr override edilemez cunku body degistirme islmei olmaz




}
