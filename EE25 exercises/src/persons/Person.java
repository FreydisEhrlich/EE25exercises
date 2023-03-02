package persons;

public class Person {
    String name;
    String surname;
    String gender;
    int age;
    int idNum;

    void hasReachedRetirementAge() {
        if (this.gender.equals("male")) {
            if (this.age >= 65) {
                System.out.println("retired");
            }  else {
                    System.out.println("not retired");
                }
            } else if (this.gender.equals("female")) {
            if (this.age >= 60) {
                System.out.println("retired");
            } else {
                System.out.println("not retired");
            }
        }
    }

}
