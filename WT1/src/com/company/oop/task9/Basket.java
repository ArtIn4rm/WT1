package com.company.oop.task9;
import java.lang.Math;

public class Basket{
    Ball [] items;
    int capacity;

    Basket(int capacity){
        this.capacity = capacity;
    }

    public void fillRandom() {
        this.items = new Ball[capacity];
        for (int i = 0; i < items.length; i++) {
            items[i] = new Ball((int)(Math.random()*20+1),
                    Color.values()[(int)(Math.random()*(Color.values().length-1))]);
        }
    }

    public int summaryWeight(){
        int sum = 0;
        for(Ball i : items){
            sum += i.weight;
        }
        return sum;
    }

    public int summaryColor(Color color){
        int sum = 0;
        for(Ball i : items){
            if(i.color == color)sum++;
        }
        return sum;
    }

    public void printBasket(){
        for(Ball i : items){
            System.out.print("[" + i.weight + ":" + i.color.toString() + "], ");
        }
    }
}
