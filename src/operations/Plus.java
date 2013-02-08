/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

import operator.Binary;

/**
 *
 * @author Xerach
 */
public class Plus extends Binary{

    @Override
    public double evaluate() {
        return this.getleftelement()+this.getrightelement();
    }
    
}
