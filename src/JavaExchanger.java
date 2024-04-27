import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JavaExchanger {
    public static void main(String[] args) {
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
            double usd = 1.0000;
            // Europe Euro
            double eur = Double.parseDouble(exRates.get(13));
            // Singapore Dollar
            double sgd = Double.parseDouble(exRates.get(40));
            // Japanese Yen
            double jpy = Double.parseDouble(exRates.get(21));
            // Chinese Yuan Renminbi
            double cny = Double.parseDouble(exRates.get(9));
            // Indian Rupee
            double inr = Double.parseDouble(exRates.get(17));
            // Mexican Peso
            double mxn = Double.parseDouble(exRates.get(28));
            // Canadian Dollar
            double cad = Double.parseDouble(exRates.get(7));
            // Russian Ruble
            double rub = Double.parseDouble(exRates.get(38));
            // Australian Dollar
            double aud = Double.parseDouble(exRates.get(1));



        }

        catch (IOException e) {
            e.printStackTrace();
        }
        

    }
}