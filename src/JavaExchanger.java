import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JavaExchanger {

    public static double usd = 1.0000;
            // Europe Euro
    public static double eur;
            // Singapore Dollar
    public static double sgd;
            // Japanese Yen
    public static double jpy;
            // Chinese Yuan Renminbi
    public static double cny;
            // Indian Rupee
    public static double inr;
            // Mexican Peso
    public static double mxn;
            // Canadian Dollar
    public static double cad;
            // Russian Ruble
    public static double rub;
            // Australian Dollar
    public static double aud;

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
            usd = 1.0000;
            // Europe Euro
            eur = Double.parseDouble(exRates.get(13));
            // Singapore Dollar
            sgd = Double.parseDouble(exRates.get(40));
            // Japanese Yen
            jpy = Double.parseDouble(exRates.get(21));
            // Chinese Yuan Renminbi
            cny = Double.parseDouble(exRates.get(9));
            // Indian Rupee
            inr = Double.parseDouble(exRates.get(17));
            // Mexican Peso
            mxn = Double.parseDouble(exRates.get(28));
            // Canadian Dollar
            cad = Double.parseDouble(exRates.get(7));
            // Russian Ruble
            rub = Double.parseDouble(exRates.get(38));
            // Australian Dollar
            aud = Double.parseDouble(exRates.get(1));



        }

        catch (IOException e) {
            e.printStackTrace();
        }

        public static double returnRate(double exchangeRate) {
            return this.exchangeRate;
        }
        

    }
}