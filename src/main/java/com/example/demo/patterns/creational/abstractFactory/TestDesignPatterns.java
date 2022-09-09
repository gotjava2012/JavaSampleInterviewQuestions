package com.example.demo.patterns.creational.abstractFactory;
// Abstract Factory pattern is similar to Factory pattern and it&rsquo;s a factory of factories.
// If you are familiar with the factory design pattern in java, you will notice that we have a single
// Factory class that returns the different sub-classes based on the input provided and the factory class
// uses if-else or switch statements to achieve this. In Abstract Factory pattern, we get rid of if-else block
// and have a factory class for each sub-class and then an Abstract Factory class that will return the sub-class
// based on the input factory class.
// Check out Abstract Factory Pattern to know how to implement this pattern with example program.

public class TestDesignPatterns {

    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
        System.out.println("AbstractFactory PC Config::"+pc);
        System.out.println("AbstractFactory Server Config::"+server);
    }
}
