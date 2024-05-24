package main.vtb.course.homework;

import main.vtb.course.homework.entity.*;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Барсик", 11, 200),
                new Dog("Бим", 5, 500, 10),
                new Wolf(4, 1200, 50),
                new Tiger(8, 1250, 100),
                new Cayot(13, 750, 5),
                new Tiger(2, 500, 30),
                new Cayot(7, 530, 14)
        };

        for (Animal a : animals) {
            a.run(50);
            a.swim(30);
        }

        Cat.getCatCount();
        Dog.getDogCount();
        Animal.getAnimalCount();

    }
}
