package introduction.studendeneme;

public class random {
    public static void main(String[] args) {
        double a = (Math.random()*10-5);
        double x = (int)(a*10)/10.0;//double da bolme islemi yapaken double cinsinden yazmaliyiz
        System.out.println(x);

        double b = (Math.random()*10-5);
        double y = (int)(b*10)/10.0;//double da bolme islemi yapaken double cinsinden yazmaliyiz
        System.out.println(y);


        //0<a<1 a bu arada donuyor bes ile carpinca sifir ile bes arasinda doner
        //-5<a<5 arasinda doner
    }
}
