/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;
import java.util.Scanner;

/**
 *
 * @author sonam.dolma
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in); 
        final int Earth= 1;
        final double THE_MOON= 0.16;
        final double The_MARS=0.37;
        final double The_Jupiter= 2.364;
        
                
        System.out.println("Welcome to the mass calculator! WHATS IS YOUR NAME?");
        String name = m.nextLine();
        
        
        System.out.println(" Hi "+name+ "how old are you?");
        String age = m.nextLine();
        
        
        System.out.println("My, you're getting younger and younger! You sure are looking good for your age! Would you be so kind as to tell me your weight?");
        int weight = m.nextInt();
        System.out.println("Let me do a bit of analysis..........");
        System.out.println("All done! Here are the results:");
         
        int earth = weight*Earth;
        double moon= weight*THE_MOON;
        double mars= weight*The_MARS;
        double jupiter= weight*The_Jupiter;
        
        System.out.println("\nAll done here are the results...\n" );
        System.out.println("Earth: "+earth
                +"The Moon"+moon
                + "The Mars"+mars
               
                + "The Jupiter"+ jupiter);
                
    }
}
