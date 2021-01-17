package com.gradle.project;
import java.util.Arrays;
import java.util.Scanner;

/**
 * The type Tictactoeplayer.
 */
//A player can select a location to play and has a symbol
//It reads from a scanner for the location
//It does not store the location
public class Tictactoeplayer {

    private  char sign;
    private Scanner input;

    /**
     * Instantiates a new Tictactoeplayer.
     *
     * @param sign the sign of X and Os
     * @param input the input from the scanner
     */
    public  Tictactoeplayer(char sign, Scanner input) {
        this.sign=sign;
        this.input=input;
    }

    /**
     * Sign char.
     *
     * @return the char of the player(X and O)
     */
    //The symbol the player selects
    public char sign(){return this.sign;}

    /**
     * Get move tictactoegrid. Asks the user for where they want to make a move
     *
     * @return the tictactoegrid in its new form with the move made
     */
    //Asks the user for a row and column to play eg.(1,3)
    //Validity of a move is not checked here
    public Tictactoegrid getMove(){
        System.out.println("Row: ");
        int rows = input.nextInt();
        System.out.println("Column: ");
        int cols = input.nextInt();
        return  new Tictactoegrid(rows-1, cols-1);
    }

}
