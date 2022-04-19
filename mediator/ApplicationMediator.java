//package mediator;
//
//import java.util.ArrayList;
//
//public class ApplicationMediator implements Mediator {
//    private ArrayList<User> colleagues;
//    public ApplicationMediator() {
//        colleagues = new ArrayList<User>();
//    }
//    public void addColleague(User user) {
//        colleagues.add(user);
//    }
//    public void userInfo(String name, User originator) {
//        //let all other screens know that this screen has changed
//        for(User user: colleagues) {
//            //don't tell ourselves
//            if(user != originator) {
//                user.receive(name);
//            }
//        }
//    }
//}