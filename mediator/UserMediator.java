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
    private List<User> allUser;
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
        this.allUser = new ArrayList<>();
        this.sportsman = new ArrayList<>();
        this.organizer = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.allUser.add(user);
    }

    @Override
    public void sendUserStatus(User user, String status) {
        if (status == statusOrg) {
            this.organizer.add(user);
            System.out.println("Добавлен в список организаторов" + organizer);
        } else if (status == statusSport) {
            this.sportsman.add(user);
            System.out.println("Добавлен в список спортсменов" + sportsman);
        } else {
            this.allUser.add(user);
            System.out.println("неизвестный пользователь" + allUser);
        }
    }
}

