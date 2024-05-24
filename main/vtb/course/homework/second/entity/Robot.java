package main.vtb.course.homework.second.entity;

import java.time.LocalDate;

public class Robot extends Participant {

    private LocalDate productionDate;
    private String color;

    public Robot(String model, double maxRunningDistance, double maxJumpingDistance, LocalDate productionDate, String color) {
        super(model, maxRunningDistance, maxJumpingDistance);
        this.productionDate = productionDate;
        this.color = color;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
