package Module5.homework;

import java.util.Date;

/**
 * Created by Дима on 09.12.2016.
 */
public class GoogleAPI extends AbstractAPI {

    Room[] google;


   GoogleAPI(){
       google = new Room[5];
       google[0] = new Room(11,600,3, new Date(),"Hotel1","Kiev");
       google[1] = new Room(10,600,4, new Date(),"Hotel1","Kiev");
       google[2] = new Room(12,600,3, new Date(),"Hotel1","Kiev");
       google[3] = new Room(13,600,1, new Date(),"Hotel1","Kiev");
       google[4] = new Room(14,600,2, new Date(),"Hotel1","Kiev");

   }


    @Override
    public Room[] getRooms() {
        return google;
    }
}
