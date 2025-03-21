package state;

class LockedState extends State {

    LockedState(AudioPlayer player) {
        super(player);
        player.playing = false; //Garante que esteja travado e parado.
    }

    @Override
    public void clickLock() {
        // Se o player ESTAVA tocando, muda para PlayingState, senão, para ReadyState
        if (player.playing) {
            player.changeState(new PlayingState(player));
        } else {
            player.changeState(new ReadyState(player));
        }
    }

     @Override
    public void clickPlay() {
        // Bloqueado, então não faz nada.
    }
    @Override
    public void clickNext() {
        // Bloqueado, então não faz nada.
    }
    @Override
    public void clickPrevious() {
         // Bloqueado, então não faz nada.
    }

}
