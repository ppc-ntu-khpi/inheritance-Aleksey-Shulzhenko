# Практична робота "Реалізація успадкування"
Цей репозиторій містить приклад виконання та інструкції для виконання практичної роботи з наслідування в JAVA. 

Для прикладу я змоделював **звичайнісінького кота**😉


## 1. Подумайте, які риси та поведінка притаманні всім без винятку тваринам
#### 🔹 **Риси (властивості):**
1. `name` — ім’я тварини
2. `age` — вік
3. `weight` — вага
4. `color` — колір

#### 🔸 **Поведінка (методи):**
1. `eat()` — тварина їсть
2. `sleep()` — тварина спить
3. `move()` — тварина рухається
4. `makeSound()` — тварина видає звук

## 2. Оберіть будь-яку тварину (не стримуйте свою фантазію😉)
### Чим відрізняється **какаду**?

🔸 Додаткові риси:
- `canTalk` — вміє говорити
- `wingSpan` — розмах крил

🔹 Додаткові методи:
- `fly()` — літає
- `talk()` — каже щось смішне
- `makeSound()` — кричить: «Каааар!»

## 3. З допомогою StarUML створіть діаграму класів для обраної тварини. Ви маєте отримати шось подібне до прикладу з цього репозиторію.

![alt text](Image/Image.png)

## 4. Згенеруйте каркасний код на основі діаграми
[Animal.java](domain/Animal.java)

[Cockatoo.java](domain/Cockatoo.java)

## 5. Допрацюйте код - всі методи мають виводити на екран повідомлення про те, що робить тварина!

[Animal.java](domain/Animal.java)

[Cockatoo.java](domain/Cockatoo.java)

## 6. Cтворіть тестовий клас, в методі main якого створіть об'єкт класу тварини та викличіть його методи

```java
// src/Animal.java
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


// src/Cockatoo.java
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


// src/Main.java
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
```

### Результат 
![alt text](<Image/image copy.png>)