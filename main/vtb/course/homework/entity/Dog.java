package main.vtb.course.homework.entity;

public class Dog extends Animal {

    protected static int counter;

    public Dog(int age, double maxRunningDistance, double maxSwimmingDistance) {
        super(null, age, maxRunningDistance, maxSwimmingDistance);
        counter++;
    }

    public Dog(String nickName, double age, double maxRunningDistance, double maxSwimmingDistance) {
        super(nickName, age, maxRunningDistance, maxSwimmingDistance);
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
        if (distance <= getMaxSwimmingObstacleLength()) {
            System.out.println(getNickName() + " проплыл " + distance + " м.");
            System.out.println();
        }
    }

    public static void getDogCount() {
        System.out.println("Всего собак - " + counter);
    }
}
