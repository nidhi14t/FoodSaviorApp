/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Logistic;

/**
 *
 * @author karpe.s@northeastern.edu
 */
public class Logistic {
    private String transport;
    private String temprature;

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getTemprature() {
        return temprature;
    }

    public void setTemprature(String temprature) {
        this.temprature = temprature;
    }
    
    @Override
    public String toString() {
        return transport;
    }
}
