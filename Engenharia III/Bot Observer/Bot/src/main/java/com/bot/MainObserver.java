package com.bot;

public class MainObserver {
    public static void main(String[] args) {
        Youtube youtube = new Youtube();
        NotificationDesktop desktop = new NotificationDesktop("7621664571:AAGTVL76cxC6OS_Gx6oBYPD9jA3yhi152yw");
        NotificationMobile mobile = new NotificationMobile();

        youtube.subscribe("upload", desktop);
        youtube.subscribe("upload", mobile);

        youtube.uploadVideo("Padrões de Design");
    }
}