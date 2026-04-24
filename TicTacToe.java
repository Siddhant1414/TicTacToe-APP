public static void main(String[] args) {
    initializeBoard();

    char currentPlayer = 'X';

    while (true) {

        if (currentPlayer == 'X') {
            // For now just place fixed move (or you can add input later)
            placeMove(0, 0, 'X');
        } else {
            computerMove();
        }

        // SWITCH PLAYER
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }

        // TEMP STOP CONDITION (we’ll improve in UC9)
        break;
    }
}