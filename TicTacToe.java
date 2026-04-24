import java.util.Random;

public class TicTacToe {

    static char playerSymbol;
    static char computerSymbol;
    static boolean playerTurn;

    static void toss() {
        Random rand = new Random();
        int result = rand.nextInt(2); // 0 or 1

        if(result == 0) {
            playerTurn = true;
            playerSymbol = 'X';
            computerSymbol = 'O';
            System.out.println("You won the toss! You play first.");
        } else {
            playerTurn = false;
            playerSymbol = 'O';
            computerSymbol = 'X';
            System.out.println("Computer won the toss! Computer plays first.");
        }

        System.out.println("Your symbol: " + playerSymbol);
        System.out.println("Computer symbol: " + computerSymbol);
    }

    public static void main(String[] args) {
        toss();
    }
}