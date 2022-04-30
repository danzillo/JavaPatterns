package strategy;


public class Edit implements Strategy {
    @Override
    public void doAction() {
        System.out.println("Соревнование редактируется.");
    }
}
