import java.util.Scanner;
import java.util.InputMismatchException;

public class Value{
  private static Scanner entry = new Scanner(System.in);

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
