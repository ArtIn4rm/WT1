package com.company.fundamentals;
import java.util.Scanner;
import java.lang.Math;
import static com.company.fundamentals.Task4.*;
import java.lang.StringBuilder;

public class Task8 extends Task {
    public void generateSequence(int[] sequence){
        int temp = (int) (Math.random()*3+1);
        for(int i = 0; i < sequence.length; i++){
            sequence[i] = temp;
            temp += (int) (Math.random()*Math.random()*5);
        }
    }

    public String sumarizeSequences(int[] sequenceA, int[] sequenceB){
        StringBuilder answer = new StringBuilder();
        String buff = "";
        for(int i = 0; i < sequenceB.length; i++){
            for(int j = 0; j < sequenceA.length; j++){
                if(sequenceB[i] < sequenceA[j]){
                    buff = "[" + i + "->" + j + "], ";
                    answer.append(buff);
                    break;
                }
            }
        }
        return answer.toString();
    }

    @Override
    public void runTask() {
        setTaskCode(8);
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите размерность последовательности a[n]:");
        while(!scan.hasNextInt()){
            System.out.println("Ошибка! Введите число ");
            scan.next();
        }
        int n = scan.nextInt();

        System.out.println("Введите размерность последовательности b[m]:");
        while(!scan.hasNextInt()){
            System.out.println("Ошибка! Введите число ");
            scan.next();
        }
        int m = scan.nextInt();
        int[] A = new int[n];
        int[] B = new int[m];

        generateSequence(A);
        generateSequence(B);

        System.out.println("Последовательность a[n]");
        printArray(A);
        System.out.println("Последовательность b[m]");
        printArray(B);

        System.out.println("Индексы добавления элементов последовательности b[m] в a[n]");
        System.out.println(sumarizeSequences(A, B));
    }
}


