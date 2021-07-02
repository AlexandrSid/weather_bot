package com.example.weather_bot;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Location;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.GetUpdates;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.GetUpdatesResponse;

import java.util.List;

public class Main {
    private static int offset = 0;
    public static void main(String[] args) {


        TelegramBot bot = new TelegramBot("1046879930:AAGcW1fCKsGBmcK6R7XBsLvcuvnx5OuX56I");

        while (true){

            GetUpdates getUpdates = new GetUpdates().limit(1).offset(offset).timeout(0);

            GetUpdatesResponse updatesResponse = bot.execute(getUpdates);

            List<Update> updates = updatesResponse.updates();

            if (!updates.isEmpty()){
                Update update = updates.get(0);
                System.out.println(update);

                Message message = update.message();
                String answer = "hello, i can show you weather";

                if("/start".equals(message.text())) {


                }
                else if(message.location() != null) {
                    Location location = message.location();
                }else {
                    answer = "I don't know this command";
                }
                SendMessage sendMessage = new SendMessage(message.chat().id(), answer);

                bot.execute(sendMessage);

                offset = update.updateId() + 1;
            }
        }
    }
}
