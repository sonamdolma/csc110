/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanner;
import java.util.Scanner;
/**
 *
 * @author sonam.dolma
 */
public class Adder{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        int y;
        
        System.out.println("Give me your first digit");
        x = in.nextInt();
        System.out.println("Give me the second digit");
        y = in.nextInt();
        int z;
        
        z = x + y;
        System.out.println(z);        
        
                
    }
}
