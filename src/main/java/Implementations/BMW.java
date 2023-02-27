package Implementations;

import Interfaces.PrintCarName;

public class BMW implements PrintCarName {

    @Override
    public void printName() {
        System.out.println("It's BMW car");
    }
}
