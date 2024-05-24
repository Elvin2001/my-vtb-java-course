package main.vtb.course.homework.entity;

public abstract class Animal implements Movement {

    private String nickName;
    private double age;
    private static int counter;
    private double maxRunningObstacleLength;
    private double maxSwimmingObstacleLength;

    public Animal(String nickName, double age, double maxRunningObstacleLength, double maxSwimmingObstacleLength) {
        this.nickName = nickName;
        this.age = age;
        this.maxRunningObstacleLength = maxRunningObstacleLength;
        this.maxSwimmingObstacleLength = maxSwimmingObstacleLength;
        counter++;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public static int getCounter() {
        return counter;
    }

    public double getMaxRunningObstacleLength() {
        return maxRunningObstacleLength;
    }

    public double getMaxSwimmingObstacleLength() {
        return maxSwimmingObstacleLength;
    }

    public abstract void run(double distance);

    public abstract void swim(double distance);

    public static void getAnimalCount() {
        System.out.println("Всего животных - " + counter);
    }
}
