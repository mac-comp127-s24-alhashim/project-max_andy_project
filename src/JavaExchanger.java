import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JavaExchanger {
    private static double usd = 1.0000;
    // Europe Euro
    private static double eur;
    // Singapore Dollar
    private static double sgd;
    // Japanese Yen
    private static double jpy;
    // Chinese Yuan Renminbi
    private static double cny;
    // Indian Rupee
    private static double inr;
    // Mexican Peso
    private static double mxn;
    // Canadian Dollar
    private static double cad;
    // Russian Ruble
    private static double rub;
    // Australian Dollar
    private static double aud;

    public static void main(String[] args) {
        CurrencyExchanger.CurrencyExchange();
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

            System.out.println(exRates);
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
        }
        
        public static Double returnRate(String currencyCode) {
            switch (currencyCode) {
                case "usd":
                    return usd;
                case "eur":
                    return eur;
                case "sgd":
                    return sgd;
                case "jpy":
                    return jpy;
                case "cny":
                    return cny;
                case "inr":
                    return inr;
                case "mxn":
                    return mxn;
                case "cad":
                    return cad;
                case "rub":
                    return rub;
                case "aud":
                    return aud;
                default:
                    System.out.println("ERROROROROROROROR");
                    return null;
            }
        }
}