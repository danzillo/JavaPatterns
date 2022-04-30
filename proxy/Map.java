package proxy;

//реализация интерфейсаа
public class Map implements MapImage{
    //имя изображение карты, которое будет отображатся на сайте
    private String fileName;

    //конструктор класса Map
    public Map(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
    @Override
    public void display() {
        System.out.println("Displaying "+ fileName);
    }

    //возможность загрузить файл
    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
