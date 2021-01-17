package com.gradle.project;
import java.util.Arrays;
import java.util.Scanner;

/**
 * The type Tictactoeboard.
 */
//Presents the 3x3 board for tic tac toe
//In efforts to future proof the code the grid size can be increased by changing
//the size variable for larger games of tic tac toe.
public class Tictactoeboard {

    private final int size = 3;
    private char[][] grid = new char[size][size];

    /**
     * Instantiates a new Tictactoeboard.
     */
//Creates 3 x 3 board
    public Tictactoeboard(){
        for (char[] rows: grid){
            Arrays.fill(rows, ' ');
        }
    }

    private boolean validplace(Tictactoegrid placement){
        return placement.row() >=0 && placement.row() < size &&
               placement.cols() >=0 && placement.cols() < size;
    }

    /**
     * Play.
     *
     * @param player    the player will make a move if the position is valid
     * @param placement the placement is broken into rows and columns so the player sign wil be placed in the 2D array of the grid.
     */
//Places a mark with the players sign if the placement is valid.
    public void play(Tictactoeplayer player, Tictactoegrid placement){
        if (validplace(placement)){
            grid[placement.row()][placement.cols()]= player.sign();
        }
    }

    /**
     * Winner boolean.
     *
     * @return the boolean true if there is a winner in the game
     */
//Does the board show a winner now?
    // Will return the winner if the board has won horizontally, vertically or diagonally
    public boolean Winner() {
        // Assumes the size is 3.
        boolean result = false;

        for (int i = 0; i < size; i++) {
            if (grid[0][i] != ' ' && grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i]) {
                result = true;
            }
            if (grid[i][0] != ' ' && grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2]) {
                result = true;
            }

        }
        if (grid[1][1] != ' ' && ((grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2])
                || (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]))) {
            result = true;
        }

        return result;
    }

    //Checks if the placement of the sign is a valid move
    //Returns if the location is on the board and has not been placed with a sign already

    /**
     * Valid and free boolean.
     *
     * @param placement the placement of X's and O's in the box
     * @return the boolean if true or false if the move is valid and free
     */
    public boolean ValidandFree(Tictactoegrid placement){
        boolean validmove= true;
        int row= placement.row();
        int col= placement.cols();


        if (row < 0 || col < 0 || row >= size || col >= size) {
            System.out.println("ERROR: Invalid placement.\nTry again.");
            validmove = false;
        } else if (!(grid[row][col] == ' ')) {
            System.out.println("ERROR: Place is taken.\nTry again.");
            validmove = false;
        }

        return validmove;
    }

    /**
     * Printgrid.
     * The function gives a 3x3 grid ASCII representation of the grid
     */
//Visual presentation of the board to output
    public void printgrid() {
        //Assumes size = 3
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                switch (column) {
                    case 0:
                        System.out.print(" " + grid[row][column] + " | ");
                        break;
                    case 1:
                        System.out.print(grid[row][column] + " | ");
                        break;
                    case 2:
                        System.out.println(grid[row][column]);
                        break;
                }
            }
            if (row < grid.length - 1) {
                System.out.println("-----------");
            }
        }
    }


}
