package Module5.homework;

import java.util.Date;

/**
 * Created by Дима on 09.12.2016.
 */
public class BookingComAPI extends AbstractAPI {

    Room[] booking;

    public BookingComAPI() {
        booking = new Room[5];
        booking[0] = new Room(10,600,3, new Date(),"Hotel1","Kiev");
        booking[1] = new Room(11,600,4, new Date(),"Hotel2","Kiev");
        booking[2] = new Room(12,600,3, new Date(),"Hotel3","Kiev");
        booking[3] = new Room(13,600,2, new Date(),"Hotel4","Kiev");
        booking[4] = new Room(14,600,1, new Date(),"Hotel5","Kiev");
    }

    @Override
    public Room[] getRooms() {
        return booking;
    }




    }

