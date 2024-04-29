public class CurrencyTxt {
    
    public Double CurrExRate(double currFrom, double currTo) {
        double fromRate = JavaExchanger.returnRate(currFrom);
        double toRate = JavaExchanger.returnRate(currTo);
        double finRate = toRate / fromRate;
        return finRate;
    }

}
