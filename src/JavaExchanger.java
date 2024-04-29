import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JavaExchanger {

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

    public JavaExchanger() {
        String url = "https://www.x-rates.com/table/?from=USD&amount=1";
        ArrayList<String> exRates = new ArrayList<String>();

        try {
            Document document = Jsoup.connect(url).get();
            Elements ratesTable = document.select(".tablesorter.ratesTable tbody tr");
            for (Element row : ratesTable) {
                Elements cells = row.select("td.rtRates");
                String exchangeRate = cells.get(0).text(); // Assuming exchange rate is in the second <td> element
                exRates.add(exchangeRate);
            }
            
            // System.out.println(exRates);

            // United States Dollar
            usdToUsd = 1.0000;
            // Europe Euro
            usdToEur = Double.parseDouble(exRates.get(13));
            // Singapore Dollar
            usdToSgd = Double.parseDouble(exRates.get(40));
            // Japanese Yen
            usdToJpy = Double.parseDouble(exRates.get(21));
            // Chinese Yuan Renminbi
            usdToCny = Double.parseDouble(exRates.get(9));
            // Indian Rupee
            usdToInr = Double.parseDouble(exRates.get(17));
            // Mexican Peso
            usdToMxn = Double.parseDouble(exRates.get(28));
            // Canadian Dollar
            usdToCad = Double.parseDouble(exRates.get(7));
            // Russian Ruble
            usdToRub = Double.parseDouble(exRates.get(38));
            // Australian Dollar
            usdToAud = Double.parseDouble(exRates.get(1));



        }

        catch (IOException e) {
            e.printStackTrace();
        }

        public static returnRate (double exchangeRate) {
            return this.exchangeRate;
        }
        

    }
}