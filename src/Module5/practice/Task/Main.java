package Module5.practice.Task;

/**
 * Created by Дима on 28.11.2016.
 */
public class Main {


    public static void main(String[] args) {

businessUserCreation();
adminUserCreation();


   }

    public static void adminUserCreation(){
        User petya = new User(1,"Petya");
        petya.setConnection(Connection.getInstance());
    }



   private static void businessUserCreation(){
       User vasya = new User(1,"Vasya");
       vasya.setConnection(Connection.getInstance());



   }



}
