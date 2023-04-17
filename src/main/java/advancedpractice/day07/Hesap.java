package advancedpractice.day07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hesap {

    private ArrayList<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public double getTotalAmount (){//toplam siparis tutari hesaplandi
        return orders.stream().
                mapToDouble(Order::getTotalAmount).
                sum();
    }

    public void printHesap() {
        System.out.println("********************Hesap Fisi*******************************");

        for (Order order : orders) {
            System.out.println("siparis kodu: " + order.getOrderCode());
            System.out.println("Yiyecekler : ");
            HashMap<MenuItem, Integer> items = order.getItems();

            for (Map.Entry<MenuItem,Integer> entry :items.entrySet()) {
               MenuItem item = entry.getKey();
               int adet =entry.getValue();
                System.out.printf("%-20s  %d x  %.2f  TL " + item.getName(),adet,item.getPrice());//formatli yazdirir

                /*modulus formatlari olarak yazdirir
                - = sola yasla
                20=karkateer ayir
                s= String
                d = tam sayi
                %.2=virgulden sonra iki basamak yazdir
                f==ondalikli syailar icin
                 */

            }
            System.out.println(""+order.getTotalAmount());
        }
        System.out.println(""+getTotalAmount());
    }
}
