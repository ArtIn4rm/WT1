package com.company.fundamentals;
import java.util.Scanner;
import java.lang.Math;

public class Task3 extends Task {
    public void getIterationTable(double a, double b, double h){
        for(double i = a;  i <= b; i+=h){
            System.out.println("x = " + i + ", F(x) = " + Math.tan(i));
        }
    }

    @Override
    public void runTask() {
        setTaskCode(3);
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите начало диапазона a:");
        while(!scan.hasNextDouble()){
            System.out.println("Ошибка! Введите число ");
            scan.next();
        }
        double a = scan.nextDouble();

        System.out.println("Введите конец диапазона b:");
        while(!scan.hasNextDouble()){
            System.out.println("Ошибка! Введите число ");
            scan.next();
        }
        double b = scan.nextDouble();

        System.out.println("Введите шаг h:");
        while(!scan.hasNextDouble()){
            System.out.println("Ошибка! Введите число ");
            scan.next();
        }
        double h = scan.nextDouble();
        getIterationTable(a, b, h);
    }
}

