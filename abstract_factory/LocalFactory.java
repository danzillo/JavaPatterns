package abstract_factory;

//реализаця фабрики
public class LocalFactory implements ChampFactory{
    @Override
    public Discription createDiscription() {
        //System.out.println("Создано короткое описание местных стартов.");
        return new LocalDiscription();
    }

    @Override
    public List createList() {
       // System.out.println("Добавлен общий список спротсменов.");
        return new LocalList();
    }

    @Override
    public Map createMap() {
      //  System.out.println("Добавлена общая карта.");
        return new LocalMap();
    }
}
