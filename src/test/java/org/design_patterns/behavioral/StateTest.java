package org.design_patterns.behavioral;

import org.design_patterns.behavioral.state.Game;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StateTest {


    public static void main(String[] args) {
        Game game = new Game();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        do {
            System.out.println("-- Please input command: ");
            try {
                input = reader.readLine().trim();
                switch(input) {
                    case "w" -> game.state.onWelcomeScreen();
                    case "p" -> game.state.onPlaying();
                    case "b" -> game.state.onBreak();
                    case "e" -> game.state.onEndGame();
                    default -> System.out.println("-- Unknown command");
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } while(input != "exit");
    }
}
