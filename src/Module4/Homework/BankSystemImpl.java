package Module4.Homework;

/**
 * Created by Дима on 26.11.2016.
 */
public class BankSystemImpl implements BankSystem {


    @Override
    public void withdrawOfUser(User user, int amount){
        double balance = user.getBalance();
        double commision = user.getBank().getCommission(amount)*0.01;
        double limit = user.getBank().getLimitOfWithdrawal();
        double total = amount + commision;



        if(balance<total){
            System.err.println("Not enough money");
        }
        else {
           if(total>limit){
               System.err.println("Limit exceeded");
           }
           else {
               user.setBalance(balance-total);
           }
        }
    }

    @Override
    public void fundUser(User user, int amount){

        double balance = user.getBalance();
        double limit = user.getBank().getLimitOfFunding();
        if(amount > limit){
            System.err.println("Limit exceeded refill");
        }
        else {
            user.setBalance(balance+amount);
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount){

        double balance = fromUser.getBalance();
        double balance1 = toUser.getBalance();
        if(amount > balance){
            System.err.println("Not enough money on the balance sheet");
        }
        else {
            fromUser.setBalance(balance-amount);
            toUser.setBalance(balance1+amount);
        }
    }

    @Override
    public void paySalary(User user){
        double balance = user.getBalance();
        double salary = user.getSalary();
        double commission = salary*user.getBank().getMonthlyRate()* 0.01;
        user.setBalance(balance+salary-commission);
    }
}
