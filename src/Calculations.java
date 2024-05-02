public class Calculations {
    
    public static Double Calculate(double currAmount, String currFrom, String currTo) {
        double fromRate = JavaExchanger.returnRate(currFrom.toUpperCase());
        double toRate = JavaExchanger.returnRate(currTo.toUpperCase());
        double finRate = toRate / fromRate;
        double finalCurr = currAmount * finRate;
        return finalCurr;
    }
}
