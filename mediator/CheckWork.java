package mediator;

//проверяем работу медиатора
public class CheckWork {
    public static void main(String[] args) {
        Mediator mediator = new UserMediator();
        User org = new Organizer(mediator, "Organizer");
        User sport = new Sportsman(mediator, "Sportsman");
        User sport2 = new Sportsman(mediator, "Man");
        mediator.addUser(org);
        mediator.addUser(sport);
        mediator.addUser(sport2);
        org.sendSt(org.status);
        sport.sendSt(sport.status);
        sport.sendSt(sport2.status);
    }
}
