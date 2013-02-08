/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operator;

import interfaces.Node;

/**
 *
 * @author Xerach
 */
public abstract class Binary extends Node{
    private double leftelement;
    private double rightelement;
    
    public double getleftelement(){
        return leftelement;
    }
    
    public double getrightelement(){
        return rightelement;
    }
    
    public void setleftelement(double number){
        leftelement = number;
    }
    
    public void setrightelement(double number){
        rightelement = number;
    }
    
}
