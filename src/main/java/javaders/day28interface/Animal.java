package javaders.day28interface;

public interface Animal {

    //public abstract void eat();
      void eat();
      //Parentlerde abstract method olusturdugunuz zaman child'lara gidip override edilmesi lazim yoksa hata veririr
      void drink();
      /*
      interfacelerdeki tum variableler otomatik olarak final'dir. Bu yuzden interface icindeki variableyi
      olusturudugunuzda mutlaka deger atamasi yapmalisiniz.Bilindigi gibi final variablelerin degerleri
      degistirilemez.
      interfacelerdeki tum variableler otomotik(default) olarak public'dir.
      interfacelerdeki tum variableler otomotik olarak static'dir.
       */
      int age=4;
}
