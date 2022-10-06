import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        String removeSpaceStr1 = string1.replace(" ", "").trim();
        String removeSpaceStr2 = string2.replace(" ", "").trim();
        boolean result = false;
        if (removeSpaceStr1.equalsIgnoreCase(removeSpaceStr2)) {
            result = true;
        }
        System.out.print(result);
    }
}
