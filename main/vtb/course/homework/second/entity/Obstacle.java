package main.vtb.course.homework.second.entity;

public abstract class Obstacle {

    private final double MAX_LENGTH;
    private final double MAX_HEIGHT;

    public Obstacle(double MAX_LENGTH, double MAX_HEIGHT) {
        this.MAX_LENGTH = MAX_LENGTH;
        this.MAX_HEIGHT = MAX_HEIGHT;
    }

    public double getMAX_LENGTH() {
        return MAX_LENGTH;
    }

    public double getMAX_HEIGHT() {
        return MAX_HEIGHT;
    }

}
