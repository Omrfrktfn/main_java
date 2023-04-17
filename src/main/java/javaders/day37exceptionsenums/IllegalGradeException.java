package javaders.day37exceptionsenums;

public class IllegalGradeException extends Exception{

    /*
    1-Custom Exception Class olusturmak icin Exception Class'a extend etmeliyiz.
      Exception Class'a extend ederek olusturdugunuz custom exception compile time exception olur.
    2-Custom Exception Class olustururken constructor olusturmalisiniz.
      Bu "constructor" parenttaki constructor'u cagirmalidir.
      Bu "constructor" mesaj verecek veya vermiyecek sekilde olusturulabilir.

    3-Custom Exception Class olusturduguzda ismin sonunda exception kelimesini kullanmalisiniz.
      IllegalGradeException'da oldugu gibi
     */
    public IllegalGradeException(String message){
        super(message);//mesajli constructor

    }

    public IllegalGradeException(){
        super();//mesajsiz constructor.

    }
}
