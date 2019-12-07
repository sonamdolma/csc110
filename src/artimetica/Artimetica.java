/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artimetica;

import java.util.Scanner;

/**
 *
 * @author sonamdolma
 */
public class Artimetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num;
        double square; 
        double quadruple;
        int num1;
        int num2;
        final int inchesInfoot= 12;
        double cmToInches = 2.54;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number to square: ");
        num = in.nextDouble();
        System.out.println(square(num)); 
        System.out.println("Please enter a number:");
        num = in.nextDouble();
        System.out.print(quadruple(num));
        System.out.println("please enter your first number:");
        num1= in.nextInt();
        System.out.println("please enter your second digit");
        num2= in.nextInt();
   
        System.out.println(division(num1,num2));
        System.out.println("please enter your height in centimeters");
        double height = in.nextDouble();
        
        System.out.println(ftinches(cmToInches,height));
        
    }
    public static double square(double num) 
    {
        return num * num;
    }

    private static double quadruple(double num) {
        return num*4;
    }
    


    private static String division(int num1, int num2) {
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        
        return quotient + "R" + remainder;
    }  
    private static String ftinches(double cmToInches, double height){
        double feet = height /cmToInches; 
        double inchesInfoot= 12;
        double inches = feet/ inchesInfoot;
        return feet+ "ft" + inches+ "In";
      
        
    }
    
}
