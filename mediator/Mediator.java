package mediator;

import java.util.Date;

//пользователь будет интерфейсом-медиатором
//для взаимодействия с пользователями
public interface Mediator {
    public void userInfo(String name, User user);
}
