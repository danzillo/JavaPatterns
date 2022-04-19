package mediator;

public class Organizer extends User{

    public Organizer(Mediator mediator, String status) {
        super(mediator, status);
    }

    @Override
    public void sendSt(String status) {
    mediator.sendUserStatus(this, status);
    }

    @Override
    public void receiveSt(String status) {
       // System.out.println(this.status+"добавлен в");
    }

}
