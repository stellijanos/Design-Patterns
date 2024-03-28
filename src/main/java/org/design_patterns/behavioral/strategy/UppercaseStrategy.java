package org.design_patterns.behavioral.strategy;

import org.design_patterns.behavioral.strategy.interfaces.PrintStrategy;

public class UppercaseStrategy implements PrintStrategy {
    @Override
    public String formatString(String input) {
        return input.toUpperCase();
    }
}
