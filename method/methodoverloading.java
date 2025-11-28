public class testwo {
    static void msg() {
        System.out.println("Hey! how are you?");
    }
    static void msg(String name) {
        System.out.println("How are you, " + name + "?");
    }
    static  void msg(String text, String text2) {
        System.out.println("I am "+ text);
    }
    public static void main(String[] args) {
        msg();
        msg("Vansh");
        msg("great", "Atharva");
    }
}
