package com.k4kapilgarg.learnspringframework.Game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MarioGameQualifier")
public class Mario implements GamingConsole{
    public void Up(){
        System.out.println("Jump");
    }

    public void Down(){
        System.out.println("Go into hole");
    }

    public void Left(){
        System.out.println("move left");
    }

    public void Right(){
        System.out.println("Speed accelerate");
    }
}
