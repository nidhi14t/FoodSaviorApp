/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.NGO;

import Business.DiscardedItem.DiscardedItem;
import Business.DiscardedItem.DiscardedItemDirectory;
import Business.Org.Org;
import Business.Org.OrgDirectory;
import Business.WarehouseOrder.WarehouseOrder;
import java.util.ArrayList;

/**
 *
 * @author nidhitiwari
 */
public class NGO {
    private String ngoName;
    private String ngoAddress;
    private String ngoContact;
    private String ngoManager;
    private String username;
    
    private OrgDirectory orgDirectory; 
    private ArrayList<Org> Org;
    private int id = 1001;

    public String getNgoName() {
        return ngoName;
    }

    public void setNgoName(String ngoName) {
        this.ngoName = ngoName;
    }

    public String getNgoAddress() {
        return ngoAddress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNgoAddress(String ngoAddress) {
        this.ngoAddress = ngoAddress;
    }

    public String getNgoContact() {
        return ngoContact;
    }

    public void setNgoContact(String ngoContact) {
        this.ngoContact = ngoContact;
    }

    public String getNgoManager() {
        return ngoManager;
    }

    public void setNgoManager(String ngoManager) {
        this.ngoManager = ngoManager;
    }

    public OrgDirectory getOrgDirectory() {
        return orgDirectory;
    }

    public void setOrgDirectory(OrgDirectory orgDirectory) {
        this.orgDirectory = orgDirectory;
    }

    public ArrayList<Org> getOrg() {
        return Org;
    }

    public void setOrg(ArrayList<Org> org) {
        this.Org = org;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    private ArrayList<WarehouseOrder> orderList;
    
    private String ngoAdminUserName;

    public String getNgoAdminUserName() {
        return ngoAdminUserName;
    }

    public void setNgoAdminUserName(String ngoAdminUserName) {
        this.ngoAdminUserName = ngoAdminUserName;
    }
    
    public NGO(String ngoName, String username, String address,String contact) {
        this.ngoAdminUserName=username;
        this.ngoName = ngoName;
        this.ngoAddress = address;
        this.ngoContact = contact;
        Org = new ArrayList<Org>();
        orderList=new ArrayList<WarehouseOrder>();
    }
    
    public NGO() {
        Org=new ArrayList<Org>();
        orderList=new ArrayList<WarehouseOrder>();
    }
    
    public ArrayList<WarehouseOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<WarehouseOrder> orderList) {
        this.orderList = orderList;
    }
    
    public void addOrg(Org org){
        Org.add(org);
    }
    
    public void removeOrg(Org org){  
        Org.remove(org);
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
        return ngoName;
    }
}
