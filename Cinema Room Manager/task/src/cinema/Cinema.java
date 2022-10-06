package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Input for size of the room */
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seatsPerRow = sc.nextInt();
        String[][] room = createRoom(rows, seatsPerRow);

        /* Display Menu */
        boolean exit = false;
        int menuOption;
        while (!exit) {
            System.out.println("\n1. Show the seats\n2. Buy a ticket\n3. Statistics\n0. Exit");
            menuOption = sc.nextInt();
            switch (menuOption) {
                case 1:
                    printRoom(rows, seatsPerRow, room);
                    break;
                case 2:
                    buyTickets(sc, rows, seatsPerRow, room);
                    break;
                case 3:
                    showStatistics(rows, seatsPerRow, room);
                    break;
                case 0:
                    exit = true;
                    break;
                default:

            }
        }
    }

    static String[][] createRoom(int rows, int seatsPerRow) {
        String[][] room = new String[rows][seatsPerRow];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                room[i][j] = " S";
            }
        }
        return room;
    }

    static void printRoom(int rows, int seatsPerRow, String[][] room) {
        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 0; i < seatsPerRow; i++) {
            System.out.print(" " + (i + 1));
        }
        System.out.println();
        for (int i = 0; i < rows; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < seatsPerRow; j++) {
                System.out.print(room[i][j]);
            }
            System.out.println();
        }
    }

    static void buyTickets(Scanner sc, int rows, int seatsPerRow,String[][] room) {
        boolean isSeatValid = false;
        int rowNum;
        int seatNum;
        int seatPrice;
        int totalSeats = rows * seatsPerRow;
        final int seatLimit = 60;
        do {
            System.out.println("Enter a row number:");
            rowNum = sc.nextInt();
            System.out.println("Enter a seat number in that row:");
            seatNum = sc.nextInt();
            if (rowNum < 1 || rowNum > rows || seatNum < 1 || seatNum > seatsPerRow) {
                System.out.println("Wrong input!");
            } else if (room[rowNum - 1][seatNum - 1].equals(" B")) {
                System.out.println("That ticket has already been purchased!");
            } else {
                isSeatValid = true;
            }
        } while (!isSeatValid);
        if (totalSeats <= seatLimit) {
            seatPrice = 10;
            System.out.println("Ticket price: $" + seatPrice);
        } else {
            int halfRows = rows / 2;
            seatPrice = rowNum <= halfRows ? 10: 8;
            System.out.println("Ticket price: $" + seatPrice);
        }
        room[rowNum - 1][seatNum - 1] = " B";
    }

    static void showStatistics(int rows, int seatsPerRow, String[][] room) {
        int purchasedTickets = 0;
        int totalSeats = rows * seatsPerRow;
        float percentageSoldSeats;
        int profit;
        final int seatLimit = 60;
        int currentIncome = 0;

        if (totalSeats <= seatLimit) {
            int pricePerSeat = 10;
            profit = totalSeats * pricePerSeat;
        } else {
            int halfRows = rows / 2;
            int price1stHalf = 10;
            int price2ndHalf = 8;
            if (rows % 2 == 0) {
                profit = price1stHalf * halfRows * seatsPerRow + price2ndHalf * halfRows * seatsPerRow;

            } else {
                profit = price1stHalf * halfRows * seatsPerRow + price2ndHalf * (halfRows + 1) * seatsPerRow;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                if (room[i][j].equals(" B")) {
                    purchasedTickets++;
                    if (totalSeats <= seatLimit) {
                        currentIncome += 10;
                    } else {
                        if (i + 1 <= rows / 2) {
                            currentIncome += 10;
                        } else {
                            currentIncome += 8;
                        }
                    }
                }
            }
        }
        percentageSoldSeats = 100f * purchasedTickets / totalSeats;

        System.out.println("Number of purchased tickets: " + purchasedTickets);
        System.out.printf("Percentage: %.2f%%\n", percentageSoldSeats);
        System.out.println("Current income: $" + currentIncome);
        System.out.println("Total income: $" + profit);
    }
}
