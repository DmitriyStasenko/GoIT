package Module3.practice;

/**
 * Created by Дима on 19.11.2016.
 */
public class Bank {


    private long balance;
    private String[] employees;
    private String adress;

    public Bank(long balance){
        this.balance = balance;
    }


    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setEmployees(String[] employees) {
        this.employees = employees;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Long getBalance() {
        return balance;
    }
}
