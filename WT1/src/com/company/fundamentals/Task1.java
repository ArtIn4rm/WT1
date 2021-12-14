package com.company.fundamentals;
import java.util.Scanner;
import java.lang.Math;

public class Task1 extends Task {
    public double countEquation(double x, double y){
        return (1 + Math.pow(Math.sin(x + y), 2))/(2 + Math.abs(x - (2 * x)/(1 + Math.pow(x, 2) * Math.pow(y, 2)))) + x;
    }

    @Override
    public void runTask() {
        setTaskCode(1);
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число x:");
        while(!scan.hasNextDouble()){
            System.out.println("Ошибка! Введите число ");
            scan.next();
        }
        double x = scan.nextDouble();

        System.out.println("Введите число y:");
        while(!scan.hasNextDouble()){
            System.out.println("Ошибка! Введите число ");
            scan.next();
        }
        double y = scan.nextDouble();
        System.out.println("Вычесленное значение выражения равно: " + countEquation(x, y));
    }
}
