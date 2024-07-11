import java.util.Scanner;

class NormalPizza {
  public NormalPizza(int input1) {
    switch (input1) {
      case 1:
        System.out.println("=======Normal Pizza=======");
        System.out.println("1. Veg Pizza");
        System.out.println("2. Nonveg Pizza");
        System.out.println("==========================/n");

        Scanner sc1 = new Scanner(System.in);
        System.out.print(" >>>");
        int normalPizzaInput1 = sc1.nextInt();
        new NormalVegPizza(normalPizzaInput1);
        sc1.close();
        break;
      case 2:
        System.out.println("=======Normal Pizza=======");
        System.out.println("1. Veg Pizza");
        System.out.println("2. Nonveg Pizza");
        System.out.println("==========================/n");

        Scanner sc2 = new Scanner(System.in);
        System.out.print(" >>>");
        int normalPizzaInput2 = sc2.nextInt();
        new NormalVegPizza(normalPizzaInput2);
        sc2.close();
        break;

      default:
        break;
    }

  }

}

class NormalVegPizza {
  public NormalVegPizza(int normalPizzaInput1) {

    switch (normalPizzaInput1) {
      case 1:
        System.out.println("=====Normal Veg Pizza=====");
        System.out.println("1. Extra Chess");
        System.out.println("2. Extra Topping");
        System.out.println("==========================/n");

        Scanner sc = new Scanner(System.in);
        System.out.print(" >>>");
        int normalPizzaEXtraChessInput1 = sc.nextInt();
        new NormalVegExtraCheesPizza(normalPizzaEXtraChessInput1);
        sc.close();
        break;

      default:
        break;
    }
  }
}

class NormalVegExtraCheesPizza {
  public NormalVegExtraCheesPizza(int normalPizzaEXtraChessInput1) {
    // ===========================================
    // ===========================================
    // ===========================================
    System.out.println("550$");
  }
}

public class Main {
  public static void main(String[] args) {
    System.out.println("==========================");
    System.out.println("1. Normal Pizza");
    System.out.println("2. Delux Pizza");
    System.out.println("==========================/n");

    Scanner sc = new Scanner(System.in);
    System.out.print(" >>>");
    int input1 = sc.nextInt();
    new NormalPizza(input1);
    sc.close();
  }
}