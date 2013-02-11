/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

import interfaces.Node;
import operator.Binary;

/**
 *
 * @author Xerach
 */
public class Plus extends Binary{

    public Plus(Node leftelement, Node rightelement) {
        super(leftelement, rightelement);
    }

    @Override
    public double evaluate() {
        return getleftelement()+getrightelement();
    }
    
}
