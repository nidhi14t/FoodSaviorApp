/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WarehouseOrder;

import Business.Customer.Customer;
import Business.DiscardedItem.DiscardedItem;
import Business.Org.Org;
import Business.Warehouse.Warehouse;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author nidhitiwari
 */
public class WarehouseOrder extends WorkRequest {
    private String orderID;
    private String warehouseName;
    private String customerName;
    private Customer customer;
    private Warehouse warehouse;
    private int quantity;
    private Double price;
    private String comment;
    private String itemName;
    private String orderStatus;
    private String deliveryAddress;
    private String deliveryMan;
    private String volunteer;

    public String getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(String deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public String getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(String volunteer) {
        this.volunteer = volunteer;
    }
    
    private ArrayList<DiscardedItem> WarehouseOrder;

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public Customer getCustomer() {
        return customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public String getComment() {
        return comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    
    public ArrayList<DiscardedItem> getWarehouseOrder() {
        return WarehouseOrder;
    }

    public void setWarehouseOrder(ArrayList<DiscardedItem> Order) {
        this.WarehouseOrder = Order;
    }
    
    @Override
    public String toString() {
        return orderID;
    }
}
