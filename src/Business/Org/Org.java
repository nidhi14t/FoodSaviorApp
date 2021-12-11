/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Org;

/**
 *
 * @author nidhitiwari
 */
public class Org {
    private String ngoName;
    private String orgName;
    private String orgAddress;
    
    public Org(String orgName, String orgAddress) {
        this.orgName=orgName;
        this.orgAddress=orgAddress;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getNgoName() {
        return ngoName;
    }

    public void setNgoName(String ngoName) {
        this.ngoName = ngoName;
    }

    public String getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress;
    }
       
    public Org() {
    };
    
    @Override
    public String toString(){
        return orgName;
    }
}
