/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FoodAuditor;

import java.util.ArrayList;

/**
 *
 * @author nidhitiwari
 */
public class FoodAuditorDirectory {
    private ArrayList<FoodAuditor> foodAuditorList;
    private FoodAuditor foodAuditor;
    
    
    public FoodAuditorDirectory(){
        foodAuditorList = new ArrayList<FoodAuditor>();
    }

    public ArrayList<FoodAuditor> getFoodAuditorList() {
        return foodAuditorList;
    }

    public void setFoodAuditorList(ArrayList<FoodAuditor> foodAuditorList) {
        this.foodAuditorList = foodAuditorList;
    }
    
    public FoodAuditor createFoodAuditor(String  faName, String username, String address,String contact){
        FoodAuditor foodAuditor = new FoodAuditor();
        foodAuditor.setFoodAuditorUserName(username);
        foodAuditor.setFoodAuditorName(faName);
        foodAuditor.setFoodAuditorContact(contact);
        foodAuditor.setFoodAuditorAddress(address);
        foodAuditorList.add(foodAuditor);
        
        return foodAuditor;
    }
    
    public FoodAuditor getFoodAuditor(String foodAuditorName){
    for(FoodAuditor fa: foodAuditorList){
        if(fa.getFoodAuditorName() == foodAuditorName){
            return fa;
        }
    }
    return null;
    }
    
    public void updateFoodAuditor(FoodAuditor fa, String foodAuditorName, String contact,String address){
        foodAuditor.setFoodAuditorName(foodAuditorName);
        foodAuditor.setFoodAuditorAddress(address);
        foodAuditor.setFoodAuditorContact(contact);
    }
    
    public void deleteFoodAuditor(String username){
        for(int i=0;i<foodAuditorList.size();i++){
            if(foodAuditorList.get(i).getFoodAuditorUserName().equals(username)){
                foodAuditorList.remove(i);
            }
        }
    }
    
    public void deleteFoodAuditor(){
        for(int i=0;i<foodAuditorList.size();i++){
            foodAuditorList.remove(i);
        }
    }
}
