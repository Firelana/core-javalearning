    public class testwo {
        static int msg(int ...bla) {
            int value = 0;
            for (int a: bla) {
            value += a;
            }
            return value;
        }
        public static void main(String[] args) {
            int b;
        System.out.print("Calc: "+ msg(45, 65, 56, 5454));
        }
    }
