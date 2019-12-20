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

import java.util.Scanner;

public class Game_Of_Life {
    public static final int X = 100;
    public static final int Y = 100;
    public static char[][] table = new char[X][Y]; //default 2D Array
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Choose size for x: ");
        String x = scan.nextLine();
        System.out.print("Choose size for y: ");
        String y = scan.nextLine();
        System.out.println("The table will be a: " + x + "x" + y + " table.");
        createTable(Integer.parseInt(x), Integer.parseInt(y));
        populateCell();
        printTable(Integer.parseInt(x), Integer.parseInt(y));
        neighborCheck(Integer.parseInt(x), Integer.parseInt(y));
    }

    public static void createTable(int x, int y){
        //Create a 3x3 grid and check

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++) {
                table[i][j] = '0';
            }
        }
    }

    public static void printTable(int x, int y){

        for(int i = 0; i < x; i++){
            System.out.print("|");
            for(int j = 0; j < y; j++){
                System.out.print(table[i][j] + "|");
            }
            System.out.println();
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

    public static void neighborCheck(int x, int y) {
        int neighbors1, neighbors2, neighbors3 , neighbors4, neighbors5, neighbors6, neighbors7, neighbors8;
        int neighbors;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                try{
                    neighbors1 = table[x - 1][y - 1];
                }
                catch(ArrayIndexOutOfBoundsException e ){
                    neighbors1 = 0;
                }
            }
        }
    }

    public static void updateTable(){

    }
}
