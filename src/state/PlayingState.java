package state;

class PlayingState extends State {

    PlayingState(AudioPlayer player) {
        super(player);
        player.playing = true; // Garante que esteja tocando
    }

    @Override
    public void clickLock() {
        player.changeState(new LockedState(player));
    }

    @Override
    public void clickPlay() {
        player.stopPlayback();
        player.changeState(new ReadyState(player));
    }
    @Override
    public void clickNext() {
        player.nextSong();
    }
      @Override
    public void clickPrevious() {
         player.previousSong();
    }

     //Novos métodos para fastForward e rewind, acessados diretamente.
     public void clickNext(boolean doubleClick){ //Overload
         if (doubleClick) {
             player.fastForward(5);
         }
         else{
             player.nextSong();
         }
     }

      public void clickPrevious(boolean doubleClick){ //Overload
         if (doubleClick) {
             player.rewind(5);
         }
         else{
             player.previousSong();
         }
     }
}
