package org.design_patterns.behavioral;

import org.design_patterns.behavioral.strategy.Executor;
import org.design_patterns.behavioral.strategy.LowercaseStrategy;
import org.design_patterns.behavioral.strategy.RandomCaseStrategy;
import org.design_patterns.behavioral.strategy.UppercaseStrategy;
import org.junit.Test;


public class StrategyTest {
    @Test
    public void test() {
        LowercaseStrategy str1 = new LowercaseStrategy();
        UppercaseStrategy str2 = new UppercaseStrategy();
        RandomCaseStrategy str3 = new RandomCaseStrategy();

        String input = "LOREM ipsum DOLOR sit amet";

        Executor executor = new Executor(str1);
        executor.printString(input);

        executor.strategy = str2;
        executor.printString(input);

        executor.strategy = str3;
        executor.printString(input);
    }
}
