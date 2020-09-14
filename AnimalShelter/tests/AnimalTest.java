import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    private Animal animal;
    @BeforeEach
    public void TestInitialize()
    {
        this.animal = new Animal("Ugly Duckling", Gender.Male);
        //this.animal = new Cat("Ms. Meow", Gender.Female, "Scratches couch");
    }


    @Test
    void testConstructor() {
       assertEquals("Ugly Duckling", this.animal.getName());
       assertEquals(Gender.Male, this.animal.getGender());
       assertNull(this.animal.getReservedBy());
    }
    @org.junit.jupiter.api.Test
    void reserve() {
        assertNull(this.animal.getReservedBy());
        assertTrue(this.animal.reserve("John Doe"));
        assertNotNull(this.animal.getReservedBy());
        assertEquals("John Doe", this.animal.getReservedBy().getName());
        assertFalse(this.animal.reserve("Jane Doe"));

    }
}