/**
* class that Contains a String, will be used in Table.java as an element of a board
* @author Maël Kehl
* @see Table.java
*/
public class Case{
  /**
  * Variable name contains a string of characters
  */
  private String name;

  /**
  * Allows you to create a case that contains the name you put in parameters
  * @param name will have the form "color"+"O"
  */
  public Case(String name){ //Constructeur
    this.name = name;
  }

  /**
  * Getter that returns the String contained in class case
  * @return return the variable name contained in class case
  */
  public String getName(){
    return this.name;
  }
  /**
  * Setter that takes a String in parameter
  * @param name will have the form "color"+"O"
  */
  public void setName(String name){
    this.name = name;
  }
}
