package introduction.teamornekleri;

import introduction.encapsulation.Pen;

public class PenRunner {
    public static void main(String[] args) {

        pen fistPen = new pen("beyaz", 10);

        fistPen.getHeight();
        System.out.println(fistPen.getHeight());

        fistPen.setColor("beyaz");
        System.out.println(fistPen.getColor());


    }



}
