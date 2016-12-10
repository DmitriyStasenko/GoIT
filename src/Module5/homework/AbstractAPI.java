package Module5.homework;

/**
 * Created by Дима on 10.12.2016.
 */
public abstract class AbstractAPI implements API {

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        for (Room a : getRooms()) {
            if (a.getPrice() == price && a.getPersons() == persons && a.getCityName() == city && a.getHotelName()==hotel){
                count++;
            }
        }

        Room[] nap = new Room[count];

        int index = 0;
        for (Room a : getRooms()) {
            if (a.getPrice() == price && a.getPersons() == persons && a.getCityName() == city && a.getHotelName()==hotel){
                nap[index] = a;
            }
        }
        return nap;
    }



}