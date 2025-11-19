import java.util.Scanner;
public class testing {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
  int age;
         System.out.println("Job Experince");
age = sc.nextInt();
if(age > 30) {
    System.out.println("You are experienced");
}
else if(age >= 22) {
    System.out.println("You are a Fresher");
}
else if(age >= 18) {
    System.out.println("Internship Level");
}
else {
    System.out.println("Not eligible");
}

    }
}
