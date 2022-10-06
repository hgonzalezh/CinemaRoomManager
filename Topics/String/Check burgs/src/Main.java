import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean endsWithBurg = input.endsWith("burg");
        System.out.println(endsWithBurg);
    }
}