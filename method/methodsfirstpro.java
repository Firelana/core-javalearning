import java.util.Scanner;
public class methodsfirstpro {
  static int meow(int a, int b) {
    int z;
    if (a > b) {
      z = a - b;
    } else {
      z = (b - a) * 5+45;
    }
    return z;
  }

  public static void main(String[] args) {
  int x = 5;
  int y = 10;
  int c;
  c = meow(x, y);
  int x1 = 32;
  int y1 = 45;
  int c1;
  c1 = meow(x1, y1);
  System.out.println(c);
  System.out.println(c1);
  }
}
