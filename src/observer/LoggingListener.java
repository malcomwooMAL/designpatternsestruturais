package observer;

import java.io.File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class LoggingListener implements EventListener {
    private File log;
    private String message;

    public LoggingListener(String logFilename, String message) {
        this.log = new File(logFilename);
        this.message = message;
    }

    @Override
    public void update(String eventType, String data) {
         try (FileWriter writer = new FileWriter(log, true)){ //Append = True
           writer.write(String.format(message, data) + "\n"); //Escreve mensagem formatada

         } catch(IOException e) {
              e.printStackTrace();
         }
    }
}


