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