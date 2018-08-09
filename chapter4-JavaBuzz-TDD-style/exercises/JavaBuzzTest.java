import static org.junit.Assert.*;
import org.junit.Test;

public class JavaBuzzTest {

  JavaBuzz javabuzz = new JavaBuzz();

  @Test
  public void returnsJavaIfDivisibleByThree() {
    assertEquals(javabuzz.convert(3), "Java");
  }

  @Test
  public void returnBuzzIfDivisibleByFive() {
    assertEquals(javabuzz.convert(5), "Buzz");
  }

  @Test
  public void returnJavaBuzzIfDivisibleByFiveAndThree() {
    assertEquals(javabuzz.convert(15), "JavaBuzz");
  }

  @Test
  public void returnNumIfNotDivisibleByThreeFiveOrFifteen() {
    assertEquals(javabuzz.convert(2), "2");
  }
}
