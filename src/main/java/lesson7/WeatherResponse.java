package lesson7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class WeatherResponse {
    //private String city; - selectedCity из ApplicationGlobalState
    @JsonProperty("LocalObservationDateTime")
    private String date;
    @JsonProperty("WeatherText")
    private String weatherText;
    @JsonProperty("Temperature")
    private String temperature;

    public WeatherResponse() {
    }

    @JsonProperty("LocalObservationDateTime")
    public String getDate() {
        return date;
    }
    @JsonProperty("LocalObservationDateTime")
    public void setDate(String date) {
        this.date = date;
    }
    @JsonProperty("WeatherText")
    public String getWeatherText() {
        return weatherText;
    }
    @JsonProperty("WeatherText")
    public void setWeatherText(String weatherText) {
        this.weatherText = weatherText;
    }
    @JsonProperty("Temperature")
    public String getTemperature() {
        return temperature;
    }
    @JsonProperty("Temperature")
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
}

