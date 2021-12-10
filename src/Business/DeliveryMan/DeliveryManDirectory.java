/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author karpe.s@northeastern.edu
 */
public class DeliveryManDirectory {
     private ArrayList<DeliveryMan> deliveryManList;

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }
    
    public DeliveryManDirectory(){
        deliveryManList = new ArrayList<DeliveryMan>();
    }
    
    public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(ArrayList<DeliveryMan> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }
    
    private DeliveryMan deliveryMan;
    
    public DeliveryMan createDeliveryMan(String username){
        deliveryMan= new DeliveryMan(username);
        deliveryManList.add(deliveryMan);
        return deliveryMan;
    }
    
    
    public DeliveryMan createDeliveryMan(String name, String username){
        DeliveryMan deli = new DeliveryMan();
        deli.setName(name);
        deli.setUserName(username);
        deliveryManList.add(deli);
        
        return deli;
    }
    
    public DeliveryMan getDeliveryMan(String firstName){
        for(DeliveryMan deliveryMan: deliveryManList){
            if(deliveryMan.getFirstName().equalsIgnoreCase(firstName)){
                return deliveryMan;
            }
        }
        return null;
    }
         
    public void deleteDeliveryMan(String username){
         for(int i=0;i<deliveryManList.size();i++){
            if(deliveryManList.get(i).getUserName().equals(username)){
                deliveryManList.remove(i);
            }
        }
    }
}
