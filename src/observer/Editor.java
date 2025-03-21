package observer;

import java.io.File;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("open", "save");  //Eventos que o Editor pode disparar
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", filePath); //Notifica com filepath
    }

     public void saveFile(String content) throws IOException{ //Adicionado lancamento de excecao, e conteudo a ser salvo
         if (this.file != null){
             try(PrintWriter writer = new PrintWriter(file)){
                 writer.write(content);
             }
             events.notify("save", file.getName()); // Notifica com filename
         }
         else {
              throw new IllegalStateException("No file opened to save.");
         }


     }
}
