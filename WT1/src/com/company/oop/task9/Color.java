package com.company.oop.task9;

public enum Color {
    RED,
    BLUE,
    GREEN,
    BLACK,
    WHITE,
    YELLOW;

    @Override
    public String toString() throws NullPointerException{
        switch (this) {
            case RED : {return "red";}
            case BLUE : {return "blue";}
            case GREEN : {return "green";}
            case BLACK : {return "black";}
            case WHITE : {return "white";}
            case YELLOW : {return "yellow";}
            default : {throw new NullPointerException();}
        }
    }
}
