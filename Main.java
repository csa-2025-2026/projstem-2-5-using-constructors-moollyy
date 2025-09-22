import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here

    Scanner scan = new Scanner(System.in);

    // prob 1
    Circle circ1 = new Circle (10.1);
    System.out.println(circ1.toString());
    Circle circ2 = new Circle (14.0);
    System.out.println(circ2.toString());
    Circle circ3 = new Circle (20.5);
    System.out.println(circ3.toString());

    // prob 2

    System.out.println("Type a number for length and width: ");
    double lw = scan.nextDouble();
    System.out.println("type a length: ");
    double len = scan.nextDouble();
    System.out.println("type a width: ");
    double wid = scan.nextDouble();

    Rectangle rect = new Rectangle(lw);
    








  }
}
