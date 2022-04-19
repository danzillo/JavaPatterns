package mediator;

public class Sportsman extends User{
   // private String statusSport = "Sportsman";

    public Sportsman(Mediator mediator, String status) {
        super();
    }

    @Override
    public void sendSt(String status) {
        System.out.println("Статус этого пользователя: " +status);
    }

    @Override
    public void receive(String name) {

    }
}
