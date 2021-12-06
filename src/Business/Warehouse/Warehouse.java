/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Warehouse;

import Business.DiscardedItem.DiscardedItem;
import Business.DiscardedItem.DiscardedItemDirectory;
import Business.WarehouseOrder.WarehouseOrder;
import java.util.ArrayList;

/**
 *
 * @author nidhitiwari
 */
public class Warehouse {
    private String warehouseName;
    private String warehouseAddress;
    private String warehouseContact;
    private String warehouseManager;
    
    private DiscardedItemDirectory discardedItemDirectory; 
    private ArrayList<DiscardedItem> Item;
    private int id = 1001;

    public ArrayList<DiscardedItem> getItem() {
        return Item;
    }

    public void setItem(ArrayList<DiscardedItem> item) {
        this.Item = item;
    }
    
    private ArrayList<WarehouseOrder> orderList;
    
    private String adminUserName;
    
    
    public Warehouse(String warehouseName, String username, String address,String contact) {
        this.adminUserName=username;
        this.warehouseName = warehouseName;
        this.warehouseAddress = address;
        this.warehouseContact = contact;
        Item = new ArrayList<DiscardedItem>();
        orderList=new ArrayList<WarehouseOrder>();
    }
    
    public Warehouse() {
        Item=new ArrayList<DiscardedItem>();
        orderList=new ArrayList<WarehouseOrder>();
    }
    
    public String getAdminUserName() {
        return adminUserName;
    }

    public void setAdminUserName(String adminUName) {
        this.adminUserName = adminUName;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getWarehouseAddress() {
        return warehouseAddress;
    }

    public void setWarehouseAddress(String warehouseAddress) {
        this.warehouseAddress = warehouseAddress;
    }

    public String getWarehouseContact() {
        return warehouseContact;
    }

    public void setWarehouseContact(String warehouseContact) {
        this.warehouseContact = warehouseContact;
    }
    
    public ArrayList<WarehouseOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<WarehouseOrder> orderList) {
        this.orderList = orderList;
    }

    public String getWarehouseManager() {
        return warehouseManager;
    }

    public void setWarehouseManager(String restaurantManager) {
        this.warehouseManager = warehouseManager;
    }

    public DiscardedItemDirectory getDiscardedItemDirectory() {
        return discardedItemDirectory;
    }

    public void setDiscardedItemDirectory(DiscardedItemDirectory discardedItemDirectory) {
        this.discardedItemDirectory = discardedItemDirectory;
    }
    
    public void addItem(DiscardedItem item){
        Item.add(item);
    }
    
    public void removeItem(DiscardedItem item){  
        Item.remove(item);
    }
    
    public void addOrder(String restaurantName, String customerName, String deliveryMan, ArrayList<DiscardedItem> Order, Double price, String deliveryAddress) {
        WarehouseOrder order=new WarehouseOrder();
        order.setOrderID(String.valueOf(id));
        order.setCustomerName(customerName);
        order.setWarehouseName(restaurantName);
        order.setWarehouseOrder(Order);
        order.setPrice(price);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Order");
        order.setComment(" ");
        orderList.add(order);
        id++;
    }
    
    @Override
    public String toString(){
        return warehouseName;
    }
}
