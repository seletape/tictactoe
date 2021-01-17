package com.gradle.project;

/**
 * The type Tictactoemanager.
 */
public class Tictactoemanager {
    private Tictactoeboard board = new Tictactoeboard();

    private int turn= 0;
    private boolean gamewon = false;

    /**
     * Movepossible boolean.
     *
     * @return the boolean true if a move can be made
     */
    //Find if another move is possible
    //Returns true if a move can be made
    public boolean movepossible(){
        return !(turn>=9||gamewon);
    }

    //Validates a move
    //Checks the placement
    //Returns true if the place on the board is empty
    private  boolean validatemove(Tictactoegrid placement){
        return board.ValidandFree(placement);
    }
    /**
     * Makemove boolean.
     *
     * @param player the player will make a move
     * @param placement the placement will be validated
     * @return the boolean will be true if the move is legal to make
     */
    //Player tries to make a move on a location on the board
    //Returns true if the move is possible to make
    public  boolean makemove(Tictactoeplayer player, Tictactoegrid placement){
        boolean able = validatemove(placement);
            if(able){
                board.play(player,placement);
                turn++;
            }
            return able;
    }

    /**
     * Printboard.
     */
    public void printboard(){board.printgrid();}

    /**
     * Checkifwon.
     */
    //Checks the game if a player has won and remembers the result
public void checkifwon(){
        if (turn>= 5){gamewon=board.Winner();}
}

    /**
     * Printstatus.
     *
     * @param player the player that wins sign will be printed with the winner print status.
     *
     */
    //Prints status in the game
    public void printstatus(Tictactoeplayer player){
        if (gamewon){
            System.out.println(player.sign() + " has won");
        }
        else {
            System.out.println("Draw");
        }
    }


}
