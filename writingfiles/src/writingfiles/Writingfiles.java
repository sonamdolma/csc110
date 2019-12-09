/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package writingfiles;
import java.util.Scanner;
import java.io.*;
import java.io.PrintWriter;

/**
 *
 * @author sonam.dolma
 */
public class Writingfiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
      Scanner keyboard= new Scanner(System.in);
      System.out.println("Enter the filename:");
      String filename = keyboard.nextLine();
      File file = new File(filename);
      if(file.exists()){
             System.out.println("danger");
             System.exit(0);
             
      // try, catch ,finally       
      }
      try{
         PrintWriter x = new PrintWriter(file);
         x.println("helllo world");
         x.println("\n\n\n\f yikes");
    }catch(IOException e){
        System.out.println("danger! you almsot overwrote an existing  file");
    }finally{
      //x.close();
    }
      System.out.println("data written to file");
      
      
    }
}
