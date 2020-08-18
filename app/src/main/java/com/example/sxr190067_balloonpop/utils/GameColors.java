package com.example.sxr190067_balloonpop.utils;


import android.graphics.Color;

import java.util.Random;

public class GameColors {


    public static final GameColor[] balloonColors = new GameColor[]
            {new GameColor(Color.RED, "Red"),
                    new GameColor(Color.rgb(255, 165, 0), "Orange"),
                    new GameColor(Color.YELLOW, "Yellow") ,
                    new GameColor(Color.WHITE, "White"),
                    new GameColor(Color.GREEN, "Green"),
                    new GameColor(Color.BLUE, "Blue"),
                    new GameColor(Color.rgb(128,0,128), "Purple") };

    /*
     * Generate a random color
     * */
    public static GameColor getRandomColor(){
        Random rand = new Random();
        int randColorIndex = rand.nextInt(balloonColors.length);
        return balloonColors[randColorIndex];
    }


}

