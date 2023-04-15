abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

 abstract class Mammal extends Animal {
    private boolean hasFur;

    public Mammal(String name, int age, boolean hasFur) {
        super(name, age);
        this.hasFur = hasFur;
    }

    public boolean hasFur() {
        return hasFur;
    }
}

class Dog extends Mammal {
    public Dog(String name, int age, boolean hasFur) {
        super(name, age, hasFur);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof!");
    }
}


 class Cat extends Mammal {
    public Cat(String name, int age, boolean hasFur) {
        super(name, age, hasFur);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}


class Fish extends Animal {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("...");
    }
}

public class Animals {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 5, true);
        Cat cat = new Cat("Fluffy", 3, true);
        Fish fish = new Fish("Goldie", 1);

        System.out.println(dog.getName() + " is a dog that is " + dog.getAge() + " years old and has fur: " + dog.hasFur());
        dog.makeSound();

        System.out.println(cat.getName() + " is a cat that is " + cat.getAge() + " years old and has fur: " + cat.hasFur());
        cat.makeSound();

        System.out.println(fish.getName() + " is a fish that is " + fish.getAge() + " years old.");
        fish.makeSound();
    }
}
