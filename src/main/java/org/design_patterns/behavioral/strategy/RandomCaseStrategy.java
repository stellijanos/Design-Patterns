package org.design_patterns.behavioral.strategy;

import org.design_patterns.behavioral.strategy.interfaces.PrintStrategy;

import java.util.Random;

public class RandomCaseStrategy implements PrintStrategy {
    @Override
    public String formatString(String input) {
        StringBuilder output = new StringBuilder();
        Random rand = new Random();

        for (Character ch: input.toCharArray()) {
            if (rand.nextBoolean()) {
                output.append(ch.toString().toUpperCase());
            } else {
                output.append(ch.toString().toLowerCase());
            }
        }
        return output.toString();
    }
}
