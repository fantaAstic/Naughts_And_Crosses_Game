import java.util.Scanner;
import java.util.InputMismatchException;

public class NaughtsAndCrosses {

    //recursive input method.
    //if a player does not put in an int, we just call the method again.
    public static int getInput() {
        Scanner sinput = new Scanner(System.in);
        try {
            return sinput.nextInt();
        } catch (InputMismatchException e) {
            return getInput();
        }
    }

    //Main gameplay loop
    public static void main(String[] args) {

        //initiate our players
        Player p1 = new Player('X');
        Player p2 = new Player('O');
        Board game = new Board(p1, p2);

        //until a winner is decided, or the game is full, we
        //keep asking for moves.
        while ((game.getWinner() == null) && (game.isFull() == false)) {

            //print the board let players follow the game
            game.printBoard();

            //get the current player - this might not necessarily be the next player
            //if there was an invalid move, it will be the same player again
            Player currentPlayer = game.getNextPlayer();
            
            //asking the player for their move, and then playing the move
            System.out.println("Player - " + currentPlayer.getMark());
            System.out.print("Row: ");
            int i = getInput();
            System.out.print("Col: ");
            int j = getInput();
            game.playMove(currentPlayer, i, j);
        }

        //print the final board and check for the winner. 
        game.printBoard();
        if (game.getWinner() != null) {
            System.out.println("The winner is: " + 
                                                game.getWinner().getMark());
        } else {
            System.out.println("The game was drawn");
        }
    }
}
