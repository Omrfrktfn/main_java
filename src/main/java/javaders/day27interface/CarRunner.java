package javaders.day27interface;

public class CarRunner {
    public static void main(String[] args) {
        Engine.stop();//stop()methodu static oldugundan interface ismi ile ulastim.

        Engine h = new Honda();
        h.eco();//eco methodu static olmadigindan(default) object ile ulastim
    }
}
