/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Logistic;

import Business.DiscardedItem.DiscardedItem;
import Business.WarehouseOrder.WarehouseOrder;
import java.util.ArrayList;

/**
 *
 * @author karpe.s@northeastern.edu
 */
public class Logistic {
    private String transport;
    private String temprature;
    private int deliId = 101;
    private int id = 1001;

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getTemprature() {
        return temprature;
    }

    public void setTemprature(String temprature) {
        this.temprature = temprature;
    }
    private ArrayList<WarehouseOrder> orderList;
    public ArrayList<WarehouseOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<WarehouseOrder> orderList) {
        this.orderList = orderList;
    }
    public Logistic(){
        orderList = new ArrayList<WarehouseOrder>();
        deliId++;
    }
    public void addOrder(String warehouseName, String ngoName, String deliveryMan, ArrayList<DiscardedItem> Order, Double price, String deliveryAddress) {
        WarehouseOrder order=new WarehouseOrder();
        order.setOrderID(String.valueOf(id));
        order.setNgoName(ngoName);
        order.setWarehouseName(warehouseName);
        order.setDeliveryMan(deliveryMan);
        order.setWarehouseOrder(Order);
        order.setPrice(price);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Order");
        orderList.add(order);
        id++;
//        id = count;
//        count++;
    }
    
    @Override
    public String toString() {
        return transport;
    }
}
