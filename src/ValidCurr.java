import java.util.ArrayList;

public class ValidCurr {
    public static double usdToUsd = 1.0000;
            // Europe Euro
    public static double usdToEur;
            // Singapore Dollar
    public static double usdToSgd;
            // Japanese Yen
    public static double usdToJpy;
            // Chinese Yuan Renminbi
    public static double usdToCny;
            // Indian Rupee
    public static double usdToInr;
            // Mexican Peso
    public static double usdToMxn;
            // Canadian Dollar
    public static double usdToCad;
            // Russian Ruble
    public static double usdToRub;
            // Australian Dollar
    public static double usdToAud;
    
    public int index;

    ArrayList<String> currArray = new ArrayList<String>();
    currArray.add("USD");
    currArray.add("EUR");


    ArrayList<String> currRateArray = new ArrayList<String>();
    currRateArray.add("");


    public ValidCurr(String text) {
        for(int i = 0; i < currArray.size(); i++) {
            if(text.toUpperCase() == currArray.get(i)) {
                index = i;
            }
        }

    }
}
