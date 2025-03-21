package strategy;

class Context {
    private Strategy strategy; // Referência para a estratégia atual

    //O contexto aceita a estratégia via construtor, mas também provê um setter.
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    //Permite mudar a estratégia em tempo de execução
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // O contexto delega a execução para a estratégia
    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}