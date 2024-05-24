package main.vtb.course.homework.second.entity;

import java.time.LocalDate;

public class Human extends Participant {

    private String name;
    private int age;
    private String gender;
    private LocalDate birthDate;

    public Human(String name, double maxRunningDistance, double maxJumpingDistance, int age, String gender, LocalDate birthDate) {
        super(name, maxRunningDistance, maxJumpingDistance);
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
