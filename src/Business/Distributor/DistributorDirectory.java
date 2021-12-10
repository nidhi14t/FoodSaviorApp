/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Distributor;

import java.util.ArrayList;

import Business.DiscardedItem.DiscardedItem;
import Business.Role.DistAdminRole;

/**
 *
 * @author karpe.s@northeastern.edu
 */
public class DistributorDirectory {
    private ArrayList<Distributor> distributorList;
    private Distributor distributor;
    private DiscardedItem discardedItem;
    
    public DistributorDirectory(){
        distributorList = new ArrayList<Distributor>();
    }

    public ArrayList<Distributor> getDistributorList() {
        return distributorList;
    }

    public void setDistributorList(ArrayList<Distributor> distributorList) {
        this.distributorList = distributorList;
    }
    
    public Distributor createDistributorInfo(String distributorName, String username, String address,String contact){
        Distributor distributor = new Distributor();
        distributor.setDistAdminUserName(username);
        distributor.setDistributorName(distributorName);
        distributor.setDistributorContact(contact);
        distributor.setDistributorAddress(address);
        distributorList.add(distributor);
        
        return distributor;
    }
    
     public Distributor getDistributor(String distributorName){
        for(Distributor distributor: distributorList){
        if(distributor.getDistributorName() == distributorName){
            return distributor;
            }
        }
    return null;
    }
     
     public void updateDistributorInfo(Distributor dist,String distributorName,String contact,String address){
        dist.setDistributorName(distributorName);
        dist.setDistributorAddress(address);
        dist.setDistributorContact(contact);
    }
    
    public void deleteDistributor(String username){
        for(int i=0;i<distributorList.size();i++){
            if(distributorList.get(i).getDistAdminUserName().equals(username)){
                distributorList.remove(i);
            }
        }
    }
    
    public void deleteDistributor(){
        for(int i=0;i<distributorList.size();i++){
            distributorList.remove(i);
        }
    }
    
}
