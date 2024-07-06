import java.util.Scanner;

class Pizza {
  Scanner sc = new Scanner(System.in);
  boolean normalPizza;
  boolean deluxlPizza;
  boolean nonVeg;
  boolean pureVeg;

  public void NormalPizzaOptions() {
    System.out.println("=============================");
    System.out.println("* ** *** SELECT ONE *** ** *");
    System.out.println("Press (1): Nonveg Pizza (400$)");
    System.out.println("Press (2): Pureveg Pizza (300$)");
    System.out.println("=============================\n");
    int normalPizzaInput = sc.nextInt();

  }

  public void addExtraChees() {

  }

  public void addExtraTopinig() {

  }

  public void addExtraSomething() {

  }
}

class NormalPizza extends Pizza {

}

public class Main {
  public static void main(String[] args) {
    System.out.println("=============================");
    System.out.println("* ** *** SELECT ONE *** ** *");
    System.out.println("Press (1): Normal Pizza ");
    System.out.println("Press (2): Delux Pizza");
    System.out.println("=============================\n");

    Scanner sc = new Scanner(System.in);
    int firstInput = sc.nextInt();
    switch (firstInput) {
      case 1:
        // NormalPizza objNormalPizza = new NormalPizza();

        break;

      default:
        break;
    }
    sc.close();

  }
}