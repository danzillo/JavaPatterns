package mediator;

//проверяем работу медиатора
public class CheckWork {
    public static void main(String[] args) {
        String statusSport = "Sportsman";
        Mediator mediator = new UserMediator();
        User org = new Organizer(mediator);
        User sport = new Sportsman(mediator, "Sportsman");
        mediator.addUser(sport);
        mediator.addUser(org);
        mediator.userStatus(org,"Sportsman");
        //sport.sendSt("Sportsman");
    }
}
