/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Logistic;

import java.util.ArrayList;

/**
 *
 * @author karpe.s@northeastern.edu
 */
public class LogisticDirectory {
     private ArrayList<Logistic> logisticList;
     
     public LogisticDirectory(){
        logisticList = new ArrayList<Logistic>();
    }
    
    public ArrayList<Logistic> getLogisticList() {
        return logisticList;
    }
    
    public Logistic createLogistic(String transport, String temperature){
        Logistic logi = new Logistic();
        logi.setTransport(transport);
        logi.setTemprature(temperature);
        logisticList.add(logi);
        
        return logi;
    }
}
