package singleton;


class Main {

    public static void main(String[] args) {
        DbConnection.getConnection().showConnectionInfo();

        //поепзывает еденичность экземляра
        System.out.println(DbConnection.getConnection().toString());
        System.out.println(DbConnection.getConnection().toString());
    }
}