package javaders.day26abstraction;
        /*
            1)Bazen parent class'daki method'un body'si hicbir child class
      tarafindan kullanilmaz.
      Bu durumda parent'daki method'a body yazmak hic kullanilmadigi
      icin mantikli degildir
      Biz de o method'a body yazmayiz.
    2)Body'si yazilmayan method'a "Abstract Method" denir.
      Abstract Ingilizce'de "vucutsuz" veya "soyut" anlamindadir.
    3)Method'un body'sini yazmayinca Java hata verir, biz de "abstract"
      keyword'unu kullanarak Java'ya bu method'un body'si olmayacak deriz.
    4)"abstract" keyword'unu kullaninca elde ettigimiz abstract method
      normal class'lara konulamaz, o yuzden class'i da "abstract" yapariz.
    5)Parent'taki method abstract ise butun child class'lar o method'u
      override etmek zorundadir.
      Bu yuzden tum child'lar icin metcburi olmasini istedigimiz fonksiyonlari
      abstract yapmak mantikli bir secimdir.
    6)Body'si olan method'lar(Concrete Method) abstract class'larin icine yazilabilir.
      abstract method'lar concrete class'larin icine yazilamazlar.
    7)"abstract" keyword ile "method body" bir method'da ayni anda kullanilamaz.
    8)"abstract" class'larin icinde "abstract methot"lar olur, "abstract medhod" lar
      body'si olmadigindan "eksik method"lar gibi dusunulebilir.
      Yani abstract class icinde eksik bir yapi barindirir, siz abstract class'dan
      object uretirseniz abstract class icindeki eksiklik object'e yansir ve object
      eksigi olan bir object olmus olur.
      Java bunu istemez cunku eksik object eksik is yapar, bu da application'in
      yanlis calismasina sebep olur.
      Java application'u korumak icin "abstract class"lardan object uretilmesini
      engellemistir.
    9)"abstract" class'larin constractar'i vardir ama object olusturmazlar.
    10)final methodlar abstract olamazlar
    11)private methodlar abstract olamazlar
    12)Abstract class'in abstract child'i veya concretechil'i olabilir.
        */

       /*
       "final" keyword'u aciklar misiniz?
        "final" keyword i)variable'larda ii)method'larda iii)class'larda kullanilir.
        i)variable'larda kullanildiginda a)o variableye kesinlikle deger atamsai yapilmalidir
                                         b)ilk atanan deger degistirilemez.
        ii)method'larda kullanildiginda a)o methodun body'si degistirilemez.
                                        b)o method override edilemez.
        iii)class'larda kullanidiginda a)o class'in child'i olamaz ama final class'in kendisi child olabilir.
                                       b
        */



public abstract class Courses {//abstract method sadece abstract class'in icinde var olabilir.

    public abstract void math();

    public void art (){
        System.out.println("Learn art...");
    }

}
