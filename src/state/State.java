package state;

abstract class State {
    protected AudioPlayer player; // Referência ao contexto (AudioPlayer)

    // O contexto passa a si mesmo para o construtor do estado
    State(AudioPlayer player) {
        this.player = player;
    }

    // Métodos abstratos que os estados concretos DEVEM implementar
    public abstract void clickLock();

    public abstract void clickPlay();

    public abstract void clickNext();
    public abstract void clickPrevious();
}
