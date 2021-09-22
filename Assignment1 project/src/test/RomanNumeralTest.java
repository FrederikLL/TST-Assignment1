package test;

import impl.RomanNumeral;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTest {

    RomanNumeral tester;

    @BeforeEach
    void setUp() {
        tester = new RomanNumeral();
    }

    @AfterEach
    void tearDown() {
        tester = null;
    }

    @Test
    void convertToRoman() {
        assertEquals("XXVI",tester.convertToRoman(26));
    }

    @Test
    void convertToRoman1() {
        assertEquals("LXXIX",tester.convertToRoman(79));
    }

    @Test
    void convertToRoman2() {
        assertEquals("MCDXLIV",tester.convertToRoman(1444));
    }
}
