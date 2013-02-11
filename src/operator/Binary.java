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
    private final Node leftelement;
    private final Node rightelement;

    public Binary(Node leftelement, Node rightelement) {
        this.leftelement = leftelement;
        this.rightelement = rightelement;
    }
    
    public double getleftelement(){
        return leftelement.evaluate();
    }
    
    public double getrightelement(){
        return rightelement.evaluate();
    }
    
}
