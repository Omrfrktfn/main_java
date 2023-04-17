package javaders.day27interface;

public interface Engine {
    /*
            interface'deki methodlar
    1)"interface" icine "Concrete method" konulamaz.
    2)"interface" icindeki methodlarin abstract oldugunu java bilir, bu yuzden "interface" icindeki abstract
        methodlarda "abstract" keyword kullanmaya gerek yoktur.
    3)"interface" icindeki abstract methodlarin tamami public'tir. Bu yuzden "interface" icinde abstract method
        olustururken :"acces modifier" yazmaya gerek yoktur.
    4)Bir interface'i bir class'in parent'i yapmak istedigimizde extends keyword yerine implements keyword
        kullaniniz.
    5)Concrete child class'lar parent interface'deki abstract methodlari override etmek zorundadirlar.
    6)interce'ler bir application'da child class'larin concrite child class'larin yapmak zorunda olduklari
        fonksiyonlari barindirirlar. Bu yuzden interfacelere to-do list'de denir.
    7)Birden fazla parent interface icinde ayni isimli abstract methodlar olusuturabilirsiniz.
        Abstract methodlarin body'si olmadigi icin child class'lar ayni isimli methodlardan her hangi birin
        override ederek kullanabilirler.
    8)Birden fazla parent ve interface icinde ayni isimli abstract methodlar olusturdugunuzda bu methodlarin
        return type'lari ayni olmak zorundadir.
    9)Normalde interface icine concrite method konulamaz ama bazi ozel durumlarda concrete method koymamiz gerekirse
        i- default keyword'unu asagidaki gibi kullanarak interface icine concrete method koyabiliriz.
              default void eco(){
                 System.out.println("Uses gas less...");
                 }
        ii) "static" keyword unu asagidaki gibi kullanarak "interface" icine "concrete method"
            koyabiliriz. static void stop () { System.out.println("Stop securely...");}
    10)default veya static keyword'unu kullanarak olusturdugumuz concrete method'larin concrete child'lar tarafinda
        kullanilma zorunlulugu yoktur.
    11)"default" keyword'unu kullanarak olusturgunuz "concrete method"lara "object" olusturarak
   ulasilabilir.
   "static" keyword'unu kullanarak olusturgunuz "concrete method"lara ulasmak icin "object"
   olusturmaya gerke yoktur, "interface" ismi yeterlidir.
    12)interfaceler'den object olusturulamaz. interfacelerin constructar'i yoktur.


     */
    //public abstract void start(); // bu sekilde'de calisir.
    //  public void start();//public diye belirtmeye gerek yok
    void start();

    void payment();

    //default keyword'u kullanarak method olusturulur
    default void eco(){
        System.out.println("Uses gas less...");
    }

    static void stop(){
        System.out.println("Stops securely...");
    }
}

