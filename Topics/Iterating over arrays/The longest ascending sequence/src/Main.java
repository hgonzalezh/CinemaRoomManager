import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int counter = 1;
        int buffer = 1;
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = sc.nextInt();
            if (i == 0) {
                continue;
            }
            if (array[i] > array[i - 1]) {
                counter++;
                if (buffer < counter) {
                    buffer = counter;
                }

            } else {
                counter = 1;
            }
        }
        System.out.println(buffer);
    }
}