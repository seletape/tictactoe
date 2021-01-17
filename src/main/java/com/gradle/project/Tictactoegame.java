package com.gradle.project;
import java.util.*;

/**
 * The type Tictactoegame.
 */
//Play a game of tic tac toe
public class Tictactoegame {

    /**
     * Main where the entire program can be ran
     *
     * @param args the args
     */
    public static void main(String args[]){
        Tictactoemanager game = new Tictactoemanager();

        Scanner read = new Scanner(System.in);

        Tictactoeplayer xplayer= new Tictactoeplayer('X',read);
        Tictactoeplayer oplayer= new Tictactoeplayer('O',read);

        Tictactoeplayer player=xplayer;
        Tictactoeplayer player2=oplayer;

        while(game.movepossible()){
        Tictactoegrid where = player.getMove();

        boolean success= game.makemove(player, where);
        game.printboard();
        game.checkifwon();

        if (success){
            //Switch the players for next round
            Tictactoeplayer temp=player2;
            player2=player;
            player=temp;
        }

        }
        game.printstatus(player2);
        read.close();
    }
}
