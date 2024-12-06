package com.in28minutes.learnspringframework02.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole {
    public void up(){
        System.out.println("up");
    }

    public void down(){
        System.out.println("Sit down");
    }

    public void left(){
        System.out.println("Go back");
    }

    public void right(){
        System.out.println("Shoot a bullet");
    }
}
