package com.example.weather_bot;

import com.example.weather_bot.model.Weather;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class WeatherService {
    private static String token;
    private static String URL = "https://api.weather.yandex.ru/v2/forecast?lat=%f&lon=%f&lang=ru";

    public WeatherService(String token) {
        this.token = token;
    }

    public static Weather getWeather(double lon, double lat) throws IOException{
        OkHttpClient client = new OkHttpClient();



        Request request = new Request.Builder().url(String.format(URL, lat, lon)).header("X-Yandex-API-Key", token).build();

        try(Response response = client.newCall(request).execute()){
            Gson mapper = new Gson();
            return mapper.fromJson(response.body().string(), Weather.class);
        }
    }

    public static void main(String[] args) throws IOException {
        WeatherService weatherService = new WeatherService("3d0b5aa9-42f6-4d02-be0b-d49e161b4625");
        System.out.println(WeatherService.getWeather(58.34875, 48.000000));
    }

    @Override
    public String toString() {
        return "WeatherService{" +
                "token='" + token + '\'' +
                '}';
    }
}
