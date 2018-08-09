public class JavaBuzz {

  public String convert(int num) {
    if (num % 15 == 0) {
      return "JavaBuzz";
    }
    else if(num % 3 == 0) {
      return "Java";
    } else if (num % 5 == 0) {
      return "Buzz";
    }
    return String.valueOf(num);
  }

  public static void main (String[] args) {
    JavaBuzz javaBuzz = new JavaBuzz();

    for (int num = 0; num <= 100; num ++) {
      javaBuzz.convert(num);
    }

  }
}
