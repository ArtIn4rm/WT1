package com.company.fundamentals;
import java.util.Scanner;
import static com.company.fundamentals.Task4.*;

public class Task6 extends Task {
    public void getMatrix(int[] array, int[][] matrix){
        for(int i = 0; i < array.length; i++){
            for(int j = 0, k = i; j < array.length; j++){
                matrix[i][j] = array[k];
                k = (k == array.length - 1) ? 0 : (k + 1);
            }
        }
    }

    public  void printMatrix(int [][] matrix){
        for(int[] i : matrix){
            for(int j : i){
                System.out.print(j + ", ");
            }
            System.out.println();
        }
    }

    @Override
    public void runTask() {
        setTaskCode(6);
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите размерность массива n:");
        while(!scan.hasNextInt()){
            System.out.println("Ошибка! Введите число ");
            scan.next();
        }
        int n = scan.nextInt();

        System.out.println("Введите конец диапазона случайных значений для заполнения ими массива:");
        while(!scan.hasNextInt()){
            System.out.println("Ошибка! Введите число ");
            scan.next();
        }
        int diapason = scan.nextInt();
        int [] array = new int[n];
        setArrayWithRandom(array, diapason);
        System.out.println("Сгенерированный массив:");
        printArray(array);

        int [][] matrix = new int[n][n];
        getMatrix(array, matrix);
        System.out.println("Полученныя матрица:");
        printMatrix(matrix);
    }
}

