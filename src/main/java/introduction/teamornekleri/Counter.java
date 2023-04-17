package introduction.teamornekleri;

public class Counter {

    int count;
    static int stCount;

    public Counter() {
        count++;
        stCount++;
    }

    public int getCount (){
        return count;
    }

    public static int getStCount(){
        return stCount;
    }

    public static void main(String[] args) {
        Counter CS1 = new Counter();
        Counter CS2 = new Counter();
        Counter CS3 = new Counter();
        Counter CS4 = new Counter();
        Counter CS5 = new Counter();
        Counter CS6= new Counter();

        System.out.println("Count is:" + CS6.getCount() );
        System.out.println("Count is:" + CS6.getStCount());
    }

}
