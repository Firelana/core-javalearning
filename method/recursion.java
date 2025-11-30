    public class testwo {
      static int factorial(int a) {
        if(a == 0 || a == 1) {
            return 1;
        } 
        else { 
            return a * factorial(a-1);
        }
      }
        public static void main(String[] args) {
            int n = 4;
            System.out.println("Result:"+ factorial(n));
        }
    }
