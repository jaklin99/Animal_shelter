import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Dog extends Animal
{
    private LocalDate lastWalk;

    public LocalDate getLastWalk() {
        return lastWalk;
    }

    private boolean needWalk;

    public Dog(String name, Gender gender) {
        super(name, gender);
        this.lastWalk=LocalDate.now();
    }
    public Boolean needWalk() {

        Period period= Period.between(LocalDate.now(), lastWalk);
        return period.getDays() >= 1;
    }

    @Override
    public String toString() {
        return super.toString() + ", last walk: " + this.getLastWalk().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
    }
}
