import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean result = true;
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                continue;
            }
            if (array[i] == m && array[i - 1] == n || array[i] == n && array[i - 1] == m) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}