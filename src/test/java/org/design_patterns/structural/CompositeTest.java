package org.design_patterns.structural;

import org.design_patterns.structural.composite.Composite;
import org.design_patterns.structural.composite.Equipment;
import org.junit.Test;

public class CompositeTest {

    @Test
    public void test() {


        Composite computer = new Composite("PC");
        Equipment processor = new Equipment("Processor", 1000);
        Equipment ssd = new Equipment("SSD", 250);
        Composite memory = new Composite("Memory");
        Equipment rom = new Equipment("ROM", 75);
        Equipment ram = new Equipment("RAM", 100);

        memory.add(rom).add(ram);
        computer.add(processor).add(ssd).add(memory);

        System.out.println("PC price: " + computer.getPrice());

    }
}
