/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sintax_tree;

import elementaldata.Numbers;
import interfaces.Node;
import operations.Multiplicator;
import operations.Plus;


/**
 *
 * @author Xerach
 */
public class Sintax_tree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Node uno = new Numbers(1);
        Node tres = new Numbers(3);
        Node dos = new Numbers(2);
        Node mul = new Multiplicator(dos, tres);
        Node suma = new Plus(uno, mul);
        System.out.println(suma.evaluate());
//        Plus suma = new Plus();
//        Multiplicator mul = new Multiplicator();
        
    }
}
