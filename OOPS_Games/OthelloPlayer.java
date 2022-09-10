package OOPS_Games;

public class OthelloPlayer {
    private String name;
    private char symbol;

    public OthelloPlayer(String name, char symbol){
        setName(name);
        setSymbol(symbol);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
