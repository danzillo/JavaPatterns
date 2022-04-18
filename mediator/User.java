package mediator;

//для взаимодействия с медиатором
public abstract class User {
    private Mediator mediator;

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    //устанваливает имя пользователя через медиатор
    public void setName(String name) {
        mediator.userInfo(name, this);
    }

    //получаем доступ к медиатору
    public Mediator getMediator() {
        return mediator;
    }
    public abstract void receive(String name);
}
