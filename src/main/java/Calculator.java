import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Calculator class for simple arithmetics.
 */
public class Calculator {

  /**
   * The main method queries for input parameters and calculator operations, it then calls
   * appropriate method.
   */
  public static void main(String[] args) {
    System.out.println("Enter first and second number:");
    Scanner input = new Scanner(System.in, StandardCharsets.UTF_8);

    int num1 = input.nextInt();
    int num2 = input.nextInt();

    System.out.println("Enter the operation: + for addition, - for subtraction, "
        + "* for multiplication or / for division:");
    String calcOperation;
    calcOperation = input.next();

    switch (calcOperation) {
      case "+":
        System.out.println(add(num1, num2));
        break;
      case "-":
        System.out.println(sub(num1, num2));
        break;
      case "*":
        System.out.println(multiply(num1, num2));
        break;
      case "/":
        System.out.println(divideNumbers(num1, num2));
        break;
      default:
        System.out.println("No operation selected");
    }
  }

  /**
   * Method for addition.
   *
   * @param x first parameter
   * @param y second parameter
   * @return result of addition operation with two parameters
   */
  public static int add(int x, int y) {
    return x + y;
  }

  /**
   * Method for subtraction.
   */
  public static int sub(int x, int y) {
    return x - y;
  }

  /**
   * Method for multiplication.
   */
  public static int multiply(int x, int y) {
    return x * y;
  }

  /**
   * Method for division.
   */
  public static int divideNumbers(int x, int y) {
    return x / y;
  }

}