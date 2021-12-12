/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Volunteer;

import java.util.ArrayList;

/**
 *
 * @author nidhitiwari
 */
public class VolunteerDirectory {
    private ArrayList<Volunteer> volunteerList;
    
    public VolunteerDirectory(){
        volunteerList = new ArrayList<Volunteer>();
    }
    
    public ArrayList<Volunteer> getDeliveryManList() {
        return volunteerList;
    }

    public void setDeliveryManList(ArrayList<Volunteer> volunteerList) {
        this.volunteerList = volunteerList;
    }

    public ArrayList<Volunteer> getVolunteerList() {
        return volunteerList;
    }

    public void setVolunteerList(ArrayList<Volunteer> volunteerList) {
        this.volunteerList = volunteerList;
    }
    
    private Volunteer volunteer;

    public Volunteer getVolunteer() {
        return volunteer;
    }

    public void setDeliveryMan(Volunteer volunteer) {
        this.volunteer = volunteer;
    }
    
    public Volunteer createVolunteer(String username){
        volunteer= new Volunteer(username);
        volunteerList.add(volunteer);
        return volunteer;
    }
    
    
    public Volunteer createVolunteer(String name, String username){
        Volunteer vol = new Volunteer();
        vol.setName(name);
        vol.setUserName(username);
        volunteerList.add(vol);
        
        return vol;
    }
    
        public void updateVolunteer(Volunteer volt, String name, String username){
        volt.setName(name);
        volt.setUserName(username);
    }
    
    public Volunteer getDeliveryMan(String firstName){
        for(Volunteer vol: volunteerList){
            if(vol.getFirstName().equalsIgnoreCase(firstName)){
                return vol;
            }
        }
        return null;
    }
         
    public void deleteVolunteer(String username){
         for(int i=0;i<volunteerList.size();i++){
            if(volunteerList.get(i).getUserName().equals(username)){
                volunteerList.remove(i);
            }
        }
    }
}
