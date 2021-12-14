package com.company;
import com.company.fundamentals.*;
import com.company.oop.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int taskCode;
    public static ArrayList<Task> taskList = new ArrayList<>();

    public static void run(){
        taskList.get(taskCode-1).runTask();
    }

    public static void main(String[] args) {
        initTaskList();
        Scanner scan = new Scanner(System.in);
        boolean isEnd = false;
        while(!isEnd){
            do {
                System.out.println("Введите номер задачи от 1 до 15");
                while(!scan.hasNextInt()){
                    System.out.println("Ошибка! Введите число ");
                    scan.next();
                }
                taskCode = scan.nextInt();
            } while(taskCode < 1 || taskCode > 11);
            run();
            for(;;){
                System.out.println("Это все? [Да/Нет]");
                String answer = scan.nextLine();
                if(!answer.equals("Да") && !answer.equals("Нет")){
                    System.out.println("Ошибка! Введите Да или Нет!");
                } else {
                    isEnd = (answer.equals("Да"));
                    break;
                }
            }
        }
    }

    public static void initTaskList(){
        taskList.add(new Task1());
        taskList.add(new Task2());
        taskList.add(new Task3());
        taskList.add(new Task4());
        taskList.add(new Task5());
        taskList.add(new Task6());
        taskList.add(new Task7());
        taskList.add(new Task8());
        taskList.add(new Task9());
        taskList.add(new Task9());
    }
}
