/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package number;

import interfaces.Node;


/**
 *
 * @author Xerach
 */
public class Numbers extends Node{
    private double value;

    public Numbers(double val){
        value = val;
    }

    public double getvaluenumbers(){
        return this.value; 
    }
    
    public void setvaluenumbers(double val){
        this.value = val;
    }    

    @Override
    public double evaluate() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return this.value;
    }
}
