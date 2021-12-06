/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Warehouse;

import Business.DiscardedItem.DiscardedItem;
import java.util.ArrayList;

/**
 *
 * @author nidhitiwari
 */
public class WarehouseDirectory {
    
    private ArrayList<Warehouse> warehouseList;
    private Warehouse warehouse;
    private DiscardedItem item;
    
    
    public WarehouseDirectory(){
        warehouseList = new ArrayList<Warehouse>();
    }

    public ArrayList<Warehouse> getWarehouseList() {
        return warehouseList;
    }

    public void setWarehouseList(ArrayList<Warehouse> warehouseList) {
        this.warehouseList = warehouseList;
    }
    
    public Warehouse createWarehouseInfo(String warehouseName, String username, String address,String contact){
        Warehouse warehouse = new Warehouse();
        warehouse.setAdminUserName(username);
        warehouse.setWarehouseName(warehouseName);
        warehouse.setWarehouseContact(contact);
        warehouse.setWarehouseAddress(address);
        warehouseList.add(warehouse);
        
        return warehouse;
    }
    
    public Warehouse getWarehouse(String warehouseName){
    for(Warehouse warehouse: warehouseList){
        if(warehouse.getWarehouseName() == warehouseName){
            return warehouse;
        }
    }
    return null;
    }
    
    public void updateWarehouseInfo(Warehouse ware,String warehouseName,String contact,String address){
        ware.setWarehouseName(warehouseName);
        ware.setWarehouseAddress(address);
        ware.setWarehouseContact(contact);
    }
    
    public DiscardedItem AddDiscardedItems(Warehouse ware,String itemName,Double price){
        item=new DiscardedItem(itemName, price);
        ware.addItem(item);
        return item;
    }
    
    public void DeleteItems(Warehouse ware,DiscardedItem di){
        ware.removeItem(di);
        
    }
    
    public void deleteWarehouse(String username){
        for(int i=0;i<warehouseList.size();i++){
            if(warehouseList.get(i).getAdminUserName().equals(username)){
                warehouseList.remove(i);
            }
        }
    }
    
    public void deleteWarehouse(){
        for(int i=0;i<warehouseList.size();i++){
            warehouseList.remove(i);
        }
    }
}
