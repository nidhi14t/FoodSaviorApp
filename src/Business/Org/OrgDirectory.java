/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Org;

import java.util.ArrayList;

/**
 *
 * @author nidhitiwari
 */
public class OrgDirectory {
    private ArrayList<Org> orgList;
    
    public OrgDirectory(){
        orgList = new ArrayList();
    }

    public ArrayList<Org> getOrgList() {
        return orgList;
    }

    public void setOrgList(ArrayList<Org> orgList) {
        this.orgList = orgList;
    }
    
    public Org createOrg(String orgName, String orgAddress, String ngoName){
        Org org = new Org();
        org.setOrgName(orgName);
        org.setOrgAddress(orgAddress);
        org.setNgoName(ngoName);
        orgList.add(org);
        return org;
    }
    
    public void deleteOrg(Org org){
        orgList.remove(org);
    }
}
