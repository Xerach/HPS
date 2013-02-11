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
public class Multiplicator extends Binary{

    public Multiplicator(Node leftelement, Node rightelement) {
        super(leftelement, rightelement);
    }

    @Override
    public double evaluate() {
        return getleftelement()*getrightelement();
    }

    
}
