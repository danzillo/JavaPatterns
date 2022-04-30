package strategy;

public class Organizer {
    Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    //выполнение действия
    public void executeActivity(){
        strategy.doAction();
    }
}
