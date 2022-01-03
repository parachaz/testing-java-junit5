package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {
IndexController controller;
    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    @Test
    void index() {
        assertEquals("index",controller.index(),()->"Wrong view returned");
    }

    @Test
    @DisplayName("Test exception")
    void oopsHandler() {
        assertThrows(ValueNotFoundException.class, ()->{
           controller.oopsHandler();
        },"None or wrong exception was thrown");
    }
}