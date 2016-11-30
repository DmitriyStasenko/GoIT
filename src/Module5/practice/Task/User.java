package Module5.practice.Task;

/**
 * Created by Дима on 28.11.2016.
 */
public class User {
    private int id;
    private String name;
    private Connection connection;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setConnection(Connection connection) {
        System.out.println(connection);
        this.connection = connection;
    }
}
