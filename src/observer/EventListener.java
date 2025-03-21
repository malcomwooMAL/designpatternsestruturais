package observer;

import java.io.File;

public interface EventListener {
    void update(String eventType, String data); // Ou (String eventType, File file) se você precisar do objeto File.
}
