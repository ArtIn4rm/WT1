package com.company.fundamentals;
import java.util.Scanner;
import java.lang.Math;

public class Task4 extends Task {
    public static void setArrayWithRandom(int[] array, int diapason){
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * diapason);
        }
    }

    public static void printArray(int[] array){
        System.out.print("[");
        for(int i: array){
            System.out.print(i + ", ");
        }
        System.out.println("]");
    }

    public boolean isPrimal(int x){
        for(int i = 2; i <= Math.sqrt(x); i++){
            if(x % i == 0) return false;
        }
        return true;
    }

    @Override
    public void runTask() {
        setTaskCode(4);
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
        System.out.println("Индексы простых элементов массива:");
        for(int i = 0; i < array.length; i++){
            if(isPrimal(array[i])){
                System.out.println(i + ", ");
            }
        }
    }
}

