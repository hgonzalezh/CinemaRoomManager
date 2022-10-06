import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        boolean result = false; 
        if (input.startsWith("J") || input.startsWith("j")) {
            result = true;
        }
        System.out.println(result);
    }
}
