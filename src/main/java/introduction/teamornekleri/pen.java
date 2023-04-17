package introduction.teamornekleri;

import java.util.SplittableRandom;

public class pen {
    private String color;
    private int height;




    pen(String color,int height){
        this.color=color;
        this.height=height;
    }




    public int getHeight(){
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
