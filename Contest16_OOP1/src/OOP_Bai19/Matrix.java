package OOP_Bai19;

import javax.swing.*;
import java.security.spec.ECField;
import java.util.Scanner;

public class Matrix {
    private int row, col;
    private int[][] a;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        a = new int[this.row][this.col];
    }

    public void nextMatrix(Scanner sc) {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                this.a[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix transpose() {
        int rowTrans = this.col;
        int colTrans = this.row;
        Matrix res = new Matrix(rowTrans, colTrans);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                res.a[j][i] = this.a[i][j];
            }
        }
        return res;
    }

    public Matrix multiple(Matrix b) {
        Matrix res = new Matrix(this.row, b.col);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < b.col; j++) {
                res.a[i][j] = 0;
                for (int k = 0; k < this.col; k++) {
                    res.a[i][j] += this.a[i][k] * b.a[k][j];
                }
            }
        }
        return res;
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
