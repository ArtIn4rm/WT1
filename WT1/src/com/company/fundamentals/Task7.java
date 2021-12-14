package com.company.fundamentals;
import java.util.Scanner;
import static com.company.fundamentals.Task4.*;

public class Task7 extends Task {
    public void shellSort(int[] array){
        int n = array.length;
        for(int gap = n/2; gap > 0; gap /= 2){
            for(int i = gap; i < n; i += 1){
                int temp = array[i];
                int j;
                for(j = i; j >= gap && array[j - gap] > temp; j -= gap){
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }

    @Override
    public void runTask() {
        setTaskCode(7);
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
        shellSort(array);
        System.out.println("Отсортированный массив:");
        printArray(array);
    }
}


