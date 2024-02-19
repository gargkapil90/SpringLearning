package com.k4kapilgarg.learnspringframework.Game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    GamingConsole game;

    public GameRunner(@Qualifier("MarioGameQualifier") GamingConsole game) {
        this.game = game;
    }

    public void run(){
            game.Up();
            game.Down();
            game.Left();
            game.Right();
    }
}
