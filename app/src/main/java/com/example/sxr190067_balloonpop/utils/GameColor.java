package com.example.sxr190067_balloonpop.utils;


public class GameColor{
    public int color;
    public String name;

    public GameColor(int color,String name){
        this.color = color;
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
