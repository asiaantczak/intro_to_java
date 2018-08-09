public class JavaBuzz {

  public String convert(int num) {
    if(num % 3 == 0) {
      return "Java";
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
