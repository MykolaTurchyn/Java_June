package partTwo;

import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@ToString

public class Car {
    private int id;
    private String model;
    private Driver driver;

    public Car(int id, String model, String name, String surname, int age, int experiance) {
        this.id = id;
        this.model = model;
        this.driver = new Driver(name,surname,age, experiance);
    }
}
