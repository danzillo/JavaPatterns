package flyweight;

import java.util.HashMap;
import java.util.Map;

public class CompetitionGroup implements Group{
    public String getGroupName() {
        return groupName;
    }

    protected String groupName;

//    public void setGroupName(String groupName) {
//        this.groupName = groupName;
//    }

//    Map<String, Group> map =new HashMap<>();

    @Override
    public void listGroup() {
        System.out.println("А вот и спиок всех групп..");
    }
}
