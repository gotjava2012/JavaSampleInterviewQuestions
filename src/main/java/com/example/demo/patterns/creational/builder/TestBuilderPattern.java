package com.example.demo.patterns.creational.builder;
//This pattern was introduced to solve some of the problems with Factory and Abstract Factory design patterns when
// the Object contains a lot of attributes.
// Builder pattern solves the issue with a large number of optional parameters and inconsistent state by
// providing a way to build the object step-by-step and provide a method that will actually return the final Object.
// Check out Builder Pattern for example program and classes used in JDK.

public class TestBuilderPattern {

    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        Computer comp = new Computer
                .ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();
    }
}
