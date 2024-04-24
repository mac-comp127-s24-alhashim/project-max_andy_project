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

    }
}