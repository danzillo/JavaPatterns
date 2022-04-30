package flyweight;

public class FlyweightPatternDemo {
    public static void main(String[] args) {
        GroupFactory factory = new GroupFactory();
        CompetitionGroup group = factory.getGroup("МЭ");
        CompetitionGroup group1= factory.getGroup("ЖЭ");
        CompetitionGroup group2 = factory.getGroup("МЭ");
        System.out.println("Если мы добавлем группу, которая уже была создана, то\n" +
                "новая группа не будет создавться, всегда это будет один и тот же объект:\n\n"
        + group +" :это group,\nа это group2: "+group2);
        System.out.println("\nНовая группа: "+ group1);
       // System.out.println(group+" "+ group2);
    }
}
