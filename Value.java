/**
* Used to recover an input
*/
import java.util.Scanner;
/**
* Used to check for values errors
*/
import java.util.InputMismatchException;

/**
* Used to recover a user input and to verify if the value is correct
* @author Mael Kehl
* @see Game.java
*/
public class Value{
  /**
  * Variable of that will allow us to recover a value
  */
  private static Scanner entry = new Scanner(System.in);

  /**
  * Allows us to recover a value, to check if it is an integer and if it isn't to print an erro message and ask user to retry
  * @param ask is a String but we expect it to be an integer
  * @return the value entered if it was an integer
  */
  public static int Recup(String ask){
    int y;
    do {
        try {
            System.out.println(ask);
            y = entry.nextInt();
            break;
        } catch (InputMismatchException e){
            System.out.println("Recommencez, il faut entrer un chiffre !");
            entry.next();
        }
    } while (true);
    --y;
    return y;
  }

}
