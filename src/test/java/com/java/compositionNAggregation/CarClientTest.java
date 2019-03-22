package com.java.compositionNAggregation;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarClientTest {


    public CarClientMock carClient;

    @BeforeEach
    public void setUpMyTestInputs(){
     carClient = new CarClientMock();
    }
    @Nested
    @Tag("RequiredCarService")
    class NestedCases{

        @Test
        public void testRequiredCarServiceWith4Strokes(){

            List<Car> result = carClient.getRequiredCars(4);
            assertEquals(2,result.size());

        }

        @Test
        public void testRequiredCarServiceWithNoStrokes(){
            List<Car> result = carClient.getRequiredCars(0);
            assertEquals(1,result.size());



        }
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void runOnWindows(){
        System.out.println("running on windows");
        assertTrue(true);
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    public void runOnJRE8(){
        System.out.println("running on JRE8");
        assertTrue(true);
    }

    @Test // Static JavaScript expression.
    @EnabledIf("2 * 3 == 6")
    void willBeExecuted() {
        // ...
    }

}
