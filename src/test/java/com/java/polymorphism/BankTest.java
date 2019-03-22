package com.java.polymorphism;


import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;


public class BankTest {

    @Test
   public  void testPolymorphism() {
        Bank b;
        SBI ob = new SBI(4.0f, 4.3f);
        assertEquals(4.0f+4.3f,ob.getRateOfInterest(),0.0f);
    }
 /*   @Test
    @Disabled
    @Tag("")
    void exceptionTesting() {
        Exception exception = assertThrows(ArithmeticException.class, () ->
                calculator.divide(1, 0));
        assertEquals("/ by zero", exception.getMessage());
    }*/

    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void onLinuxOrMac() {
        // ...
    }

    @Test
    @Disabled
    @Tag("excludeThisTest")
    public void timeoutNotExceeded() {
        // The following assertion succeeds.
        assertTimeout(ofMinutes(2), () -> {
            // Perform task that takes less than 2 minutes.
        });
    }

}
