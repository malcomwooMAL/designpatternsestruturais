package observer;

import java.io.IOException;

public class Application {
    public static void main(String[] args) { //Usando main em vez de config
        Editor editor = new Editor();

        LoggingListener logger = new LoggingListener(
                "path/to/log.txt",
                "Someone has opened the file: %s"
        );
        editor.events.subscribe("open", logger);

        EmailAlertsListener emailAlerts = new EmailAlertsListener(
                "admin@example.com",
                "Someone has changed the file: %s"
        );
        editor.events.subscribe("save", emailAlerts);

        try{
           editor.openFile("test.txt");
           editor.saveFile("Hello Observer");
        }
        catch (IOException e){ // Tratando o erro
           e.printStackTrace();

        }
    }
}
