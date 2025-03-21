package state;

class ReadyState extends State {

    ReadyState(AudioPlayer player) {
        super(player);
        player.playing = false;//Garante que ao entrar neste estado, pare de tocar.
    }

    @Override
    public void clickLock() {
        player.changeState(new LockedState(player));
    }

    @Override
    public void clickPlay() {
        player.startPlayback(); // Começa a reprodução
        player.changeState(new PlayingState(player)); // Muda para o estado "Playing"

    }

      @Override
    public void clickNext() {
        //Mesmo no estado Ready, pode ir para a proxima.
          player.nextSong();
    }
    @Override
    public void clickPrevious() {
        //Mesmo no estado Ready, pode ir para a anterior
         player.previousSong();
    }
}
