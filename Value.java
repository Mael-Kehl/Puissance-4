
import java.util.Scanner;
import java.util.InputMismatchException;

/**
* Used to recover user's input and to verify if the value is correct
* @author Mael Kehl
* @see Game
*/
public class Value{
  /**
  * input
  */
  private static Scanner entry = new Scanner(System.in);

  /**
  * Recovers a value with Errors management
  * @param ask Choice instruction
  * @return y only if it is an integer
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
