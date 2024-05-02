public class Calculations {
    
    public static Double Calculations(double currAmount, double currFrom, double currTo) {
        double fromRate = JavaExchanger.returnRate(currFrom);
        double toRate = JavaExchanger.returnRate(currTo);
        double finRate = toRate / fromRate;
        double finalCurr = currAmount * finRate;
        return finalCurr;
    }
}
