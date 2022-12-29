package lesson8;

import lesson7.enums.Periods;
import lesson8.WeatherData;

import java.io.IOException;

public interface WeatherProvider {

    WeatherData getWeather(Periods periods) throws IOException;

    WeatherData getAllFromDb() throws IOException;
}
