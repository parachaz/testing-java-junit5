package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OwnerTest {
    @Test
    void dependentAssertions() {
        Owner owner = new Owner(1l, "Joe", "Buck");
        owner.setCity("Dallas");
        owner.setTelephone("1234567890");

        assertAll("Properties test", () -> assertAll("Person Properties",
                                                     () -> assertEquals("Joe",
                                                                        owner.getFirstName(),()->"First Names didn't match"),
                                                     () -> assertEquals("Buck",
                                                                        owner.getLastName(),()->"Last names didn't match")),
                  () -> assertAll("Owner Properties",
                                  () -> assertEquals("Dallas",
                                                     owner.getCity(),()->
                                                             "City values " +
                                                                     "didn't " +
                                                                     "match"),
                                  () -> assertEquals("1234567890",
                                                     owner.getTelephone(),
                                  "Telephone numbers didn't match")));
    }
}