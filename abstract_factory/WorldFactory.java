package abstract_factory;

public class WorldFactory implements ChampFactory {
    @Override
    public Discription createDiscription() {
        // System.out.println("Добавлено описание межднародных стартов.");
        return new WCDiscription();
    }

    @Override
    public List createList() {
        // System.out.println("Добавлены списки спортсменов по группам.");
        return new WCList();
    }

    @Override
    public Map createMap() {
        //System.out.println("Добавлены карты по возрастным категорям.");
        return new WCMap();
    }
}
