import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JavaExchanger {
    public static void main(String[] args) {
        String url = "https://www.x-rates.com/table/?from=USD&amount=1";


        try {
            Document document = Jsoup.connect(url).get();
            Element ratesTable = document.select(".ratesTable");

            for(Element rates : ratesTable) {
                String rate = rates.select("tr")[0].text();
                System.out.println(rate);
            }

        }catch(IOException e){
            e.printStackTrace();
        }




        // try {
        //     Document doc = Jsoup.connect("https://www.oanda.com/currency-converter/en/?from=USD&to=KRW&amount=1").get();

        //     Elements divElements = doc.select("div.MuiInputBase-root.MuiFilledInput-root.MuiFilledInput-underline.MuiInputBase-fullWidth.MuiInputBase-formControl");

        //     if (divElements.size() > 1) {
        //         Element usdToKrwBox = divElements.get(1);
        //         String usdToKrw = usdToKrwBox.text();

        //         usdToKrw = usdToKrw.substring(272, usdToKrw.length() - 8);

        //         System.out.println(usdToKrw);
        //     } else {
        //         System.out.println("Element not found");
        //     }

        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
    }
}