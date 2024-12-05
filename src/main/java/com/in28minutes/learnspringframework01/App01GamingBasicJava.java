package com.in28minutes.learnspringframework01;

import com.in28minutes.learnspringframework01.game.GameRunner;
import com.in28minutes.learnspringframework01.game.PacmanGame;
import com.in28minutes.learnspringframework01.game.SuperContraGame;
import com.in28minutes.learnspringframework01.game.MarioGame;

public class App01GamingBasicJava {
    public static void main(String[] args){
        System.out.println("-----------------------");

        var game1 = new MarioGame();
        var game2 = new SuperContraGame();
        var game3 = new PacmanGame();
        var gameRunner1 = new GameRunner(game1);
        var gameRunner2 = new GameRunner(game2);
        var gameRunner3 = new GameRunner(game3);
        gameRunner1.run();
        gameRunner2.run();
        gameRunner3.run();

        System.out.println("-----------------------");
    }

}
