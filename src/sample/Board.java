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
    public  static void createBoard() {
        Checkers[] CheckerBoard = new Checkers[24];
        CheckerBoard[0] = new Checkers(0,1,"black");
        CheckerBoard[1] = new Checkers(0,3,"black");
        CheckerBoard[2] = new Checkers(0,5,"black");
        CheckerBoard[3] = new Checkers(0,7,"black");
        CheckerBoard[4] = new Checkers(1,0,"black");
        CheckerBoard[5] = new Checkers(1,2,"black");
        CheckerBoard[6] = new Checkers(1,4,"black");
        CheckerBoard[7] = new Checkers(1,6,"black");
        CheckerBoard[8] = new Checkers(2,1,"black");
        CheckerBoard[9] = new Checkers(2,3,"black");
        CheckerBoard[10] = new Checkers(2,5,"black");
        CheckerBoard[11] = new Checkers(2,7,"black");
        CheckerBoard[12] = new Checkers(5,1,"red");
        CheckerBoard[13] = new Checkers(5,3,"red");
        CheckerBoard[14] = new Checkers(5,5,"red");
        CheckerBoard[15] = new Checkers(5,7,"red");
        CheckerBoard[16] = new Checkers(6,0,"red");
        CheckerBoard[17] = new Checkers(6,2,"red");
        CheckerBoard[18] = new Checkers(6,4,"red");
        CheckerBoard[19] = new Checkers(6,6,"red");
        CheckerBoard[20] = new Checkers(7,1,"red");
        CheckerBoard[21] = new Checkers(7,3,"red");
        CheckerBoard[22] = new Checkers(7,5,"red");
        CheckerBoard[23] = new Checkers(7,7,"red");



    }
}
