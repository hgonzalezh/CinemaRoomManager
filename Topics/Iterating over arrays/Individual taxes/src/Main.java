import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int companies = sc.nextInt();
        int[] yearlyIncome = new int[companies];
        int[] taxes = new int[companies];
        int mostTaxes = 1;
        for (int i = 0; i < companies; i++) {
            yearlyIncome[i] = sc.nextInt();
        }
        for (int i = 0; i < companies; i++) {
            taxes[i] = sc.nextInt();
            int total = yearlyIncome[i] * taxes[i];
            if (i != 0) {
                int totalPrevious = yearlyIncome[i - 1] * taxes[i - 1];
                if (total > totalPrevious) {
                    mostTaxes = i + 1;
                }
            }
        }
        System.out.println(mostTaxes);
    }
}