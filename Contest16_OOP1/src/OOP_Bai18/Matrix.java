package OOP_Bai18;

import java.util.Scanner;

public class Matrix {
    private int row, col;
    private int[][] a;

    public Matrix() {
    }

    public Matrix(int row, int col) {
        this.col = col;
        this.row = row;
    }

    public Matrix(int row, int col, int[][] a) {
        this.row = row;
        this.col = col;
        this.a = a;
    }

    public void nextMatrix(Scanner sc) {
        a = new int[this.row][this.col];
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix mul(Matrix b) {
        int res[][] = new int[this.row][b.col];
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < b.col; j++) {
                res[i][j] = 0;
                for (int k = 0; k < this.col; k++) {
                    res[i][j] += this.a[i][k] * b.a[k][j];
                }
            }
        }
        return new Matrix(this.row, b.col, res);
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                res += this.a[i][j] + " ";
            }
            res += "\n";
        }
        return res;
    }
}
