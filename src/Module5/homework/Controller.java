package Module5.homework;

/**
 * Created by Дима on 09.12.2016.
 */
public class Controller {

    API apis[] = {new  BookingComAPI(), new TripAdvisorAPI(), new GoogleAPI()};



    Room[] requstRooms(int price, int persons, String city, String hotel){

        int count = 0;
        for (API v : apis) {
            count+=v.findRooms(price,persons,city,hotel).length;
    }

        Room[] nap = new Room[count];
        int i = 0;
        for (API a : apis) {
            for(Room r : a.findRooms(price,persons,city,hotel))
                nap[i] = r;
            i++;
        }
        return nap;
    }

    Room[] check(API api1, API api2){
        int count = 0;
        for (int i = 0; i < api1.getRooms().length ; i++) {
            for (int j = 0; j < api1.getRooms().length; j++) {
                if(api1.getRooms()[i].equals(api2.getRooms()[j])){
                    count++;
                }
            }
        }
        Room[] nap = new Room[count];
        for (int i = 0; i < api1.getRooms().length; i++) {
            if (api1.getRooms()[i].equals(api2.getRooms()[i])){
                nap[i] = api1.getRooms()[i];
            }
        }
        return nap;
    }


}
