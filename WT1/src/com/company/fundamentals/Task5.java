package com.company.fundamentals;
import java.util.Scanner;
import java.util.ArrayList;
import static com.company.fundamentals.Task4.*;

public class Task5 extends Task {
    public int[] toSortedArray(int[] array){
        ArrayList<Integer> list = new ArrayList<>();
        int buff = array[0];
        list.add(buff);
        for(int i : array){
            if(buff < i){
                buff = i;
                list.add(buff);
            }
        }
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }

    @Override
    public void runTask() {
        setTaskCode(5);
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

        int [] sortedArray = toSortedArray(array);
        System.out.println("Возрастающая подпоследовательность:");
        printArray(sortedArray);
        System.out.println("Число убранных элементов K:" + (array.length - sortedArray.length));
    }
}

