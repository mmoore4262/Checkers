package sample;


public class CheckerPiece {

    String team;
    int xLoc;
    int yLoc;
    Spaces[][] board;

    public CheckerPiece(String team, int xLoc, int yLoc)
    {
        this.team = team;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }

    public String getTeam() {
        return team;
    }

    public int getyLoc() {
        return yLoc;
    }

    public int getxLoc() {
        return xLoc;
    }

    public boolean isLegal(String team, int xLoc, int yLoc)
    {

        boolean Legal = (diagonalMovement(team,xLoc,yLoc));
        if(Legal == true)
        {
           capture(team,xLoc,yLoc);
        }


        return Legal;
    }
    public void move(String team, int a, int b)
    {
        isLegal(team,a,b);



    }
    public boolean canCapture(String team, int x, int y)
    {
        if(team == "red")
        {
            if(!(board[xLoc--][yLoc--]==null))
            {
                return true;
            }
            if(!(board[xLoc++][yLoc--]==null))
            {
                return true;
            }
        }
        if(team == "black")
        {
            if(!(board[xLoc--][yLoc++]==null))
            {
                return true;
            }
            if(!(board[xLoc++][yLoc++]==null))
            {
                return true;
            }
        }
        return false;

    }
    public void capture(String team, int xLoc, int yLoc)
    {
        while(canCapture(team,xLoc,yLoc))
        {

        }
    }
    private boolean diagonalMovement(String team,int xLoc, int yLoc)
    {
        if(team == "red")
        {
            if(board[xLoc--][yLoc--]==null)
            {
                return true;
            }
            if(board[xLoc++][yLoc--]==null)
            {
                return true;
            }
        }
        if(team == "black")
        {
            if(board[xLoc--][yLoc++]==null)
            {
                return true;
            }
            if(board[xLoc++][yLoc++]==null)
            {
                return true;
            }
        }
        return false;
    }
}
