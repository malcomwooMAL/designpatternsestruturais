package state;

class AudioPlayer {
    private State state;
    UI ui;  // Simplificando para UI, em vez de UserInterface
    private int volume;
    private String currentSong;

    public AudioPlayer() {
        this.state = new ReadyState(this); // Começa no estado "Ready"
        this.ui = new UI(); // Inicializa a UI
        // Conecta os eventos da UI aos métodos do AudioPlayer (delegação)
        ui.lockButton.onClick(this::clickLock);    // Usando method references (mais conciso)
        ui.playButton.onClick(this::clickPlay);
        ui.nextButton.onClick(this::clickNext);
        ui.prevButton.onClick(this::clickPrevious);
    }


    // Métodos para mudar o estado (chamados pelos estados)
    public void changeState(State state) {
        this.state = state;
    }

    // Métodos de UI delegados ao estado ATUAL
    public void clickLock() {
        state.clickLock();
    }

    public void clickPlay() {
        state.clickPlay();
    }

    public void clickNext() {
        state.clickNext();
    }

    public void clickPrevious() {
        state.clickPrevious();
    }



    // Métodos de serviço (chamados pelos estados) - Implementações de exemplo
    public void startPlayback() {
        System.out.println("Playing: " + currentSong);
        // Lógica real para iniciar a reprodução...
    }

    public void stopPlayback() {
        System.out.println("Playback stopped.");
        // Lógica real para parar a reprodução...
    }

    public void nextSong() {
        System.out.println("Skipping to next song...");
        // Lógica real para ir para a próxima música...
        currentSong = "Next Song"; // Exemplo simples
    }

    public void previousSong() {
        System.out.println("Returning to previous song...");
        // Lógica real para voltar para a música anterior...
        currentSong = "Previous Song"; // Exemplo simples
    }


    public void fastForward(int time) {
        System.out.println("Fast forwarding " + time + " seconds...");
        // Lógica real para avançar rápido...
    }

    public void rewind(int time) {
        System.out.println("Rewinding " + time + " seconds...");
        // Lógica real para retroceder...
    }

    //Método simples para simular se está tocando ou não.
     public boolean playing; //Poderia ser um getter: isPlaying()

}
