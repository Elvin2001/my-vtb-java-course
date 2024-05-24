package main.vtb.course.homework.entity;

public class Tiger extends Cat {

    public Tiger(int age, double maxRunningDistance, double maxSwimmingDistance) {
        super(age, maxRunningDistance, maxSwimmingDistance);
    }

    @Override
    public void run(double distance) {
        if (distance <= getMaxRunningObstacleLength()) {
            System.out.println("Волк" + " пробежал " + distance + " м.");
            System.out.println();
        }
    }

    @Override
    public void swim(double distance) {
        if (distance <= getMaxSwimmingObstacleLength()) {
            System.out.println("Тигр" + " проплыл " + distance + " м.");
            System.out.println();
        }
    }
}
