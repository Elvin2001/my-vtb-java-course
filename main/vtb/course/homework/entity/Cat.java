package main.vtb.course.homework.entity;

public class Cat extends Animal {

    protected static int counter;

    public Cat(int age, double runningDistance, double swimmingDistance) {
        super(null, age, runningDistance, swimmingDistance);
        counter++;
    }

    public Cat(String nickName, double age, double runningDistance) {
        super(nickName, age, runningDistance, 0);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public void run(double distance) {
        if (distance <= getMaxRunningObstacleLength()) {
            System.out.println(getNickName() + " пробежал " + distance + " м.");
            System.out.println();
        }
    }

    @Override
    public void swim(double distance) {
        System.out.println(getNickName() + " не умеет плавать.");
    }

    public static void getCatCount() {
        System.out.println("Всего котов - " + counter);
    }
}
