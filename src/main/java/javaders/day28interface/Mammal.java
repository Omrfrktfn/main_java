package javaders.day28interface;

        /*
            1)Class --> Class :extends
              interface --> interface : extends
              Class --> interface : implements
              interface --> Class : bu ihtimal olamaz... yani bir interface class'in child'i olamaz.
              Ayni ise extends farkli ise implements kullan. interface'i Class'in child'i yapma.
        */

        /*
        abstract class ile interface arasindaki farklar nelerdir
        1-abstract class'lar hem abstract hemde concrete methodlar icerebilir, fakat interfaceler sadece abstract
          method icerir.Ama interfaceler'de istersek default ve static keyword'larini kullanarak concrete method
          uretebiliriz.
        2-abstract class'lar multiple inheritanceyi desteklemez ama interfaceler destekler.
        3-Abstract class'lar icerisinde her turlu variable olusturulabilir. interfaceler icerisinde variable'lara
          public static ve final olmak zorundadir.
        4- interface class'in child'i olamaz ama abstract class'in child'i olabilir.
        5-abstract class'larda connstaractar vardir ama object uretemez. interfacelerde constractar yoktur
          bu yuzden obje uretilemez.
         */
public interface Mammal extends Animal{

        String feedBaby = "Milk";
        int age = 6;//interface ismi ile cagrildiklari icin karisma olmaz
}
