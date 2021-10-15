package partOne;

import lombok.*;
import partOne.Gender;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Human {
    private int id;
    private String name;
    private String surname;
    private double age;
    private Gender gender;
}
