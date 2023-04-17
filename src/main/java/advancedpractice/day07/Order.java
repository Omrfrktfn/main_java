package advancedpractice.day07;

import java.util.HashMap;
import java.util.Map;

public class Order {

    private static int orderCount=1000;//siparis no

    private int orderCode;
    private HashMap<MenuItem, Integer> items = new HashMap<>();//yiyecekler ve kacar adet siparis verildigi bilgisi var
    private double totalAmount=0;

    public Order() {

        orderCode=orderCount++;
    }

    public void addItem(MenuItem item, int adet){
        items.put(item,adet);//items secenekler haspmap'ine arguman olarak verilen item yani secenek eklenir.
        totalAmount +=item.getPrice()*adet;
    }

    public int getOrderCode() {
        return orderCode;
    }

    public HashMap<MenuItem, Integer> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
