package factory;

public abstract class Site {

    protected abstract Competition createComp(CompType type);

    public Competition newComp(CompType type) {
        Competition comp = createComp(type);

        comp.addDiscription();
        comp.addSportsmanList();
        comp.addMap();

        //System.out.println("Соренование создано");
        return comp;
    }
}