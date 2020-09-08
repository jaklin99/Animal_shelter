import java.util.ArrayList;

public class Reservation {

    private final ArrayList<Animal> animals = new ArrayList<>();


    public ArrayList<Animal> getAnimals() {
        return animals;
    }
    public void newCat(String name, Gender gender, String badHabits){
        this.animals.add(new Cat(name, gender, badHabits));
    }
    public void newDog(String name, Gender gender){
        this.animals.add(new Dog(name, gender));
    }
}