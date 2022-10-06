import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        boolean result = true;
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = sc.nextInt();
            if (i != 0 && array[i] < array[i - 1]) {
                result = false;
            }
        }
        System.out.println(result);
    }
}