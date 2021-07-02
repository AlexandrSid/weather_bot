package com.example.weather_bot.model;

public class Fact {
    private double temp;
    private double feels_like;
    private  double wind_speed;
    private double pressue_mm;

    @Override
    public String toString() {
        return "Fact{" +
                "temp=" + temp +
                ", feels_like=" + feels_like +
                ", wind_speed=" + wind_speed +
                ", pressue_mm=" + pressue_mm +
                '}';
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(double feels_like) {
        this.feels_like = feels_like;
    }

    public double getWind_speed() {
        return wind_speed;
    }

    public void setWind_speed(double wind_speed) {
        this.wind_speed = wind_speed;
    }

    public double getPressue_mm() {
        return pressue_mm;
    }

    public void setPressue_mm(double pressue_mm) {
        this.pressue_mm = pressue_mm;
    }
}
