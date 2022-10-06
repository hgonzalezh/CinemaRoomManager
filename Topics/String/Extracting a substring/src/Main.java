import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int lower = scanner.nextInt();
        int upper = scanner.nextInt() + 1;
        String output = input.substring(lower, upper);
        System.out.println(output);
    }
}
