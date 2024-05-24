package main.vtb.course.homework.second;

import main.vtb.course.homework.second.entity.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Создаём участников
        Participant[] participants = {
                new Cat("Murzik", 40, 4.0, 5, "Ginger"),
                new Human("Nikolay", 500, 2.2, 26, "Male", LocalDate.of(1998, 3, 25)),
                new Robot("X7ZKO25C", 130, 2.7, LocalDate.of(2024, 5, 27), "White")
        };

        // Создаём препятствия
        Obstacle track = new Track(220, 0);
        Obstacle wall = new Wall(0, 6.7);

        Obstacle[] obstacles = {
                track,
                wall
        };

        // Преодолевание препятствий
        for (Participant p : participants) {
            for (Obstacle o : obstacles) {
                if (o.getClass().getSimpleName().equals("Track")) {
                    p.run(o);
                } else {
                    p.jump(o);
                }

            }
        }

    }
}
