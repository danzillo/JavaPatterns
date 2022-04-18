package singleton;


public class DbConnection {
    private static DbConnection dbConnection;
    private static String connection = "127.0.0.0";


    private DbConnection() {
    }

    public static DbConnection getConnection() {
        if (dbConnection == null) {
            dbConnection = new DbConnection();
        }
        return dbConnection;
    }
    public void showConnectionInfo(){
        System.out.println(connection);
    }

    public void addConectionInfo(String newInfo){
        connection+=newInfo+"\n";
    }
}