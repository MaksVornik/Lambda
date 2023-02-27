package Implementations;

import Interfaces.Greeting;

public class AnyOnePerson implements Greeting {
    private String name;
    private int age;

    public AnyOnePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void greeting(String name, int age) {
        System.out.println("My name's is " + name + " I'm " + age + " years old");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
