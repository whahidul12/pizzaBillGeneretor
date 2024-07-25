import java.io.IOException;
import java.util.Scanner;

public class Arraylist {

  public static void main(String[] args) throws IOException {

    Scanner dd = new Scanner(System.in);

    int a = dd.nextInt();
    double b = dd.nextDouble();

    dd.nextLine();
    String c = dd.nextLine();
    dd.close();

    System.out.println("String: " + c);
    System.out.println("Double: " + b);
    System.out.println("Integer: " + a);
    System.out.printf(c, args);
  }

}
