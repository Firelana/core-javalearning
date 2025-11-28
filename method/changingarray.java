public class testwo {
    static void msg1(int aa[], int n[]) {
      aa[0] = 5;
    }
    public static void main(String[] args) {
        int x [] = {10, 11, 12};
        msg1(x);
        System.out.println(x[0]);
    }
}
