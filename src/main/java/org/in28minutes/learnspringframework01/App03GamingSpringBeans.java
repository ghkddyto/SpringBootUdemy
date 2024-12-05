package org.in28minutes.learnspringframework01;

import org.in28minutes.learnspringframework01.game.GameRunner;
import org.in28minutes.learnspringframework01.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args){
        System.out.println("-----------------------");

        try (var context =
                     new AnnotationConfigApplicationContext
                             (GamingConfiguration.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }


        System.out.println("-----------------------");
    }

}
