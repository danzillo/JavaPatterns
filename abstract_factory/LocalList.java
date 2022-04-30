package abstract_factory;

public class LocalList implements List{
    @Override
   public void addList(){
        System.out.println("Создан общий список всех участников.");
    }
}
