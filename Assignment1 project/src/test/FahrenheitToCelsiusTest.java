package test;

import impl.FahrenheitToCelsius;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FahrenheitToCelsiusTest {

    FahrenheitToCelsius tester;

    @BeforeEach
    void setUp() {
        tester = new FahrenheitToCelsius();
    }

    @AfterEach
    void tearDown() {
        tester = null;
    }

    @Test
    void convertToCel() {
        assertEquals(4.55556,tester.convertToCel(40.2));
    }
    @Test
    void convertToCel1() {
        assertEquals(23.66667,tester.convertToCel(74.6));
    }

    @Test
    void convertToFahrenheit(){
        assertEquals(38.12,tester.convertToFahrenheit(3.4));
    }

    @Test
    void convertToFahrenheit1(){
        assertEquals(177.8,tester.convertToFahrenheit(81));
    }
}
