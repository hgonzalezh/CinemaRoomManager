import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int n;
        int counter = 0;
        int[] input = new int[len];
        for (int i = 0; i < len; i++) {
            input[i] = sc.nextInt();
        }
        n = sc.nextInt();
        for (int i = 0; i < len; i++) {
            if (input[i] == n) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
