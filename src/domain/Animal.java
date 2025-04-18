package domain;
public class Animal {
    protected String name;
    protected int age;
    protected double weight;
    protected String color;

    public void eat() {
        System.out.println(name + " їсть свою їжу.");
    }

    public void sleep() {
        System.out.println(name + " спить солодким сном.");
    }

    public void move() {
        System.out.println(name + " рухається по своїм справам.");
    }

    public void makeSound() {
        System.out.println(name + " видає звук.");
    }
}