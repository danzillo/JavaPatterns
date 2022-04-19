package mediator;

import java.util.ArrayList;
import java.util.List;

//реализует конкретное взаимодействие юзеров через
public class UserMediator implements Mediator {
    //добовляем всех пользователей в списк
//    private Organizer org1;
//    private Sportsman sport1;
    private List<User> sportsman;
    private List<User> organizer;
    private String statusOrg = "Organizer";
    private String statusSport = "Sportsman";

//    public void setSport(Sportsman sport) {
//        this.sport1 = sport;
//    }
//
//    public void setOrg(Organizer org) {
//        this.org1 = org;
//    }

    public UserMediator() {
        this.sportsman = new ArrayList<>();
        this.organizer = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
    this.sportsman.add(user);
    this.organizer.add(user);
    }

    @Override
    public void userStatus(User user, String status) {
        if(status==statusOrg){
            this.sportsman.add(user);
            System.out.println("Пользователь добавлен в список организаторов");
        }
        else if (status==statusSport){
            this.organizer.add(user);
            System.out.println("Пользователь добавлен в список спортсменов"+organizer);
        }
        else System.out.println("неизвестный пользователь");
    }
}