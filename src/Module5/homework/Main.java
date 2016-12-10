package Module5.homework;

import java.util.Date;

/**
 * Created by Дима on 09.12.2016.
 */
public class Main {


    public static void main(String[] args) {

   Controller controller = new Controller();

        controller.requstRooms(1000,2,"Kiev","Hotel1");
        controller.requstRooms(600,1,"Kharkiv","Hotel2");
        for(Room a : controller.requstRooms(1000,2,"Kiev","Hotel1")){
            System.out.println(a.getId());
        }

        API ap = new BookingComAPI();
        API ap2 = new GoogleAPI();
        controller.check(ap,ap2);


        Room b = new Room(5,1000,2, new Date(),"Hotel20","Lugansk");
        DAO dao = new DAOheir();
        dao.save(b);
        dao.delete(b);




    }


}
