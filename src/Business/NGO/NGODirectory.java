/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.NGO;

import Business.DiscardedItem.DiscardedItem;
import Business.NGO.NGO;
import Business.Org.Org;
import java.util.ArrayList;

/**
 *
 * @author nidhitiwari
 */
public class NGODirectory {
    private ArrayList<NGO> ngoList;
    private NGO ngo;
    private Org org;
    
    
    public NGODirectory(){
        ngoList = new ArrayList<NGO>();
    }

    public ArrayList<NGO> getNGOList() {
        return ngoList;
    }

    public void setNGOList(ArrayList<NGO> ngoList) {
        this.ngoList = ngoList;
    }
    
    public NGO createNGOInfo(String  ngoName, String username, String address,String contact){
        NGO ngo = new NGO();
        ngo.setNgoAdminUserName(username);
        ngo.setNgoName(ngoName);
        ngo.setNgoContact(contact);
        ngo.setNgoAddress(address);
        ngoList.add(ngo);
        
        return ngo;
    }
    
    public NGO getNGO(String ngoName){
    for(NGO ngo: ngoList){
        if(ngo.getNgoName() == ngoName){
            return ngo;
        }
    }
    return null;
    }
    
    public void updateNGO(NGO ngo, String ngoName, String contact, String address){
        ngo.setNgoName(ngoName);
        ngo.setNgoAddress(address);
        ngo.setNgoContact(contact);
    }
    
    public Org AddOrg(NGO ngo, String orgName, String orgAddress){
        org=new Org(orgName, orgAddress);
        ngo.addOrg(org);
        return org;
    }
    
    public void DeleteOrg(NGO ngo,Org org){
        ngo.removeOrg(org);
        
    }
    
    public void deleteNGO(String username){
        for(int i=0;i<ngoList.size();i++){
            if(ngoList.get(i).getNgoAdminUserName().equals(username)){
                ngoList.remove(i);
            }
        }
    }
    
    public void deleteNGO(){
        for(int i=0;i<ngoList.size();i++){
            ngoList.remove(i);
        }
    }
}
