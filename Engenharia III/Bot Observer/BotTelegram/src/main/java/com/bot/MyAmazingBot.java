package com.bot;

import org.telegram.telegrambots.client.okhttp.OkHttpTelegramClient;
import org.telegram.telegrambots.longpolling.util.LongPollingSingleThreadUpdateConsumer;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.TelegramClient;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MyAmazingBot implements LongPollingSingleThreadUpdateConsumer {
    private final TelegramClient telegramClient;
    private Youtube youtube;
    private NotificationDesktop desktop;
    private ScheduledExecutorService scheduler;
    public static long chat_id;


    public MyAmazingBot(String botToken) {
        telegramClient = new OkHttpTelegramClient(botToken);
        this.youtube = new Youtube();
        this.desktop = new NotificationDesktop(botToken);
        this.scheduler = Executors.newScheduledThreadPool(1); // Inicializa o agendador
    }

    @Override
    public void consume(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String message_text = update.getMessage().getText();
            chat_id = update.getMessage().getChatId();

            SendMessage message = null;
            if (message_text.equals("/subscribe")) {
                message = SendMessage
                        .builder()
                        .chatId(chat_id)
                        .text("Você está inscrito agora.")
                        .build();
                this.youtube.subscribe("upload", this.desktop); // Inscreve o desktop no canal de "upload"

            } else if (message_text.equals("/unsubscribe")) {
                message = SendMessage
                        .builder()
                        .chatId(chat_id)
                        .text("Você não está mais inscrito.")
                        .build();
                this.youtube.unsubscribe("upload", this.desktop); // Remove a inscrição do desktop

            } else if (message_text.equals("/notification")) {
                message = SendMessage
                        .builder()
                        .chatId(chat_id)
                        .text("Você será notificado sempre que sair um vídeo novo.")
                        .build();

                // Inicia o envio periódico de notificações (simulando vídeos novos)
                scheduler.scheduleAtFixedRate(() -> {
                    System.out.println("Simulando novo vídeo...");
                    this.youtube.uploadVideo("upload"); // Notifica os inscritos
                }, 0, 10, TimeUnit.SECONDS); // A cada 10 segundos

            } else {
                message = SendMessage
                        .builder()
                        .chatId(chat_id)
                        .text(message_text)
                        .build();
            }

            try {
                System.out.println(message.toString());
                telegramClient.execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
