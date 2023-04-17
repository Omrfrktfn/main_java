package javaders.day18constructorsstatickeyword;

public class StaticNonStaticBlocks02 {

    public StaticNonStaticBlocks02(){

        System.out.println("construtor 1");

    }

    public StaticNonStaticBlocks02(int price){

        System.out.println("construtor 2");
    }

    public StaticNonStaticBlocks02(String price){

        System.out.println("construtor 3");
    }

    public StaticNonStaticBlocks02(boolean price){

        System.out.println("construtor 4");
    }

    /*
    not-static block constructor'larda caslistirilmasi gereken ortak kod'lari icerir
    non-static block icine yazilan kodlar her constructor icin calistirilir.
    Birden fazla non-static block varsa ustteki once calistirilir
     */
    {
        System.out.println("I am constructor");

    }

    public static void main(String[] args) {
        StaticNonStaticBlocks02 obj1 = new StaticNonStaticBlocks02();
        StaticNonStaticBlocks02 obj2 = new StaticNonStaticBlocks02(12);
        StaticNonStaticBlocks02 obj3 = new StaticNonStaticBlocks02("shirt");
        StaticNonStaticBlocks02 obj4 = new StaticNonStaticBlocks02(false);
    }

}
