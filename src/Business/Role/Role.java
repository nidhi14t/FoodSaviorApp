/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.BusinessModel;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author nidhitiwari
 */
public abstract class Role {
        public enum RoleType{
        WarehouseAdmin("WarehouseAdmin"),
        Customer("Customer"),
        NgoAdmin("NgoAdmin"),
        Distributor("Distributor"),
        FoodAuditor("FoodAuditor"),
        DeliveryMan("Delivery"),
        SysAdmin("Sysadmin"),
        Volunteer("Volunteer");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            BusinessModel business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
