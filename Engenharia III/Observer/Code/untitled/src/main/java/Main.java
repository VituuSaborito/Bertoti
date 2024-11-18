public class Main {
    public static void main(String[] args) {
        Youtube youtube = new Youtube();
        NotificationDesktop desktop = new NotificationDesktop();
        NotificationMobile mobile = new NotificationMobile();

        youtube.subscribe("upload", desktop);
        youtube.subscribe("upload", mobile);

        youtube.uploadVideo("Padrões de Design");
    }
}
