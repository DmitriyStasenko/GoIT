package Module5.practice.Task;

/**
 * Created by Дима on 28.11.2016.
 */
public class Connection {

    String url ="https://SomeSite";
    private static Connection instance = new Connection();


    public static Connection getInstance() {
        return instance;
    }



}
