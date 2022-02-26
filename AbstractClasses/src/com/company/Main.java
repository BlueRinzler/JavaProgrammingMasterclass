package com.company;

public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog("Greyhound");
        dog.eat();
        dog.breathe();

        Parrot parrot = new Parrot("Ringneck");
        parrot.fly();
        parrot.breathe();
        parrot.eat();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();

    }
}
