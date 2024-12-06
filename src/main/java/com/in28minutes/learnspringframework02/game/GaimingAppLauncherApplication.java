package com.in28minutes.learnspringframework02.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.learnspringframework02.game")
public class GaimingAppLauncherApplication {
    public static void main(String[] args){
        try (var context =
                     new AnnotationConfigApplicationContext
                             (GaimingAppLauncherApplication.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }

}
