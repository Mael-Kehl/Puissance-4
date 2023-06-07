/**
* Represents a case of the board
* @author Maël Kehl
* @see Table
*/
public class Case{
  /**
  * In a case
  */
  private String name;

  /**
  * Creates a case conatining name
  * @param name Has the form "color"+"O"
  */
  public Case(String name){ //Constructeur
    this.name = name;
  }

  /**
  * Returns name of the Case
  * @return name
  */
  public String getName(){
    return this.name;
  }
  /**
  * Changes name
  * @param name will have the form "color"+"O"
  */
  public void setName(String name){
    this.name = name;
  }
}
