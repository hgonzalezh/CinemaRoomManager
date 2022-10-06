import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] > num) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}