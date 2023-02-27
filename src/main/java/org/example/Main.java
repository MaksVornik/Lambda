package org.example;

import Implementations.*;
import Interfaces.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(" //First part:");
        System.out.println();
        //1. ОБЫЧНАЯ ИМПЛЕМЕТАЦИЯ
        //1. Без возвращаемого типа, без входящих параметров
        PrintCarName bmw = new BMW();
        bmw.printName();
        //2. С возвращаемым типом и с одним входящим параметром
        SayPeopleName slava = new Person();
        System.out.println(slava.sayName("Slava"));
        //3. С возвращаемым типом и с двумя входящими параметрами
        Human human1 = new Human("Slavik", 25);
        Human human2 = new Human("Maksimka", 16);
        System.out.println(human1.comparisonOf(human1, human2));
        //4. Без возвращаемого типа и с двумя входящими параметрами
        AnyOnePerson maks = new AnyOnePerson("Maks", 16);
        maks.greeting(maks.getName(), maks.getAge());
        //5. С возвращаемым типом(Т), с одним входящим параметром(Т) и с дженериком Т
        PrintAnySentence<String> sentence = new Sentence<>();
        System.out.println(sentence.anySentence("Slava lox"));
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println();
        System.out.println(" //Second part:");
        System.out.println();

        //2. АНОНИМНЫЙ КЛАСС

        //1. Без возвращаемого типа, без входящих параметров
        PrintCarName car = new PrintCarName() {
            @Override
            public void printName() {
                System.out.println("It's Mercedes car");
            }
        };
        car.printName();
        //2. С возвращаемым типом и с одним входящим параметром
        SayPeopleName sayPeopleName = new SayPeopleName() {
            @Override
            public String sayName(String name) {
                return name;
            }
        };
        System.out.println(sayPeopleName.sayName("Slava"));
        //3. С возвращаемым типом и с двумя входящими параметрами
        Human person1 = new Human("Slavik", 25);
        Human person2 = new Human("Maks", 16);
        ComparisonOfAges comparisonOfAges = new ComparisonOfAges() {
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
        };
        System.out.println(person1.comparisonOf(human1, human2));

        //4. Без возвращаемого типа и с двумя входящими параметрами
        AnyOnePerson maks2 = new AnyOnePerson("Maksim", 18);
        Greeting greeting = new Greeting() {
            @Override
            public void greeting(String name, int age) {
                System.out.println("My name's is " + name + " I'm " + age + " years old");
            }
        };
        greeting.greeting(maks2.getName(), maks.getAge());
        //5. С возвращаемым типо  м(Т), с одним входящим параметром(Т) и с дженериком Т
        PrintAnySentence<String> sentence2 = new PrintAnySentence<String>() {
            @Override
            public String anySentence(String AnySentence1) {
                return AnySentence1;
            }
        };
        System.out.println(sentence2.anySentence("Slava lox"));
        System.out.println();
        System.out.println(" //Third part: ");
        System.out.println();
        //3. ЛЯМБДА (Вот она)
        //1. Без возвращаемого типа, без входящих параметров
        PrintCarName car2 = () -> {
            System.out.println("It's a toyota car");
        };
        car2.printName();
        //2. С возвращаемым типом и с одним входящим параметром
        SayPeopleName sayPeopleName2 = (String name) -> {
            return name;
        };
        System.out.println(sayPeopleName2.sayName("Slava"));
        //3. С возвращаемым типом и с двумя входящими параметрами
        Human persn1 = new Human("Slavik", 25);
        Human persn2 = new Human("Maks", 16);
        ComparisonOfAges comparisonOfAges2 = (Human h1, Human h2) -> {
            String result = human1.getName();
            if (human1.getAge() < human2.getAge()) {
                result = human2.getName();
            } else if (human1.getAge() == human2.getAge()) {
                return "Возраст одинаковый";
            }
            return result;
        };
        System.out.println(persn1.comparisonOf(persn1, persn2));
        //4. Без возвращаемого типа и с двумя входящими параметрами
        AnyOnePerson maks3 = new AnyOnePerson("Maksim", 20);
        Greeting greeting2 = (String name, int age) -> {
            System.out.println("My name's is " + name + " I'm " + age + " years old");
        };
        greeting2.greeting(maks2.getName(), maks2.getAge());
        //5. С возвращаемым типо  м(Т), с одним входящим параметром(Т) и с дженериком Т
        PrintAnySentence<String> sentence3 = (String AnySentence2) -> {
            return AnySentence2;
        };
        System.out.println(sentence3.anySentence("Slava lox"));
        System.out.println();
        System.out.println(" //fourth part: ");
        System.out.println();

        //ССЫЛКИ НА МЕТОДЫ
        //1. Без возвращаемого типа, без входящих параметров
        PrintCarName carName = Main::printNameReference;
        carName.printName();
        //2. С возвращаемым типом и с одним входящим параметром
        SayPeopleName sayPeopleName3 = Main::sayName;
        System.out.println(sayPeopleName3.sayName("Slava"));
        //3. С возвращаемым типом и с двумя входящими параметрами
        Human pers1 = new Human("Slavik", 25);
        Human pers2 = new Human("Maks", 16);
        ComparisonOfAges comparisonOfAges3 = Main::comparisonOf;
        System.out.println(pers1.comparisonOf(pers1, pers2));
        //4. Без возвращаемого типа и с двумя входящими параметрами
        AnyOnePerson maks4 = new AnyOnePerson("Maksim", 20);
        Greeting greeting3 = Main::greeting;
        greeting3.greeting(maks4.getName(),maks4.getAge());
        //5. С возвращаемым типо  м(Т), с одним входящим параметром(Т) и с дженериком Т
        PrintAnySentence<String> sentence4 = Main::anySentence;
        System.out.println(sentence4.anySentence("Slava lox"));

    }

    //1
    public static void printNameReference() {
        System.out.println("It's Nisan car");
    }

    //2
    public static String sayName(String name) {
        return name;
    }

    //3
    public static String comparisonOf(Human human1, Human human2) {
        String result = human1.getName();
        if (human1.getAge() < human2.getAge()) {
            result = human2.getName();
        } else if (human1.getAge() == human2.getAge()) {
            return "Возраст одинаковый";
        }
        return result;
    }

    //4
    public static void greeting(String name, int age) {
        System.out.println("My name's is " + name + " I'm " + age + " years old");
    }

    //5
    public static <T> T anySentence(T sentence) {
        return sentence;
    }
}

