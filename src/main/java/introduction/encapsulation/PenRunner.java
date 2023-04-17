package introduction.encapsulation;

import java.security.cert.PolicyNode;

public class PenRunner {
    public static void main(String[] args) {

        Pen firstPen = new Pen("red" , 15);

        //firstPen.color= "Pembe"; //direk olarak erisemiyoruz.
        //firstPen.height= 10;

        firstPen.getHeight();
        System.out.println(firstPen.getHeight());

        firstPen.setColor("blue");
        firstPen.setHeight(10);

        System.out.println(firstPen.getColor());
        System.out.println(firstPen.getHeight());

        String message = "Ilk kalem uretildi.";
      //  firstPen.writeMessage(message);

        Pen secondPen = new Pen("blue" , 25);
        secondPen.setColor("blue");
        secondPen.setHeight(20);
        //String message = " ikinci kalem uretildi";
      //  secondPen.writeMessage(secondPen.getColor() + " " + secondPen.getHeight());
       // secondPen.writeMessage(secondPen.getHeight());
    }

}
