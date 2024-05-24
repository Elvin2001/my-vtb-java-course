package main.vtb.course.homework.second.entity;

public abstract class Participant implements Runnable, Jumpable {

    private String name;
    private double maxRunningDistance;
    private double maxJumpingDistance;
    private boolean success = true;

    public Participant(String name, double maxRunningDistance, double maxJumpingDistance) {
        this.name = name;
        this.maxRunningDistance = maxRunningDistance;
        this.maxJumpingDistance = maxJumpingDistance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getMaxRunningDistance() {
        return maxRunningDistance;
    }

    public void setMaxRunningDistance(double maxRunningDistance) {
        this.maxRunningDistance = maxRunningDistance;
    }

    public double getMaxJumpingDistance() {
        return maxJumpingDistance;
    }

    public void setMaxJumpingDistance(double maxJumpingDistance) {
        this.maxJumpingDistance = maxJumpingDistance;
    }

    public boolean isSuccess() {
        return success;
    }

    @Override
    public void jump(Obstacle o) {
        if (isSuccess()) {
            if (checkHeight(o)) {
                System.out.println(getName() + " справился со стеной! Ура!");
            } else {
                System.out.println(getName() + " не справился со стеной.");
                success = false;
            }
        }
    }

    public boolean checkHeight(Obstacle o) {
        return o.getMAX_HEIGHT() <= getMaxJumpingDistance();
    }

    public boolean checkLength(Obstacle o) {
        return o.getMAX_LENGTH() <= getMaxRunningDistance();
    }

    @Override
    public void run(Obstacle o) {
        if (isSuccess()) {
            if (checkLength(o)) {
                System.out.println(getName() + " справился с дорожкой! Ура!");
            } else {
                System.out.println(getName() + " не справился с дорожкой.");
                success = false;
            }
        }
    }
}
