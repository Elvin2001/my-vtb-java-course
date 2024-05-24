package main.vtb.course.homework.entity;

public class Cayot extends Dog {
    public Cayot(int age, double maxRunningDistance, double maxSwimmingDistance) {
        super(age, maxRunningDistance, maxSwimmingDistance);
    }

    @Override
    public void run(double distance) {
        if (distance <= getMaxRunningObstacleLength()) {
            System.out.println("Кайот" + " пробежал " + distance + " м.");
            System.out.println();
        }
    }

    @Override
    public void swim(double distance) {
        if (distance <= getMaxSwimmingObstacleLength()) {
            System.out.println("Кайот" + " проплыл " + distance + " м.");
            System.out.println();
        }
    }
}
