package com.bot;

import org.telegram.telegrambots.client.okhttp.OkHttpTelegramClient;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.TelegramClient;


public class NotificationDesktop implements EventListener {
    private final TelegramClient telegramClient;

    public NotificationDesktop(String botToken) {
        telegramClient = new OkHttpTelegramClient(botToken);
    }

    @Override

    public void update() {

        String notificationMessageDesktop = "Notificação no Desktop recebida.";

        SendMessage message = SendMessage.builder()
                .chatId(MyAmazingBot.chat_id)  // Substitua pelo chat ID real
                .text(notificationMessageDesktop)
                .build();

        try {
            telegramClient.execute(message); // Envia a mensagem usando o TelegramClient
        } catch (TelegramApiException e) {
            e.printStackTrace(); // Tratar exceção
        }
    }
}