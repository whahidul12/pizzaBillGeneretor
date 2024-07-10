import java.util.Scanner;

class Pizza {
  Scanner sc = new Scanner(System.in);
  boolean normalPizza;
  boolean deluxlPizza;
  boolean nonVeg;
  boolean pureVeg;

}

class NormalPizza extends Pizza {
  public void VegOrNonVegPizza() {
    System.out.println("/n===============================");
    System.out.println("* ** *** SELECT ONE *** ** *");
    System.out.println("Press (1): Nonveg Pizza (400$)");
    System.out.println("Press (2): Pureveg Pizza (300$)");
    System.out.println("===============================\n");
    int normalPizzaInput = sc.nextInt();
    System.out.println(normalPizzaInput);
    sc.close();

  }
}

class DeluxPizza extends Pizza {
  public void VegOrNonVegPizza() {
    System.out.println("/n===============================");
    System.out.println("* ** *** SELECT ONE *** ** *");
    System.out.println("Press (1): Nonveg Pizza (500$)");
    System.out.println("Press (2): Pureveg Pizza (400$)");
    System.out.println("===============================\n");
    int deluxPizzaInput = sc.nextInt();

    switch (deluxPizzaInput) {
      case 1:
        System.out.println("/n===============================");
        System.out.println("* ** *** SELECT ONE *** ** *");
        System.out.println("Press (1): large size (600$)");
        System.out.println("Press (2): Extra large size (700$)");
        System.out.println("===============================\n");

        int deluxNonVegPizza = sc.nextInt();

        break;
      case 2:
        System.out.println("/n===============================");
        System.out.println("* ** *** SELECT ONE *** ** *");
        System.out.println("Press (1): large size (600$)");
        System.out.println("Press (2): Extra large size (700$)");
        System.out.println("===============================\n");

        int deluxPureVegPizza = sc.nextInt();

      default:
        break;
    }
    System.out.println(deluxPizzaInput);
    sc.close();

  }
}

public class Main {
  public static void main(String[] args) {
    System.out.println("===============================");
    System.out.println("* ** *** SELECT ONE *** ** *");
    System.out.println("Press (1): Normal Pizza ");
    System.out.println("Press (2): Delux Pizza");
    System.out.println("===============================\n");

    Scanner sc = new Scanner(System.in);
    int firstInput = sc.nextInt();

    NormalPizza objNormalPizza = new NormalPizza();
    DeluxPizza objDeluxPizza = new DeluxPizza();

    switch (firstInput) {
      case 1:
        objNormalPizza.VegOrNonVegPizza();
        break;
      case 2:
        objDeluxPizza.VegOrNonVegPizza();
        break;

      default:
        System.out.println("Somthing went Worng");
        break;
    }
    sc.close();

  }
}