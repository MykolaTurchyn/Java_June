package partOne;

import partOne.Gender;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human(1, "kokos", "Ananasovych", 12.5, Gender.MALE);
        Human human2 = new Human(2 ,"abrikos", "Kokosovych", 15, Gender.FEMALE);

        ArrayList<Human> people;
        people = new ArrayList<>();
        people.add(human1);
        people.add(human2);
        System.out.println(people);
    }
}
