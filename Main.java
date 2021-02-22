/**
* Used to play the game
* @author Maël Kehl
* @see Game.java Case.java Table.java Value.java
*/
public class Main{

  /**
  * main of the program, used to create a gameset and play in it
  */
  public static void main(String[] args){
    Game g = new Game(".");
    g.game();
  }
}
