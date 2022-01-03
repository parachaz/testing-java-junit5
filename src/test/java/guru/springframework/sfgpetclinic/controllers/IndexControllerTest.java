package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

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

    @Test
    void testTimeout() {
        assertTimeout(Duration.ofMillis(100),()->
            Thread.sleep(2000),"Method timed out"
        );
    }

    @Test
    @DisplayName("Test Long Running Method")
    void testTimeoutPreemptively() {
        assertTimeoutPreemptively(Duration.ofMillis(1000),()->
            Thread.sleep(900),"Method killed."
        );
    }
}