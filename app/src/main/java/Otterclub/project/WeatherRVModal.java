package Otterclub.project;

public class WeatherRVModal {
    private String time;
    private String temperature;
    private String icon;
    private String windSpeed;

    public WeatherRVModal(String time, String temperature, String icon , String windSpeed) {
        this.time = time;
        this.time = temperature;
        this.time = icon;
        this.time = windSpeed;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }
}
