package com.example.demo.patterns.creational.factory;
// The factory design pattern is used when we have a superclass with multiple sub-classes and based on input, we need
// to return one of the sub-class.
// This pattern takes out the responsibility of the instantiation of a class from the client program to the factory
// class.
// We can apply a Singleton pattern on the Factory class or make the factory method static.
// Check out Factory Design Pattern for example program and factory pattern benefits.
// This is one of the most widely used java design patterns.
//
// https://www.digitalocean.com/community/tutorials/factory-design-pattern-in-java
public class TestFactory {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);
    }
}
