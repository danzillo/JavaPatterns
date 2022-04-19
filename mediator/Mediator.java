package mediator;

import java.util.Date;

//интерфейс медиатора
public interface Mediator {
   // public void userInfo(String name, User user);
    void addUser(User user);
   // void userStatus(User user, String status);
    public void sendUserStatus(User user, String status);
}
