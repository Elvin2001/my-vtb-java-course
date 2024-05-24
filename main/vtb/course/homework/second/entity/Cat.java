package main.vtb.course.homework.second.entity;

public class Cat extends Participant {

    private String nickName;
    private int age;
    private String color;

    public Cat(String name, double maxRunningDistance, double maxJumpingDistance, int age, String color) {
        super(name, maxRunningDistance, maxJumpingDistance);
        this.nickName = nickName;
        this.age = age;
        this.color = color;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
