class Class1<T> {
  T num1;

  public Class1(T num1) {
    System.out.println(num1);
  }

  public <T> void Class2(T num2) {
    System.out.println(num2);
  }
}

public class data {
  public static void main(String[] args) {
    Class1<Double> obj1 = new Class1<>(22.00);
    obj1.Class2(123);
    Class3(990.088);
    data obj2 = new data();
    obj2.<Integer>Class4(554433);
  }

  static <T> void Class3(T num3) {
    System.out.println(num3);
  }

  <T> void Class4(T num4) {
    System.out.println(num4);
  }

}
