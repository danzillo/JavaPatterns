package state;

public class StatePatternDemo {
    public static void main(String[] args) {
        //создаем состояние и пользователя
        State state = new CreateChamp();
        Organizer org = new Organizer();

        //устанавливаем состояние CreateChamp
        org.setState(state);

        //последующие состояния полсе CreateChamp
        org.makeAction();
        org.changeState();
        org.makeAction();
        org.changeState();
        org.makeAction();
    }
}
