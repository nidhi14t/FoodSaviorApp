/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Distributor.DistributorDirectory;
import Business.FoodAuditor.FoodAuditorDirectory;
import Business.Logistic.LogisticDirectory;
import Business.NGO.NGODirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Warehouse.WarehouseDirectory;
import java.util.ArrayList;

/**
 *
 * @author nidhitiwari
 */
public class BusinessModel extends Organization {
    private static BusinessModel business;
    private NGODirectory ngoDirectory;
    private CustomerDirectory customerDirectory;
    private WarehouseDirectory warehouseDirectory;
    private LogisticDirectory logisticDirectory;
    private FoodAuditorDirectory foodAuditorDirectory;
    private DistributorDirectory distributorDirectory;
    private DeliveryManDirectory deliveryManDirectory;


    public BusinessModel(NGODirectory ngoDirectory, CustomerDirectory customerDirectory, WarehouseDirectory warehouseDirectory, 
            LogisticDirectory logisticDirectory, FoodAuditorDirectory foodAuditorDirectory, DistributorDirectory distributorDirectory, DeliveryManDirectory deliveryManDirectory) {

        this.ngoDirectory = ngoDirectory;
        this.customerDirectory = customerDirectory;
        this.warehouseDirectory = warehouseDirectory;
        this.distributorDirectory = distributorDirectory;
        this.logisticDirectory = logisticDirectory;
        this.foodAuditorDirectory = foodAuditorDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        business = BusinessModel.getInstance();
    }
    
    public static BusinessModel getInstance(){
        if(business==null){
            business=new BusinessModel();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    private BusinessModel(){
        super(null);
        ngoDirectory = new NGODirectory();
        customerDirectory = new CustomerDirectory();
        warehouseDirectory = new WarehouseDirectory();
        distributorDirectory = new DistributorDirectory();
        logisticDirectory = new LogisticDirectory();
        foodAuditorDirectory = new FoodAuditorDirectory();
        deliveryManDirectory = new DeliveryManDirectory();
    }
    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }

    public static BusinessModel getBusiness() {
        return business;
    }

    public static void setBusiness(BusinessModel business) {
        BusinessModel.business = business;
    }

    public NGODirectory getNgoDirectory() {
        return ngoDirectory;
    }

    public void setNgoDirectory(NGODirectory ngoDirectory) {
        this.ngoDirectory = ngoDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public WarehouseDirectory getWarehouseDirectory() {
        return warehouseDirectory;
    }

    public void setWarehouseDirectory(WarehouseDirectory warehouseDirectory) {
        this.warehouseDirectory = warehouseDirectory;
    }

    public LogisticDirectory getLogisticDirectory() {
        return logisticDirectory;
    }

    public void setLogisticDirectory(LogisticDirectory logisticDirectory) {
        this.logisticDirectory = logisticDirectory;
    }

    public FoodAuditorDirectory getFoodAuditorDirectory() {
        return foodAuditorDirectory;
    }

    public void setFoodAuditorDirectory(FoodAuditorDirectory foodAuditorDirectory) {
        this.foodAuditorDirectory = foodAuditorDirectory;
    }

    public DistributorDirectory getDistributorDirectory() {
        return distributorDirectory;
    }

    public void setDistributorDirectory(DistributorDirectory distributorDirectory) {
        this.distributorDirectory = distributorDirectory;
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
}
