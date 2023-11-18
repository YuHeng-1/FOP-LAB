/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
public class L5Q4 {

    public static void main(String[] args) {
        final int ROW = 3;
        int[][] matrix = {
            {1, 5, 7},
            {3, 6, 9},
            {5, 3, 8}};
        int[][] matrix1 = new int[3][3];

        System.out.println("3 by 3 Matrix");
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < ROW; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < ROW; j++) {
                matrix1[i][j] = matrix[3 - j - 1][i];
            }
            /*
            Elements in rows move to columns of rotated matrix.
            - first row -> last column 0->2
            - second row -> second column 1->1
            - last row -> first column 2->0
            
            (1,5,7) : original row index is 0, after rotation, the column index is 2, but the row index for 1,5 and 7 are different
            (3,6,9) : original row index is 1, after rotation, the column index is 1, but the row index for 3,6 and 9 are different
            (5,3,8) : original row index is 2, after rotation, the column index is 0, but the row index for 5,3 and 8 are different
            
            So the new row index = 3-j-1
            the new column index = i; i is the current row index in rotated matrix
            
            3-j-1:
            3 represents the size of matrix (3x3)
            j is the current column index in rotated matrix
            -1 is used to adjust the index so that (3-1=2), 2 is the max row/column index 
            */
        }

        System.out.println("After rotates 90 degrees clockwise ");
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < ROW; j++) {
                System.out.print(matrix1[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
