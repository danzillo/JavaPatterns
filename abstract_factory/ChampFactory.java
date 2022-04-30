package abstract_factory;


//это и естьа бстрактная фабрика
public interface ChampFactory {
    Discription createDiscription();

    List createList();

    Map createMap();
}
