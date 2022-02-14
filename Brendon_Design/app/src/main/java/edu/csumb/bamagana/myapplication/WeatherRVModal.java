package edu.csumb.bamagana.myapplication;

public class WeatherRVModal {

    private String time;
    private String temp;
    private String icon;
    private String windSpe;

    public WeatherRVModal(String time, String temp, String icon, String windSpe) {
        this.time = time;
        this.temp = temp;
        this.icon = icon;
        this.windSpe = windSpe;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getWindSpe() {
        return windSpe;
    }

    public void setWindSpe(String windSpe) {
        this.windSpe = windSpe;
    }
}
