package observer;

import java.io.File;

class EmailAlertsListener implements EventListener {
    private String email;
    private String message;

    public EmailAlertsListener(String email, String message) {
        this.email = email;
        this.message = message;
    }

    @Override
    public void update(String eventType, String data) {
         //Simulando envio de e-mail (poderia ser uma biblioteca de envio real)
         System.out.println("Sending email to " + email + ": " + String.format(message,data));
    }
}
