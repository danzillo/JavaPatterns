package proxy;

public class ProxyMap implements MapImage {
    private Map realMap;
    private String fileName;

    public ProxyMap(String fileName){
        this.fileName = fileName;
    }

/*    Если карта не загружена, то загружаем ее
            по имени файла, и только потом демонстрируем ее*/
    @Override
    public void display() {
        if(realMap == null){
            realMap = new Map(fileName);
        }
        realMap.display();
    }
}
