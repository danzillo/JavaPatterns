package proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        MapImage map = new ProxyMap("test_map.bmp");

        //загружает изображение с диска и демонстрирует его
        map.display();
        System.out.println("");

        //только демонстрирует изображение сколкьо бы раз не вызывали данный метод
        map.display();
    }
}
