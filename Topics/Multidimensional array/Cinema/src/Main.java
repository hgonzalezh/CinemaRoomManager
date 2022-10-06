import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalRows = sc.nextInt();
        int seatsRow = sc.nextInt();
        int[][] seats = new int[totalRows][seatsRow];
        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < seatsRow; j++) {
                seats[i][j] = sc.nextInt();
            }
        }
        int emptySeats = sc.nextInt();
        int availableRow = 0;
        int counter;
        for (int i = 0; i < totalRows; i++) {
            counter = 0;
            for (int j = 0; j < seatsRow; j++) {
                if (seats[i][j] == 0) {
                    ++counter;
                    if (counter == emptySeats) {
                        availableRow = i + 1;
                        break;
                    }
                } else {
                    counter = 0;
                }
            }
            if (availableRow != 0) {
                break;
            }
        }
        System.out.println(availableRow);
    }
}