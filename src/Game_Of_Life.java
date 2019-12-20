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

import java.util.*; //Probably don't even need this

public class Game_Of_Life {
    public static char[][] table = new char[3][3]; //test

    public static void main(String[] args){
        createTable();
        populateCell();
        printTable();
        neighborCheck();
    }

    public static void createTable(){
        //Create a 3x3 grid and check

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                table[i][j] = '0';
            }
        }
    }

    public static void printTable(){
        System.out.println("-----------");


        for(int i = 0; i < 3; i++){
            System.out.print("|");
            for(int j = 0; j < 3; j++){
                System.out.print(table[i][j] + "|");
            }
            System.out.println();
            System.out.println("-------");
        }
    }

    //'o' will represent live cells
    public static void populateCell(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                table[0][0] = '1';
                table[1][0] = '1';
                table[1][1] = '1';
            }
        }
    }

    public static void neighborCheck(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(table[i][j] == '1'){
                    if(table[i + 1][j] == '1' && table[i + 1][j + 1] == '1' || table[i][j + 1] == '1'){
                        System.out.println("(0,0) remains alive ");
                        System.out.println("just checking: " + "("+ i + 1 + "," + j + ")" );
                        System.out.println("just checking: " + "("+ (i + 1) + "," + (j + 1) + ")" );
                        System.out.println("just checking: " + "("+ i + 1 + "," + (j + 1) + ")" );
                    }
                    else{
                        System.out.println("(0,0) should be dead");
                    }
                    //check if this position have an 'o'
                    //if it has an o
                    //System.out.println("this unit have a live cell: " + "("+ i + "," + j + ")");
            }
                else if(table[i][j] == '0'){

                    //System.out.println("this unit have a dead cell: " + "("+ i + "," + j + ")");
                }

            }
        }
    }
}
