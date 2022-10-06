// You don't even need arrays for this one!

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += sc.nextInt();            
        }
        System.out.println(sum);
    }
}
