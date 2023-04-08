package org.example;

import org.example.logger.ChildLogable;
import org.example.logger.Logger;

public class Weather implements ChildLogable {

    public String city;
    public int temp;

    public Weather() {
        city = "";
        temp = 0;
    }

    public Weather(String city, int temp) {
        this.city = city;
        this.temp = temp;
    }

    @Override
    public void onLog(Logger logger) {
        logger.logLine("Temperature in " + city + " : " + temp);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Weather) {
            Weather weather = (Weather) obj;
            return weather.city == this.city && weather.temp == this.temp;
        } else {
            return super.equals(obj);
        }
    }

    @Override
    public String toString() {

        return "Weather(cityName : " + city + ",temp : " + temp + ")";
    }
}
