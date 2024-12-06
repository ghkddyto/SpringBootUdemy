package com.in28minutes.learnspringframework02;

import com.in28minutes.learnspringframework02.game.GamingConsole;
import com.in28minutes.learnspringframework02.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.learnspringframework02.game")
public class GamingAppLauncherApplication {
    public static void main(String[] args){
        try (var context =
                     new AnnotationConfigApplicationContext
                             (GamingAppLauncherApplication.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }

}
