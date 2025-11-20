import java.util.Scanner;
import java.util.Random;
public class testing {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Welcome to Rock, Paper, Scissor Game!\t");

      // Human Part
      System.out.print("Please choose your moves in digits\n1. Rock\n2. Paper\n3. Scissor\nEnter the Number: ");
      int human = sc.nextInt(3);
              if(human == 0) {
            human = 1;
        }

      //  What did Human choose?
      switch (human) {
        case 1:
          System.out.println("System:  You chose Rock");
          break;
        case 2:
          System.out.println("System:  You chose Paper");
          break;
        case 3:
          System.out.println("System:  You chose Scissor");
          break;
        default:
          System.out.println("System:  Invalid Input!");
          break;
      }

      System.out.println("------------------------------------------");

      // AI part
      Random rnd = new Random();
      int AI = rnd.nextInt(3);
             if(AI == 0) {
            AI = 1;
        }

      // What did AI choose?
      switch (AI) {
        case 1:
          System.out.println("System:  AI chose Rock");
          break;
        case 2:
          System.out.println("System:  AI chose Paper");
          break;
        case 3:
          System.out.println("System:  AI chose Scissor");
          break;
        default:
          System.out.println("System:  Invalid Input!");
          break;
      }

          // Logical part
  System.out.println("------------------------------------------");

if (human == AI) {
    System.out.println("System: Match Tie!");
}
else if (
    (human == 1 && AI == 3) ||   // Rock beats Scissor
    (human == 2 && AI == 1) ||   // Paper beats Rock
    (human == 3 && AI == 2)      // Scissor beats Paper
) {
    System.out.println("System: You won, Congratulations!");
}
else {
    System.out.println("System: You lost!");
}

System.out.println("------------------------------------------");
System.out.println(":) Please try again,\nMade by Atharva");
      }
    }
