/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.BusinessModel;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CustomerRole.CustomerWorkAreaJPanel;
import userinterface.WarehouseAdminRole.AdminWorkAreaJPanel;

/**
 *
 * @author piyus
 */
public class CustomerRole extends Role{
        @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, BusinessModel business) {
        return new CustomerWorkAreaJPanel(userProcessContainer,
        account, business
        );
    }
}
