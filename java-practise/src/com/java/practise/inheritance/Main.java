package com.java.practise.inheritance;

public class Main {
    static void main() {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Puppy puppy = new Puppy();

        puppy.name = "Lahari";
        puppy.hairColour = "Brown";


        cat.id = 21;
        cat.gender = 'F';
        cat.name = "snoopy";

        dog.name = "Tommy";

        puppy.sound();

        dog.bark();
        dog.eat();
        dog.sleep();
        cat.run();
    }
}
