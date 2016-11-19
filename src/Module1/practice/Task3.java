package Module1.practice;

/**
 * Created by Дима on 19.11.2016.
 */
public class Task3 {


    public static void main(String[] args) {

        // module1.webinar.Coll data
        int balance = 1000000;
        int toWithdraw = 500;

        // logic to test
        balance = withdraw(balance, toWithdraw);

        // result
        System.out.println("Balance :" + balance);




        // module1.webinar.Coll data
        int balance2 = 1000000;
        int toWithdraw2 = 1000010;

        // logic to test
        balance2 = withdraw(balance2, toWithdraw2);

        // result
        System.out.println("Balance2 :" + balance2);
    }

    private static int withdraw(int balance, int toWithdraw) {
        if (canWithdraw(balance, toWithdraw)) {
            return balance - toWithdraw;
        }

        return balance;

    }

    private static boolean canWithdraw(int balance, int toWithdraw) {

        boolean canWithdraw = toWithdraw <= balance;

        if (canWithdraw) {
            System.out.println("OK");
        } else {
            System.out.println("Fail to withdraw");
        }

        return canWithdraw;
    }

}
