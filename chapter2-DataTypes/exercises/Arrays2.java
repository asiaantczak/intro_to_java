// can you remember how to set up your main function?
import java.util.Arrays;
import java.util.ArrayList;

public class Arrays2 {
  public static void main(String[] args) {
    // declare an array of Strings and print it
    String[] things = {"bike", "boat", "butter"};
    System.out.println(Arrays.toString(things));
    // declare an array of integers and print it
    int[] nums = {1, 2, 3};
    System.out.println(Arrays.toString(nums));
    // declare an ArrayList of integers, add numbers to it, and then print its
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(2);
    numbers.add(4);
    numbers.add(24);
    System.out.println(Arrays.toString(numbers.toArray()));
  }
}
