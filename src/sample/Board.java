package sample;

public class Board
{
    static String arrayBoard[][] = {
            {"X","b","X","b","X","b","X","b"},
            {"b","X","b","X","b","X","b","X"},
            {"X","b","X","b","X","b","X","b"},
            {"e","X","e","X","e","X","e","X"},
            {"X","e","X","e","X","e","X","e"},
            {"r","X","r","X","r","X","r","X"},
            {"X","r","X","r","X","r","X","r"},
            {"r","X","r","X","r","X","r","X"}
    };
    //creates a series of Checkers based off the arrayBoard, the checkers are either red or black depending
    // on whether the respective position in arrayBoard is "X" or "e"
    public  static void fillBoard() {
        for (int i = 0; i < arrayBoard.length; i++) {
            for (int j = 0; j < arrayBoard[i].length;j++) {
                if (arrayBoard[i][j].equals("X")) {

                }
                else {

                }
            }
        }
    }
}
