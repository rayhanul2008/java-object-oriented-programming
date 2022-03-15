import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.Scanner;

public class tictac {
    public static void displayGrid(char[][] grid){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(grid[i][j]+"|");
            }
            System.out.print(grid[i][2]);
            System.out.println();
            System.out.println("-----");
        }
    }
    public static void main(String[] args) {
        char[][] grid = new char[3][3];
        grid[0][0] = ' ';
        grid[0][1] = ' ';
        grid[0][2] = ' ';
        grid[1][0] = ' ';
        grid[1][1] = ' ';
        grid[1][2] = ' ';
        grid[2][0] = ' ';
        grid[2][1] = ' ';
        grid[2][2] = ' ';
        while(true) {
            Scanner s = new Scanner(System.in);
            displayGrid(grid);

            System.out.println("Player1, which row and colum do you choose? ");
            int p1RowChoice = s.nextInt();
            int p1ColumChoice = s.nextInt();
            grid[p1RowChoice][p1ColumChoice] = 'X';
            displayGrid(grid);
            System.out.println("Player2, which row and colum do you choose? ");
            int p2RowChoice = s.nextInt();
            int p2ColumChoice = s.nextInt();
            grid[p2RowChoice][p2ColumChoice] = 'O';
        }
    }
}
