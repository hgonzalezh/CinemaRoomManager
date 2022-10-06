import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] array = new int[len];
        long product;
        long max = 0;
        for (int i = 0; i < len; i++) {
            array[i] = sc.nextInt();
            if (i != 0) {
                product = array[i] * array[i - 1];
                if (product > max) {
                    max = product;
                }
            }
        }
        System.out.println(max);
    }
}
