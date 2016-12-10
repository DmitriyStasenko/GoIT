package Module5.homework;

import java.util.Date;

/**
 * Created by Дима on 09.12.2016.
 */
public class TripAdvisorAPI extends AbstractAPI {
    Room[] tripadvisor;


    TripAdvisorAPI(){

        tripadvisor = new Room[5];
        tripadvisor[0] = new Room(10,600,2, new Date(),"Hotel1","Kiev");
        tripadvisor[1] = new Room(11,600,3, new Date(),"Hotel2","Kiev");
        tripadvisor[2] = new Room(12,600,3, new Date(),"Hotel3","Kiev");
        tripadvisor[3] = new Room(13,600,4, new Date(),"Hotel4","Kiev");
        tripadvisor[4] = new Room(14,600,1, new Date(),"Hotel5","Kiev");



    }

    @Override
    public Room[] getRooms() {
        return tripadvisor;
    }
}
