/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FoodAuditor;

import Business.DiscardedItem.DiscardedItem;
import Business.WarehouseOrder.WarehouseOrder;
import java.util.ArrayList;

/**
 *
 * @author nidhitiwari
 */
public class FoodAuditor {
    private String foodAuditorName;
    private String foodAuditorAddress;
    private String foodAuditorContact;
    private String username;
    private int id = 1001;
    
    private ArrayList<WarehouseOrder> orderList;

    public String getFoodAuditorName() {
        return foodAuditorName;
    }

    public void setFoodAuditorName(String foodAuditorName) {
        this.foodAuditorName = foodAuditorName;
    }

    public String getFoodAuditorAddress() {
        return foodAuditorAddress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFoodAuditorAddress(String foodAuditorAddress) {
        this.foodAuditorAddress = foodAuditorAddress;
    }

    public String getFoodAuditorContact() {
        return foodAuditorContact;
    }

    public void setFoodAuditorContact(String foodAuditorContact) {
        this.foodAuditorContact = foodAuditorContact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    private String foodAuditorUserName;

    public String getFoodAuditorUserName() {
        return foodAuditorUserName;
    }

    public void setFoodAuditorUserName(String foodAuditorUserName) {
        this.foodAuditorUserName = foodAuditorUserName;
    }
    
    public FoodAuditor(String foodAuditorName, String username, String address,String contact) {
        this.foodAuditorUserName=username;
        this.foodAuditorName = foodAuditorName;
        this.foodAuditorAddress = address;
        this.foodAuditorContact = contact;
        orderList=new ArrayList<WarehouseOrder>();
    }
    
    public FoodAuditor() {
        orderList=new ArrayList<WarehouseOrder>();
    }
    
    public ArrayList<WarehouseOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<WarehouseOrder> orderList) {
        this.orderList = orderList;
    }
    
    public void addOrder(String warehouseName, String foodAuditorName, String deliveryMan, ArrayList<DiscardedItem> Order, Double price, String deliveryAddress) {
        WarehouseOrder order=new WarehouseOrder();
        order.setOrderID(String.valueOf(id));
        order.setFoodAuditorName(foodAuditorName);
        order.setWarehouseName(warehouseName);
        order.setWarehouseOrder(Order);
        order.setPrice(price);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Order");
        order.setComment(" ");
        orderList.add(order);
        System.out.print("order   " + orderList);
        id++;
    }
    
    @Override
    public String toString(){
        return foodAuditorName;
    }
}
