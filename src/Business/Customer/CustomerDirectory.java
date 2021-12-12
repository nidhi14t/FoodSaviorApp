/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author piyus
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        this.customerList = new ArrayList<Customer>();
    }

    private Customer customer;
    
    public Customer getCustomer(String firstName){
        for(Customer customer: customerList){
            if(customer.getFirstName().equalsIgnoreCase(firstName)){
                return customer;
            }
        }
        return null;
    }
    
    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
  
    public Customer createCustomer(String username){
        customer= new Customer(username);
        customerList.add(customer);
        return customer;
    }
    
    public Customer createCustomer(String name, String username, String address, String state, String city, String zip, String contact){
        Customer cust = new Customer();
        cust.setUsername(username);
        cust.setFirstName(name);
        cust.setAddress(address);
        cust.setState(state);
        cust.setCity(city);
        cust.setContact(contact);
        cust.setZip(zip);
        customerList.add(cust);  
        return cust;
    }
    
    public void deleteCustomer(String username){
        for(int i=0;i<customerList.size();i++){
            if(customerList.get(i).getUsername().equals(username)){
                customerList.remove(i);
            }
        }
    }
           
    public void updateCustomer(Customer cust,String name,String username){    
        cust.setUsername(username);
        cust.setFirstName(name);
        
    }
}
