package com.company.fundamentals;
import java.util.Scanner;

public class Task2 extends Task {
    boolean isInSet(double x, double y){
        return (x >= -6 && x <= 6 && y <= 0 && y >= -3) || (x >= -4 && x <= 4 && y <= 5 && y >= 0);
    }

    @Override
    public void runTask() {
        setTaskCode(2);
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

        if(isInSet(x, y)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
