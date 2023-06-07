/**
* Used to control all the game's process
* @author Maël Kehl
* @see Table
* @see Main
*/
public class Game{
  /**
  * Board
  */
  public Table grille;
  /**
  * Used to stop the game if someone wins
  */
  private boolean win=false;
  /**
  * Used to count the number of game turns
  */
  private int count=0;

  /**
  * Constructs a gameset (board)
  * @param name in every case of the board
  */
  public Game(String name){
    this.grille = new Table(name);
  }

  /**
  * Places a coin (O in yellow or red) in a column
  * @param y column numbers
  */
  public void setCasePlayer(int y){
    for(int i=grille.array.length-1; i>=0; i--)//Il y a 6 cases dans le tableau, mais il va de 0 à 5
      if(grille.array[i][y].getName() == ".")
      {
        if (count%2==0){
          grille.setCase(i,y,"\033[31m"+"O");
          return;
        }else{
          grille.setCase(i,y,"\033[33m"+"O");
          return;
        }
      }
  }
  /**
  * Checks if parameter is between 0 and 6
  * @param y number to check
  */
  public boolean Verif(int y){
    return(y>=0&&y<=6);
  }

  /**
  * All game's process with Value recover, Test etc.
  */
  public void game(){
    System.out.print("\033[H\033[2J"); //Clear
    while(count!=42&&win!=true){
      this.grille.printTable();
      int y = Value.Recup("\033[37m"+"Entrez le numéro de la colonne que vous souhaitez modifier : ");
      if(!Verif(y)){
        System.out.print("\033[H\033[2J"); //Clear
        continue;
      }
      setCasePlayer(y);
      count++;
      if(this.grille.colTest()==true||this.grille.ligneTest()==true||this.grille.diagTest()==true)win=true;
      System.out.print("\033[H\033[2J"); //Clear
    }
    this.grille.printTable();
    if(count%2==0){
      System.out.println("\033[37m"+"Le joueur "+"\033[33m"+"O"+"\033[37m"+" a gagné !");
    }else{
      System.out.println("\033[37m"+"Le joueur "+"\033[31m"+"O"+"\033[37m"+" a gagné !");
    }
  }
}
