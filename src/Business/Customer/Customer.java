/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.DiscardedItem.DiscardedItem;
import Business.WarehouseOrder.WarehouseOrder;
import java.util.ArrayList;

/**
 *
 * @author piyus
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String contact;
    private String address;
    private String state;
    private String city;
    private String zip;
    private String username;
    private int id = 1001;
    private int custId = 101;
    private static int count = 1001;
    private static int custCount = 101;

    private ArrayList<WarehouseOrder> orderList;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public ArrayList<WarehouseOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<WarehouseOrder> order) {
        this.orderList = order;
    }
    
    public Customer(String username){
        this.username=username;
        orderList=new ArrayList<WarehouseOrder>();
        custId++;
    }
    
    public Customer(){
        orderList = new ArrayList<WarehouseOrder>();
        custId++;
    }
    
    public void addOrder(String restaurantName, String customerName, String deliveryMan, ArrayList<DiscardedItem> Order, Double price, String deliveryAddress) {
        WarehouseOrder order= new WarehouseOrder();
        order.setOrderID(String.valueOf(id));
        order.setCustomerName(customerName);
        order.setWarehouseName(restaurantName);
        order.setWarehouseOrder(Order);
        order.setPrice(price);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Order");
        orderList.add(order);
        id++;
    }
    
    
    @Override
    public String toString() {
        return firstName;
    }
}
