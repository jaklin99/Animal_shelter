import java.time.LocalDate;
import java.util.concurrent.locks.ReadWriteLock;

public class Animal
{
    private String name;
    private Gender gender;
    private Reservor reservedBy;

    public Animal(String name, Gender gender) {
        this.name=name;
        this.gender=gender;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Reservor getReservedBy() {
        return reservedBy;
    }
    public boolean reserve(String reservedBy){
        if (this.reservedBy==null)
        {
            this.reservedBy = new Reservor(reservedBy, LocalDate.now());
            return true;
        }
        return false;
    }
    @Override
    public String toString()
        {
            String reserved="not reserved";
            if (this.reservedBy!=null) {
            reserved= "reserved by" + this.getReservedBy().getName();
            }
            return this.getName() + " " + this.getGender() + " " + reserved;
        }
}
