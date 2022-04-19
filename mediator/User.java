package mediator;

//для взаимодействия с медиатором
public abstract class User {
    //каждый объект user знает о своем объекте mediator
    private Mediator mediator;
    private String status;

    //взаимодествие только через посредника
    public void User(Mediator mediator, String status) {
        this.mediator = mediator;
        this.status = status;
    }

    //устанваливает имя пользователя через медиатор
    public void setName(String name) {
        mediator.userStatus(this, status);
    }

    //получаем доступ к медиатору
    public Mediator getMediator() {
        return mediator;
    }

    //посылают статус посреднику и получают от него ответ
    public abstract void sendSt(String status);
    public abstract void receive(String status);
}
