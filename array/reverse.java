public class reverse {
    public static void main(String[] args) {
        int[] arr = {120, 130, 140, 150, 160};
        int j = arr.length;
        int n = j / 2;
        int temp;

        System.out.print("Before: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();

        for (int i = 0; i < n; i++) {
            temp = arr[i];
            arr[i] = arr[j - 1 - i];
            arr[j - 1 - i] = temp;
        }

        System.out.print("After:  ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
}
