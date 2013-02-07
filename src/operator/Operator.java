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
public abstract class Operator extends Node{
    private Node leftnode;
    private Node rigthnode;
    
    public Node getleftnode(){
        return leftnode;
    }
    
    public Node getrigthnode(){
        return rigthnode;
    }
}
