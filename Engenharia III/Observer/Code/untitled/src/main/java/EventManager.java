import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    private Map<String, List<EventListener>> subscribers = new HashMap<>();

    public void subscribe(String eventType, EventListener listener) {
        subscribers.computeIfAbsent(eventType, k -> new ArrayList<>()).add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> listeners = subscribers.get(eventType);
        if (listeners != null) {
            listeners.remove(listener);
        }
    }

    public void notify(String eventType) {
        List<EventListener> listeners = subscribers.get(eventType);
        if (listeners != null) {
            for (EventListener listener : listeners) {
                listener.update();
            }
        }
    }
}