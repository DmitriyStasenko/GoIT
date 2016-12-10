package Module5.homework;

import java.util.Date;

/**
 * Created by Дима on 10.12.2016.
 */
public class DAOheir implements DAO {


    @Override
    public Room save(Room room) {
        System.out.println("Room "+room.getId());
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Room" + room);
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Room" + room);
        return room;
    }

    @Override
    public Room findById(long id) {
        Room room = new Room(5,1000,2, new Date(),"Hotel20","Lugansk");
        System.out.println("Number of your room" + id);
        return room;
    }
}
