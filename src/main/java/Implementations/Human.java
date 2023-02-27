package Implementations;

import Interfaces.ComparisonOfAges;

public class Human implements ComparisonOfAges {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String comparisonOf(Human human1, Human human2) {
        String result = human1.getName();
        if (human1.getAge() < human2.getAge()) {
            result = human2.getName();
        } else if (human1.getAge() == human2.getAge()) {
            return "Возраст одинаковый";
        }
        return result;
    }
}
