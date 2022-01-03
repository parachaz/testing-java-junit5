package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void groupAssertions() {
        //given
        Person person = new Person(1l,"Joe","Buck");
        //test
        assertAll("Test Person Properties setting",
                ()->assertEquals("Joe1",person.getFirstName(),()->"First " +
                        "Names" +
                        " " +
                        "didn't match"),
                ()->assertEquals("Buck",person.getLastName(),()->"Last Names " +
                        "didn't match" ));

    }
}