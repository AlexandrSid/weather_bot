package com.example.weather_bot.model;

public class Weather {
    private long now;
    private Fact fact;
    private Info info;

    public long getNow() {
        return now;
    }

    public void setNow(long now) {
        this.now = now;
    }

    public Fact getFact() {
        return fact;
    }

    public void setFact(Fact fact) {
        this.fact = fact;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }
}
