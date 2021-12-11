/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.BusinessModel;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DeliveryManRole.DeliveryManWorkAreaJPanel;

/**
 *
 * @author 19295
 */
public class DeliveryManRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, BusinessModel business) {
        return new DeliveryManWorkAreaJPanel(userProcessContainer,account, business);
    }
    
}
