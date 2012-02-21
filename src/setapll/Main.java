/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package setapll;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author szaman693
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Generator g = new Generator("moja wian");
        System.out.print(g);

        Generator g2  = new Generator("twoja wina");
        System.out.print(g2);

        for (int i = 0; i < 10; i++) {
            String string = args[i];

        }

    

    }
}
