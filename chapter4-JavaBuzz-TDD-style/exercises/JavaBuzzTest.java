import static org.junit.Assert.*;
import org.junit.Test;

public class JavaBuzzTest {

  @Test
  public void returnsJavaIfDivisibleByThree() {
    JavaBuzz javabuzz = new JavaBuzz();
    assertEquals(javabuzz.convert(3), "Java");
  }

  @Test
  public void returnBuzzIfDivisibleByFive() {
    JavaBuzz javabuzz = new JavaBuzz();
    assertEquals(javabuzz.convert(5), "Buzz");
  }
}