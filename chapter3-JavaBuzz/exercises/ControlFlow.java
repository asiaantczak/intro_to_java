// what imports will you need?
import java.util.Scanner;
// can you remember how to set up your main function?
public class ControlFlow {
  public static void main(String[] args) {
    // find a way to read in user input
    Scanner input = new Scanner( System.in );
    // write a method that will check if a number is odd or even
    // (assume user only ever enters integers)
    int input_num = input.nextInt();
    if (input_num % 2 == 0) {
      // print the answer to the console
      System.out.println("even");
    } else {
      System.out.println("odd");
    }
  }
}
