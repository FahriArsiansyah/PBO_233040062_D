package Pertemuan10;


abstract class Animal {
    abstract void sound(); // metode abstrak

    void eat() { // metode konkret
        System.out.println("Animal is eating...");
    }
}

// Kelas Turunan: Dog
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog says: Bark!");
    }
}

// Kelas Turunan: Cat
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat says: Meow!");
    }
}

// Antarmuka Flyable
interface Flyable {
    void fly();
}

// Antarmuka Swimmable
interface Swimmable {
    void swim();
}

// Kelas yang mengimplementasikan Flyable
class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird flies using wings.");
    }
}

// Kelas yang mengimplementasikan Flyable
class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane flies using engines.");
    }
}

// Kelas yang mengimplementasikan Swimmable
class Fish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Fish swims using fins.");
    }
}
