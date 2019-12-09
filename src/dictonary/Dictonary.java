/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictonary;
import java.util.Scanner;

/**
 *
 * @author sonamdolma
 */
public class Dictonary {

    /**
     * @param args the command line arguments
     */
    
    static Word W1 = new Word();
    static Word W2 = new Word();
    static Word W3 = new Word();
    static Word W4 = new Word();
    static Word W5 = new Word();
    
    public static void main(String[] args) {
       Scanner user_input = new Scanner(System.in);
       
       W1.setName("holiday");
       W1.setAntonyms("working day");
       W1.setDefinition("a day of fesstivity");
       W1.setSynonyms("public holiday");
       
       
       W2.setName("easy");
       W2.setAntonyms("hard");
       W2.setDefinition("achieve without great aeffort");
       W2.setSynonyms("noeffort");
       
       Word W3 = new Word();
       W3.setName("friends");
       W3.setAntonyms("enemies");
       W3.setDefinition("the person who knows you  the best");
       W3.setSynonyms("companion");
       
       
       Word W4 = new Word();
       W4.setName("hard");
       W4.setAntonyms("easy");
       W4.setDefinition("acieve with great effort");
       W4.setSynonyms("great effort");
       
       Word W5 = new Word(); 
       W5.setName("fight");
       W5.setAntonyms("getting along");
       W5.setDefinition("not happy with eachother");
       W5.setSynonyms("dispute");
   
       System.out.println("Choose words from the following \n"+
               "-----------------------------");
       System.out.println("1) "+ W1.getName());
       System.out.println("2) "+W2.getName());
       System.out.println("3) "+W3.getName());
       System.out.println("4) "+W4.getName());
       System.out.println("5) "+W5.getName());
       System.out.println("Type the word you chose");
       
       String n = user_input.nextLine();
       n=n.replaceAll(" ", "");
      
     
      while(true)
      {
      if (W1.getName().equals(n))
          print(W1);
      else if(W2.getName().equals(n))
          print(W2);
      else if (W3.getName().equals(n))
          print(W3);
      else if (W4.getName().equals(n))
          print(W4);
      else if (W5.getName().equals(n))
          print (W5);
      else if (n.equals("i'mdone"))
           break;
      
       System.out.println("Type the word you chose");
       n = user_input.nextLine();
       n=n.replaceAll(" ", "");
      
      
      }
      
      
    }
     public static void print(Word w){
         System.out.println(w.getName());
         System.out.println(w.getDefinition());
         System.out.println(w.getSynonyms());
         System.out.println(w.getAntonyms());
         
         
     }
       
    
    
}
