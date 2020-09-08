public class Cat extends Animal
{
    private String badHabits;
    public Cat(String name, Gender gender) {
        super(name, gender);
    }
    public Cat(String name, Gender gender, String badHabits) {
        super(name, gender);
        this.badHabits=badHabits;
    }

    public String getBadHabits() {
        return badHabits;
    }

    @Override
    public String toString() {
        return super.toString() + "badHabits='" + badHabits + '\'' +
                '}';
    }
}
