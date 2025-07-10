package Polymorphism;

public class Main {
    static public void main(String[] args){
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.bark();
        cat.bark();
    }
}
