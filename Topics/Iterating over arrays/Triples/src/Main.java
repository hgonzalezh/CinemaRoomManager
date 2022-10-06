import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int counter = 0;
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = sc.nextInt();
            if (i == 0 || i == 1) {
                continue;
            }
            if (array[i] == (array[i - 1] + 1) && array[i - 1] == (array[i - 2] + 1)) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}