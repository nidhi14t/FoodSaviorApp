/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DiscardedItem;

/**
 *
 * @author nidhitiwari
 */
public class DiscardedItem {
    private String warehouseName;
    private String itemName;
    private double price;
    private boolean goodToConsume = false;

    public boolean isGoodToConsume() {
        return goodToConsume;
    }

    public void setGoodToConsume(boolean goodToConsume) {
        this.goodToConsume = goodToConsume;
    }
    
    public DiscardedItem(String itemName,Double price) {
        this.itemName=itemName;
        this.price=price;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    public DiscardedItem() {
    };
    
    @Override
    public String toString(){
        return itemName;
    }
}
