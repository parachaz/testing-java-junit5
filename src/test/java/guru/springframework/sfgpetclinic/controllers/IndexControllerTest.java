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
        assertEquals("index",controller.index());
        assertEquals("index1",controller.index(),()->"Wrong view returned");
    }

    @Test
    @DisplayName("Test exception")
    void oupsHandler() {
        assertTrue("abc".equals(controller.oupsHandler()),()->"This is a very" +
                " expensive message to build");
    }
}