package Module3.practice;

/**
 * Created by Дима on 19.11.2016.
 */
public class ConverterOfCurrency {

    private double currencyRate;

    public ConverterOfCurrency(double currencyRate) {
        this.currencyRate = currencyRate;
    }

    public double convert(int uahAmount) {
        return uahAmount / currencyRate;
    }
}
