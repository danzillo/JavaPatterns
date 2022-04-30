package strategy;

/*главное отличие от паттерна состояние в том, что
* в паттерне стратегия смена активности в клиентском классе
* т.е поведение задает клиент
* паттерн состоятния самостоятельно упрвляет поведением */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        Organizer org = new Organizer();

        org.setStrategy( new Create());
        org.executeActivity();

        org.setStrategy(new Edit());
        org.executeActivity();

        org.setStrategy(new Delete());
        org.executeActivity();
    }
}
