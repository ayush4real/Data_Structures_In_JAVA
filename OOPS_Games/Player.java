package OOPS_Games;

public class Player {
    private String name;
    private char symbol;

    public Player(String name, char symbol){
        setName(name);
        setSymbol(symbol);
    }

    private void setName(String name) {
        if(!name.trim().isEmpty()) {
            this.name = name;
        }
    }

    public char getSymbol() {
        return this.symbol;
    }

    public void setSymbol(char symbol) {
        if(symbol!='\0'){
            this.symbol = symbol;
        }
    }

}
