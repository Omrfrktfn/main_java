package introduction.ssgcalismalari;

public class C01_constructor {

    int a;
    int b;

    C01_constructor(){
        this(12,9);
        System.out.println("constructor calisti.");
    }

    public C01_constructor(int a, int b){
       // System.out.println(a);
       // System.out.println(b);
        this.a = a;
        this.b = b;
       // System.out.println(this.a);
    }

    public static void main(String[] args) {
        C01_constructor c01 = new C01_constructor();
        C01_constructor c02 = new C01_constructor(5,7);
        System.out.println(c02.a);
        System.out.println(c02.b);
        System.out.println(c01.a);
        System.out.println(c01.b);
    }
}
