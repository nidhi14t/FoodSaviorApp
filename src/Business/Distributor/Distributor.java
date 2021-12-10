/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 
 */
package Business.Distributor;

import java.util.ArrayList;
import Business.WarehouseOrder.WarehouseOrder;
import Business.DiscardedItem.DiscardedItem;
import Business.DiscardedItem.DiscardedItemDirectory;

/**
 *
 * @author karpe.s@northeastern.edu
 */
public class Distributor {
    private String distributorName;
    private String distributorAddress;
    private String distributorContact;
    private String distributorManager;
    private DiscardedItemDirectory discardedItemDirectory; 
    private ArrayList<DiscardedItem> Menu;
    private int id = 1001;
    
    public ArrayList<DiscardedItem> getMenu() {
        return Menu;
    }
    
    

    public void setMenu(ArrayList<DiscardedItem> Menu) {
        this.Menu = Menu;
    }
    private ArrayList<WarehouseOrder> orderList;
    private String distAdminUserName;

    public String getDistAdminUserName() {
        return distAdminUserName;
    }

    public void setDistAdminUserName(String distAdminUserName) {
        this.distAdminUserName = distAdminUserName;
    }

    public String getDistributorName() {
        return distributorName;
    }

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }

    public String getDistributorAddress() {
        return distributorAddress;
    }

    public void setDistributorAddress(String distributorAddress) {
        this.distributorAddress = distributorAddress;
    }

    public String getDistributorContact() {
        return distributorContact;
    }

    public void setDistributorContact(String distributorContact) {
        this.distributorContact = distributorContact;
    }

    public String getDistributorManager() {
        return distributorManager;
    }

    public void setDistributorManager(String distributorManager) {
        this.distributorManager = distributorManager;
    }

    public DiscardedItemDirectory getDiscardedItemDirectory() {
        return discardedItemDirectory;
    }

    public void setDiscardedItemDirectory(DiscardedItemDirectory discardedItemDirectory) {
        this.discardedItemDirectory = discardedItemDirectory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<WarehouseOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<WarehouseOrder> orderList) {
        this.orderList = orderList;
    }

    
    
    public void addOrder(String warehouseName, String customerName, String deliveryMan, ArrayList<DiscardedItem> Order, Double price, String deliveryAddress) {
        WarehouseOrder order=new WarehouseOrder();
        order.setOrderID(String.valueOf(id));
        order.setCustomerName(customerName);
        order.setWarehouseName(warehouseName);
        order.setDeliveryMan(deliveryMan);
        order.setWarehouseOrder(Order);
        order.setPrice(price);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Order");
        order.setComment(" ");
        orderList.add(order);
        id++;
//        id = count;
//        count++;
    }
    
    @Override
    public String toString(){
        return distributorName;
    }
}
