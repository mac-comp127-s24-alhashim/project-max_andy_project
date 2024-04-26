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
            for(Element row : ratesTable) {
                Elements cells = row.select("td");
                StringBuilder rate = new StringBuilder();
                for(Element cell : cells) {
                    rate.append(cell.text()).append(" ");
                }
                exRates.add(rate.toString().trim());
            }System.out.println(exRates);

        } catch(IOException e) {
            e.printStackTrace();
        }

        for(String rate : exRates){
            String[] exRatesSplit = rate.split(" ");
            System.out.println(exRatesSplit[1]);
        }

        // String ARS = exRates.get(0);
        // String AUD = exRates.get(1);
        // String BHD = exRates.get(2);
        // String BWP = exRates.get(3);
        // String BRL = exRates.get(4);
        // String BND = exRates.get(5);
        // String BGN = exRates.get(6);
        // String CAD = exRates.get(7);
        // String CLP = exRates.get(8);
        // String CNY = exRates.get(9);
        // String COP = exRates.get(10);
        // String CZK = exRates.get(11);
        // String DKK = exRates.get(12);
        // String EUR = exRates.get(13);
        // String HKD = exRates.get(14);
        // String HUF = exRates.get(15);
        // String ISK = exRates.get(16);
        // String INR = exRates.get(17);
        // String IDR = exRates.get(18);
        // String IRR = exRates.get(19);
        // String ILS = exRates.get(20);
        // String JPY = exRates.get(21);
        // String KZT = exRates.get(22);
        // String KRW = exRates.get(23);
        // String KWD = exRates.get(24);
        // String LYD = exRates.get(25);
        // String MYR = exRates.get(26);
        // String MUR = exRates.get(27);
        // String MXN = exRates.get(28);
        // String NPR = exRates.get(29);
        // String NZD = exRates.get(30);
        // String NOK = exRates.get(31);
        // String OMR = exRates.get(32);
        // String PKR = exRates.get(33);
        // String PHP = exRates.get(34);
        // String PLN = exRates.get(35);
        // String QAR = exRates.get(36);
        // String RON = exRates.get(37);
        // String RUB = exRates.get(38);
        // String SAR = exRates.get(39);
        // String SGD = exRates.get(40);
        // String ZAR = exRates.get(41);
        // String LKR = exRates.get(42);
        // String SEK = exRates.get(43);
        // String AED = exRates.get(44);
        // String GBP = exRates.get(45);
        // String VEF = exRates.get(46);

    }
}