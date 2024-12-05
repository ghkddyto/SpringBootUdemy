package org.in28minutes.learnspringframework01;

import org.in28minutes.learnspringframework01.game.GameRunner;
import org.in28minutes.learnspringframework01.game.GamingConsole;
import org.in28minutes.learnspringframework01.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game(){
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

}
