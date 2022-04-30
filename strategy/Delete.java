package strategy;

public class Delete implements Strategy {
    @Override
    public void doAction() {
        System.out.println("Соренвоание удалено.");
    }
}
