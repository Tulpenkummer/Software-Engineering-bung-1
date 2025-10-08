package org.hbrs.se1.ws25.tests.uebung1;

import org.hbrs.se1.ws25.exercises.uebung1.control.GermanTranslator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GermanTranslatorTest {

    @Test
    public void positiverTest() {
        GermanTranslator translator = new GermanTranslator();

        assertEquals("eins", translator.translateNumber(1));
        assertEquals("drei", translator.translateNumber(3));
        assertEquals("fünf", translator.translateNumber(5));
        assertEquals("sieben", translator.translateNumber(7));
        assertEquals("zehn", translator.translateNumber(10));
    }
    @Test
    public void nullTest() {
        GermanTranslator translator = new GermanTranslator();

        String result = translator.translateNumber(0);
        assertTrue(result.contains("nicht möglich"));
        assertTrue(result.contains("1.0"));
    }
    @Test
    public void negativerTest() {
        GermanTranslator translator = new GermanTranslator();

        String result = translator.translateNumber(-3);
        assertTrue(result.contains("nicht möglich"));
    }
    @Test
    public void zuHochTest() {
        GermanTranslator translator = new GermanTranslator();

        String result = translator.translateNumber(11);
        assertTrue(result.contains("nicht möglich"));
    }
}