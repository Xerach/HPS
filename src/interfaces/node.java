/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Xerach
 */
public abstract interface node {
    node nodeunary(node one);
    node nodebinary(node one, node two);
}
