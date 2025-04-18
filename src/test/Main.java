package test;

import domain.Cockatoo;

public class Main {
    public static void main(String[] args) {
        Cockatoo kakadu = new Cockatoo("Кеша", 5, 0.9, "білий", true, 0.75);

        kakadu.eat();
        kakadu.sleep();
        kakadu.move();
        kakadu.fly();
        kakadu.makeSound();
    }
}
