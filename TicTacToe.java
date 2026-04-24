public class TicTacToe {

    static char[][] board = new char[3][3];

    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    static void computerMove() {
        int row, col;

        while (true) {
            int random = (int)(Math.random() * 9) + 1;

            row = (random - 1) / 3;
            col = (random - 1) % 3;

            if (board[row][col] == '-') {
                placeMove(row, col, 'O');
                break;
            }
        }
    }

    static boolean checkWin(char symbol) {

        // ROWS
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol &&
                board[i][1] == symbol &&
                board[i][2] == symbol) {
                return true;
            }
        }

        // COLUMNS
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == symbol &&
                board[1][j] == symbol &&
                board[2][j] == symbol) {
                return true;
            }
        }

        // DIAGONALS
        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol) {
            return true;
        }

        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        initializeBoard();

        placeMove(0, 0, 'X');
        computerMove();

        if (checkWin('X')) {
            System.out.println("X Wins");
        }
    }
}