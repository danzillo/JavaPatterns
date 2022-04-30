package flyweight;


import java.util.HashMap;
import java.util.Map;

public class GroupFactory {

    Map<String, CompetitionGroup> map = new HashMap<>();
    CompetitionGroup getGroup(String groupName){
        CompetitionGroup competitionGroup = map.get(groupName);
        if(competitionGroup == null){
            competitionGroup = new CompetitionGroup();
            competitionGroup.groupName = groupName;
            map.put(groupName, competitionGroup);
        }
        return  competitionGroup;
    }
}
