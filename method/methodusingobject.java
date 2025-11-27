public class testtwo {

    int meow(int a, int b) {       
        int z;
        if (a > b) {
            z = a - b;
        } else {
            z = (b - a) * 5 + 45;
        }
return z;
      }
             
    int nya(int a1, int b1) {

                int z1;
        if (a1 < b1) {
            z1 = a1 - b1;
        } else {
            z1 = (b1 - a1) * 5 + 25;
        }
        return  z1;
      }

    public static void main(String[] args) {

        testtwo fine = new testtwo();  

        int x = 5;
        int y = 10;
        int c = fine.meow(x, y);

        int x1 = 32;
        int y1 = 45;
        int c1 = fine.nya(x1, y1);

        System.out.println(c);
        System.out.println(c1);
    }
}
