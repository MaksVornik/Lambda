package Implementations;

import Interfaces.SayPeopleName;

public class Person implements SayPeopleName {
    @Override
    public String sayName(String name) {
        return name;
    }
}
