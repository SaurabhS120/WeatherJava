package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherTest {
    @Test
    void weatherObjTest() {
        Weather weather1 = new Weather();
        Weather weather2 = new Weather();
        Weather weather3 = new Weather("Abc", 20);
        Weather weather4 = new Weather("Abc", 20);
        assertNotNull(weather1);
        assertEquals(weather1, weather2);
        assertNotEquals(weather2, weather3);
        assertNotEquals(weather2.toString(), weather3.toString());
        assertEquals(weather3, weather4);
        assertNotEquals(new Object(), weather1);
        assertEquals(weather3.toString(), weather4.toString());
        assertEquals("Weather(cityName : ,temp : 0)", weather1.toString());
        assertEquals("Weather(cityName : Abc,temp : 20)", weather3.toString());
    }
}