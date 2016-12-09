package Module4.Homework;

import java.util.*;

/**
 * Created by Дима on 21.11.2016.
 */
public class EUBank extends Bank{


    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
   public int getLimitOfWithdrawal() {
        if(this.getCurrency()==Currency.EUR)
            return 2200;
        else
            return 2000;
    }

    @Override
   public int getLimitOfFunding() {
        if(this.getCurrency()==Currency.EUR)
            return 20000;
        else
            return 10000;
    }

    @Override
   public int getMonthlyRate() {

        if(this.getCurrency()==Currency.EUR)
            return 1;
        else
            return 0;
    }

    @Override
   public int getCommission(int summ) {

        if(this.getCurrency()==Currency.EUR){
            if(summ < 1000)
                return 2;
            else
                return 4;
        }
        else {
            if(summ < 1000){
                return 5;
            }
            else
                return 7;
        }
    }
}
