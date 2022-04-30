package abstract_factory;

//проверка работы фабрики
public class Check {
    public static void main(String[] args) {
        ChampFactory factory1 = new LocalFactory();
        Discription discription1 = factory1.createDiscription();
        List list1 = factory1.createList();
        Map map1 = factory1.createMap();

        System.out.println("Создаем треировочный старт");
        discription1.addDicription();
        list1.addList();
        map1.addMap();

        ChampFactory factory2 = new WorldFactory();
        Discription discription2 = factory2.createDiscription();
        List list2 = factory2.createList();
        Map map2 = factory2.createMap();

        System.out.println("\nСоздаем старт ЧМ");
        discription2.addDicription();
        list2.addList();
        map2.addMap();
        //ChampFactory factory2 = new WorldFactory();


    }
}