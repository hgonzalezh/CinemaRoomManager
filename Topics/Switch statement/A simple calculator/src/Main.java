import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = Long.parseLong(scanner.next());
        String operation = scanner.next();
        long num2 = Long.parseLong(scanner.next());
        switch (operation) {
            case "+":
                long sum = num1 + num2;
                System.out.println(sum);
                break;
            case "-":
                long subs = num1 - num2;
                System.out.println(subs);
                break;
            case "*":
                long multiplication = num1 * num2;
                System.out.println(multiplication);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Division by 0!");
                } else {
                    long division = num1 /  num2;
                    System.out.println(division);
                }
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}