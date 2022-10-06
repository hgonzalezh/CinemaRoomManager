import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = sc.nextInt();
        }
        for (int element : array) {
            min = element < min ? element : min;
        }
        System.out.println(min);
    }
}