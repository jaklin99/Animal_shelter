import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    private Cat cat;
    @BeforeEach
    public void testInitialize()
    {
        this.cat = new Cat("Ms. Meow", Gender.Female, "Scratches couch");
    }

    @Test
    public void testConstructor()
    {
        assertEquals("Ms. Meow", this.cat.getName());
        assertEquals(Gender.Female, this.cat.getGender());
        assertNull(this.cat.getReservedBy());
        assertEquals("Scratches couch", this.cat.getBadHabits());
    }

    @Test
    public void testReservation()
    {
        assertNull(this.cat.getReservedBy());
        assertTrue(this.cat.reserve("John Doe"));
        assertNotNull(this.cat.getReservedBy());
        assertEquals("John Doe", this.cat.getReservedBy().getName());
        assertFalse(this.cat.reserve("Jane Doe"));
    }

}