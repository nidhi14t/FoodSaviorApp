/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DiscardedItem;

import java.util.ArrayList;

/**
 *
 * @author nidhitiwari
 */
public class DiscardedItemDirectory {
    private ArrayList<DiscardedItem> discardedItemList;
    
    public DiscardedItemDirectory(){
        discardedItemList = new ArrayList();
    }

    public ArrayList<DiscardedItem> getDiscardedItemList() {
        return discardedItemList;
    }

    public void setDiscardedItemList(ArrayList<DiscardedItem> discardedItemList) {
        this.discardedItemList = discardedItemList;
    }
    
    public DiscardedItem createRestaurantDish(String itemName, double price, String warehouseName){
        DiscardedItem item = new DiscardedItem();
        item.setItemName(itemName);
        item.setPrice(price);
        item.setWarehouseName(warehouseName);
        discardedItemList.add(item);
        return item;
    }
    
    public void deleteDiscardedItem(DiscardedItem discardedItem){
        discardedItemList.remove(discardedItem);
    }
}
