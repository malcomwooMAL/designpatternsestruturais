package state;

public class StateExample {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        // Exemplo de uso:
        player.clickPlay();       // Deve começar a tocar e mudar para PlayingState
        player.clickNext();       // Deve ir para a próxima música
        player.clickLock();       // Deve travar (LockedState)
        player.clickPlay();       // Não deve fazer nada (travado)
        player.clickLock();       // Deve destravar (volta para ReadyState ou Playing, dependendo do estado anterior)
        player.clickPrevious();  //Vai para a anterior
        //Testando o Playing State com double click
        player.clickPlay(); //Play
        //((PlayingState)player.ui.nextButton).onClick( ()-> player.clickNext(true)  ); //Avança 5 segundos
        //((PlayingState)player.ui.prevButton).onClick( ()-> player.clickPrevious(true)  ); //Retrocede 5 segundos


    }
}