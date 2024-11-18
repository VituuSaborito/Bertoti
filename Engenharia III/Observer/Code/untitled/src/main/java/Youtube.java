public class Youtube {
    private EventManager events = new EventManager();

    public void subscribe(String eventType, EventListener listener) {
        events.subscribe(eventType, listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        events.unsubscribe(eventType, listener);
    }

    public void uploadVideo(String videoTitle) {
        System.out.println("Vídeo " + videoTitle + " foi carregado.");
        events.notify("upload");
    }
}