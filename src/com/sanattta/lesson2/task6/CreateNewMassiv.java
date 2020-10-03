package com.sanattta.lesson2.task6;

import java.util.Random;

public class CreateNewMassiv {
    public static void main(String[] args) {
        final int n = new Random().nextInt(8) + 3;
        final int m = new Random().nextInt(8) + 3;

        //Заполняем исходный массив случайными значениями 0 и 1
        int[][] SoursMassiv = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                SoursMassiv[i][j] = new Random().nextInt(2);
            }
        }
        // Присваиваем значение 2 не крайнему элементу массива
        final int k = new Random().nextInt(n - 2) + 1;
        final int l = new Random().nextInt(m - 2) + 1;
        SoursMassiv[k][l] = 2;

        // Создаем новый массив
        int[][] ResultMassiv = new int[n][m];
        boolean isTwoCaught = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (SoursMassiv[i][j] == 2) {
                    isTwoCaught = true;
                    ResultMassiv[i][j] = 2;
                }
                else {
                    if (isTwoCaught)
                        ResultMassiv[i][j] = -1 * SoursMassiv[i][j] + 1;
                    else
                        ResultMassiv[i][j] = SoursMassiv[i][j];
                }
            }
        }

        System.out.println("Source matrix:");
        printMatrix(SoursMassiv);
        System.out.println("Result matrix:");
        printMatrix(ResultMassiv);
    }

    static private void printMatrix(int[][] M) {
        for (int[] row : M) {
            for (int e : row) {
                System.out.print(e);
            }
            System.out.println("");
        }
    }
}
