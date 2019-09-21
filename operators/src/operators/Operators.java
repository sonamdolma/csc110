/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
import java.util.s */
package operators;
import java.util.Scanner;

public class Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      //1 ft = 12 inches
      int f = 12;
      
      //1 inch = 2.54 cm
      double i = 2.54;
      
      System.out.println("How many feet tall are you?");
      int o =in.nextInt();
      System.out.println("How many inches are you?");
      int u =in.nextInt();
      
      // converting the user input feet into inches
      int b = f * o; 
       
      // adding conveted feet with the users input in inches
      int p = b + u;
      
      //converting the inches to cm
      double y = p * i; 
      System.out.println("You are "+y+" centimeters!" );
      
    }
}
