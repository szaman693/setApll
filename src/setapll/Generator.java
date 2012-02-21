/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package setapll;

/**
 *
 * @author szaman693
 */
public class Generator {
    
    private String string;

    public Generator(String s){
        this.string = new String(s+" taki wyraz");

    }

    @Override
    public String toString() {
        return "Generator{" + "string=" + string + '}';
    }

    

}
