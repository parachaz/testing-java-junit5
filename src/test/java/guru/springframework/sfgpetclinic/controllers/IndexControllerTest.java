package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

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
            Thread.sleep(50),"Method timed out"
        );
    }

    @Test
    @DisplayName("Test Long Running Method")
    void testTimeoutPreemptively() {
        assertTimeoutPreemptively(Duration.ofMillis(1000),()->
            Thread.sleep(900),"Method killed."
        );
    }

    @Test
    void testAssumptionTrueWhenNotTrue() {
        assumeTrue("PARACHA".equals(System.getenv("SYSTEM_NAME")));
    }

    @Test
    void testAssumptionTrueWithTrueAssumption() {
        assumeTrue("PARACHA".equalsIgnoreCase("paracha"));
    }

    @EnabledOnOs(OS.MAC)
    @Test
    void testOnMac() {
    }
    @EnabledOnOs(OS.WINDOWS)
    @Test
    void testOnWindows() {
    }

    @Test
    @EnabledIfEnvironmentVariable(named="USER",matches = "ZP")
    void testIfUserIsZaheer() {
    }

    @Test
    @EnabledOnJre(JRE.JAVA_11)
    void testIfJRE11() {

    }
    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void testIfJRE18() {
    }

}