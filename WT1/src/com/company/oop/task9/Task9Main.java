package com.company.oop.task9;
import java.util.Scanner;

public class Task9Main{

    public void runTask(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите вместимость корзины:");
        while(!scan.hasNextInt()){
            System.out.println("Ошибка! Введите число ");
            scan.next();
        }
        Basket basket = new Basket(scan.nextInt());
        System.out.println("Заполненная корзина:");
        basket.fillRandom();
        basket.printBasket();

        System.out.println("Суммарный вес мячей в корзине: " + basket.summaryWeight());
        System.out.println("Суммарное число мячей синего цвета в корзине: " + basket.summaryColor(Color.BLUE));
    }

    public static void main(String[] args){
        new Task9Main().runTask();
    }
}
