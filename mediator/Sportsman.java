package mediator;

public class Sportsman extends User{
public Sportsman(Mediator mediator, String status) {
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
