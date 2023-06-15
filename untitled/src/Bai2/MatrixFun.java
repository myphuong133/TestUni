package Bai2;

import java.util.Scanner;

public class MatrixFun {
    public static int[][] inputMatrix(Scanner reader) {
        System.out.println("Nhập số n");
        int n = reader.nextInt();
        int[][] matrix = new int[n][n];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Nhập phần tử tại " + "[" + i + 1 + "]" + "[" + j + 1 + "]");
                matrix[i][j] = reader.nextInt();
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] bla = inputMatrix(sc);
        print(bla);
    }

    public static void print(int[][] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j]);
            }
            System.out.println();
        }
    }
    public static boolean isOEBalance(int[][] matr){
        int Ne = 0;
        int No = 0;
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if (matr[i][j] % 2 ==0){
                   Ne++;
                   continue;
                }
                No++;
            }
        }
        if (No <= Ne){
            return (Ne - No) <=1;
        }
        return (No-Ne) <=1;
    }
    public static boolean isContainsHole(int[][] matr){
        int min = matr[0][0];
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if (matr[i][j] < min){
                    min = matr[i][j];
                }
            }
        }
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if (min == matr[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}
