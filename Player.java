/* Class to store a player for a game of 
Naughts and Crosses. */
public class Player {

    //store the character the player will use
    //to mark the board
    private char mark;

    //constructor to set the mark
    public Player(char mark) {
        this.mark = mark;
    }

    //retrieve mark for printing the board
    public char getMark(){
        return mark;
    }

}
