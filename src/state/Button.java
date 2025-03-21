package state;

class Button{
    public void onClick(Runnable action){ //Aceita um Runnable como ação

      action.run(); //Executa a ação (que é passada como method reference).
    }
}
