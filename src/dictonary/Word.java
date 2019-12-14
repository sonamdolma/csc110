/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictonary;

/**
 *
 * @author sonamdolma
 */
public class Word {
    
  private String  name, 
               definition, 
               synonyms,
               antonyms;
  
  public String getName(){
      return name;
 
  }
  
  public String getDefinition(){
      return definition;
 
  }
  public String getSynonyms(){
      return synonyms;
 
  }
  public String getAntonyms(){
      return antonyms;
 
  }
   public void  setName(String s){
      name = s;
 
  }
  
  public void  setDefinition(String s){
     definition = s;
 
  }
  public void setSynonyms(String s){
      synonyms = s;
      
 
  }
  public void setAntonyms(String s){
      antonyms = s;
      
 
 
 
  }
}
