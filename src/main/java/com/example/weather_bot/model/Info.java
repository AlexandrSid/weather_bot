package com.example.weather_bot.model;

public class Info {

    private String url;

    @Override
    public String toString() {
        return "Info{" +
                "url='" + url + '\'' +
                '}';
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
