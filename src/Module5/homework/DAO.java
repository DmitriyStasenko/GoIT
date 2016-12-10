package Module5.homework;

/**
 * Created by Дима on 09.12.2016.
 */
public interface DAO {

    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);



}
