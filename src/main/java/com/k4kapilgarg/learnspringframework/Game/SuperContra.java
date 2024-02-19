package com.k4kapilgarg.learnspringframework.Game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContra implements GamingConsole{
    public void Up(){
        System.out.println("moving up");
    }

    public void Down(){
        System.out.println("going down");
    }

    public void Left(){
        System.out.println("moving left");
    }

    public void Right(){
        System.out.println("moving right");
    }
}
