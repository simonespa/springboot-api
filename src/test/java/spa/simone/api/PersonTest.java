package spa.simone.api;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {

    private Person person;
    private final long id = 1L;
    private final String firstName = "test_first_name";
    private final String lastName = "test_last_name";

    @BeforeEach
    void initPerson() {
        this.person = new Person(id, firstName, lastName);
    }

    @Test
    void testGetters() {
        assertEquals(person.getId(), id);
        assertEquals(person.getFirstName(), firstName);
        assertEquals(person.getLastName(), lastName);
    }

    @Test
    void testSetters() {
        final String newFirstName = "new_first_name";
        final String newLastName = "new_last_name";
        person.setFirstName(newFirstName);
        person.setLastName(newLastName);
        assertEquals(person.getFirstName(), newFirstName);
        assertEquals(person.getLastName(), newLastName);
    }
}