package domain;
public class Cockatoo extends Animal {
    protected boolean canTalk;
    protected double wingSpan;

    public Cockatoo(String name, int age, double weight, String color, boolean canTalk, double wingSpan) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.canTalk = canTalk;
        this.wingSpan = wingSpan;
    }

    public void fly() {
        System.out.println(name + " летить з розмахом крил " + wingSpan + " метрів.");
    }

    @Override
    public void makeSound() {
        if (canTalk) {
            System.out.println(name + " каже: Привіт! Я какаду!");
        } else {
            System.out.println(name + " кричить: Каааар!");
        }
    }
}