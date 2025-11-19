import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Scanner withdrawal = new Scanner(System.in);

        System.out.print("Enter withdrawal amount: ");
        int with = withdrawal.nextInt();

        if (with > 100) {
            System.out.println("You are eligible for withdrawal.");
        } else {
            System.out.println("You are not eligible for withdrawal.");
        }
    }
}
