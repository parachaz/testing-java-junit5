package guru.springframework.sfgpetclinic.services.springdatajpa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Disabled until mocking is done")
class OwnerSDJpaServiceTest {

    OwnerSDJpaService service;
    @BeforeEach
    void setUp() {
        service = new OwnerSDJpaService(null,null,null);
    }

    @Disabled("Disabled until method is implemented")
    @Test
    void findByLastName() {

    }

    @Test
    void findAllByLastNameLike() {
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }
}