package state;

public class Organizer {
    private State state;

    //изначальное состояние на задано
    public Organizer() {
        state = null;
    }

    //меняем состояние в зависимости от того представителем какого класса явлетяся состояние
    public void changeState() {
        if (state instanceof CreateChamp) {
            setState(new EditChamp());
        } else if (state instanceof EditChamp) {
            setState(new LoadChamp());
        }
    }

    //метод для уставноки состояния
    public void setState(State state) {
        this.state = state;
    }

    //метод для совершения действия
    public void makeAction(){
        state.makeAction();
    }
//    public State getState() {
//        return state;
//    }
}
