package com.gradle.project;
import java.util.Arrays;
import java.util.Scanner;


/**
 * The type Tictactoegrid.
 */
public class Tictactoegrid {
  private int rows;
  private int  cols;

    /**
     * Instantiates a new Tictactoegrid.
     *
     * @param rows the rows of the grid
     * @param cols the cols of the grid
     */
    public Tictactoegrid(int rows, int cols){
      this.rows= rows;
      this.cols= cols;
  }

    /**
     * Row int.
     *
     * @return the int 0 as the first row
     */
  //Row in the array with 0 as the first row
    public int row(){return this.rows;}

    /**
     * Cols int.
     *
     * @return the int 0 as the first column
     */
  //Column in the array with 0 as the first column
    public int cols(){return this.cols;}
}
