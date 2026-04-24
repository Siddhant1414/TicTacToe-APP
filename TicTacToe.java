import java.util.Scanner;

public class TicTacToe {

    static void convertSlot(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        System.out.println("Row: " + row);
        System.out.println("Column: " + col);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter slot (1-9): ");
        int slot = sc.nextInt();

        convertSlot(slot);
    }
}