package persons;

public class Main {
    public static void main(String[] args) {
        Person mary = new Person ();
        Person john = new Person ();

        mary.name = "Mary";
        mary.gender = "female";
        mary.age = 23;

        john.name = "John";
        john.gender = "male";
        john.age = 88;

        mary.hasReachedRetirementAge();
        john.hasReachedRetirementAge();
    }

}
