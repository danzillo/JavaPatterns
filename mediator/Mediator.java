package mediator;

import java.util.Date;

//пользователь будет интерфейсом-медиатором
//для взаимодействия с пользователями
public interface Mediator {
   // public void userInfo(String name, User user);
    void addUser(User user);
   // void userStatus(User user, String status);
    void userStatus(User user, String status);
}
