public class Calculations {
    
    public static Double Calculate(String currAmount, String currFrom, String currTo) {
        double fromRate = JavaExchanger.returnRate(currFrom.toLowerCase());
        double toRate = JavaExchanger.returnRate(currTo.toLowerCase());
        double finRate = toRate / fromRate;
        double finalCurr = Double.parseDouble(currAmount) * finRate;
        return finalCurr;
    }
}
