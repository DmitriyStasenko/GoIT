package Module4.Homework;

import java.util.*;

/**
 * Created by Дима on 21.11.2016.
 */
public class ChinaBank extends Bank{


    public ChinaBank(long id, String bankCountry, java.util.Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }




    @Override
    public int getLimitOfWithdrawal() {
       if(this.getCurrency()==Currency.USD)
           return 100;
        else
            return 150;
    }

    @Override
   public int getLimitOfFunding() {
        if(this.getCurrency()==Currency.USD)
            return 10000;
        else
            return 5000;
    }

    @Override
   public int getMonthlyRate() {
        if(this.getCurrency()==Currency.USD)
            return 1;
        else
            return 0;
    }

    @Override
   public int getCommission(int summ) {

        if(this.getCurrency()==Currency.USD){
            if (summ < 1000)
                return 3;
            else
                return 5;
        }
        else {
            if (summ < 1000)
                return 10;
            else
                return 11;
        }
    }
}
