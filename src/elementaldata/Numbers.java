/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package elementaldata;

import interfaces.Node;

/**
 *
 * @author Xerach
 */
public class Numbers extends Node{
    private double num;
    
    void numbers(double number){
        num = number;
    }
    
    @Override
    public double evaluate() {
        return getnumber();
    }
    
    public double getnumber(){
        return num;
    }
    
    public void setnumber(double number){
        num = number;
    }
}
