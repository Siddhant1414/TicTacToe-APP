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
}