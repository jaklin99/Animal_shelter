import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {
    private Reservation reservation;
    @BeforeEach //this is run before the tests
    void TestInitialize()
    {
        this.reservation = new Reservation();
    }
    @Test
    void newCat() {
        //this.reservation = new Reservation();
        assertEquals(0, this.reservation.getAnimals().stream().count());
        this.reservation.newCat("Ms. Meow", Gender.Female, "Scratches couch");
        assertEquals(1, this.reservation.getAnimals().stream().count());
    }

    @Test
    void newDog() {
        //this.reservation = new Reservation();
        assertEquals(0,this.reservation.getAnimals().stream().count());
        this.reservation.newDog("Sgt. Woof", Gender.Male);
        assertEquals(1, this.reservation.getAnimals().stream().count());
    }
}