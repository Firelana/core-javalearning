import java.util.Scanner;
public class testing {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
  System.out.print("Enter a Number 1: ");
 int a = sc.nextInt();
  System.out.print("Enter a Number 2: ");
 int b = sc.nextInt();
  System.out.print("Type any operator from * / - + %");
 char ops = sc.next().charAt(0); 
 switch (ops) {
    case '*':
        System.out.print("Result: " + (a * b));
        break;
    case '/':
        System.out.print("Result: " + (a / b));
        break;
    case '-':
        System.out.print("Result: " + (a - b));
        break;
    case '+':
        System.out.print("Result: " + (a + b));
        break;
    case '%':
        System.out.print("Result: " + (a % b));
        break;
    default:
        System.out.print("Invalid Operator");
 }

    }
}
