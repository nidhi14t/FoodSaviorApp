/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author nidhitiwari
 */
public class Config {
    
    public static BusinessModel configure(){
        
        BusinessModel bm = BusinessModel.getInstance();       
        
        Employee employee = bm.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = bm.getUserAccountDirectory().createUserAccount("RRH", "sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return bm;
    }
    
}
