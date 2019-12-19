/*
 * Conway's Game of Life
 * Author: Don Newman & John Phang
 *
 * *********************RULES*******************************
 * Any live cell with fewer than two live neighbours dies, as if by underpopulation.
 * Any live cell with two or three live neighbours lives on to the next generation.
 * Any live cell with more than three live neighbours dies, as if by overpopulation.
 * Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
 * These rules, which compare the behavior of the automaton to real life, can be condensed into the following:

 * Any live cell with two or three neighbors survives.
 * Any dead cell with three live neighbors becomes a live cell.
 * All other live cells die in the next generation. Similarly, all other dead cells stay dead.
 */

import java.util.*;

public class Game_Of_Life {
    public static char[][] board = new char[3][3]; //test

    public static void main(String[] args){
        createGrid();
        printGrid();
    }

    public static void createGrid(){
        //Create a 3x3 grid and check

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = '-';
            }
        }
    }

    public static void printGrid(){
        System.out.println("-----------");

        for(int i = 0; i < 3; i++){
            System.out.print("|");
            for(int j = 0; j < 3; j++){
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
            System.out.println("-------");
        }
    }
}
