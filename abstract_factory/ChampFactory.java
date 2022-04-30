package abstract_factory;


//это и есть абстрактная фабрика
public interface ChampFactory {
    Discription createDiscription();

    List createList();

    Map createMap();
}
