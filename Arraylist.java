import java.io.IOException;
import java.util.Scanner;

public class Arraylist {

  public static void main(String[] args) {

    String str = "new world is this";
    String[] strArr = str.split(" ");
    for (String n : strArr) {
      System.out.println(n);
    }
  }
}
