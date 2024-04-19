import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;


public class Currencies {

    public double usd;
    public double eur;
    public double cny;
    public double krw;
    public String userUrl;


    public void userCurrInput() {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter currency you're exchanging from (valid 3 char format)");
        String firstCurr = input1.next().toUpperCase();
        input1.close();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter currency you're exchanging to (valid 3 char format)");
        String secCurr = input2.next().toUpperCase();
        
        input2.close();

        String userUrl = "https://www.oanda.com/currency-converter/en/?from=" + firstCurr + "&to=" + secCurr + "&amount=1";

        this.userUrl = userUrl;
    }

    public double usdToEur(double usd) throws IOException {
        URL url = new URL(userUrl);
        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();
        return eur;
    }

    // public double usdToCny(double usd) throws IOException {
    //     URL url = new URL("https://www.oanda.com/currency-converter/en/?from=USD&to=CNY&amount=1");
    //     URLConnection con = url.openConnection();
    //     InputStream is = con.getInputStream();
    //     return cny;
    // }

    // public double usdToKrw(double usd) throws IOException {
    //     URL url = new URL("https://www.oanda.com/currency-converter/en/?from=USD&to=KRW&amount=1");
    //     URLConnection con = url.openConnection();
    //     InputStream is = con.getInputStream();
    //     return krw;
    // }

    // public double eurToUsd(double eur) throws IOException {
    //     URL url = new URL("https://www.oanda.com/currency-converter/en/?from=EUR&to=USD&amount=1");
    //     URLConnection con = url.openConnection();
    //     InputStream is = con.getInputStream();
    //     return usd;
    // }

    // public double eurToCny(double eur) throws IOException {
    //     URL url = new URL("https://www.oanda.com/currency-converter/en/?from=EUR&to=CNY&amount=1");
    //     URLConnection con = url.openConnection();
    //     InputStream is = con.getInputStream();
    //     return cny;
    // }

    // public double eurToKrw(double eur) throws IOException {
    //     URL url = new URL("https://www.oanda.com/currency-converter/en/?from=EUR&to=KRW&amount=1");
    //     URLConnection con = url.openConnection();
    //     InputStream is = con.getInputStream();
    //     return krw;
    // }

    // public double cnyToUsd(double cny) throws IOException {
    //     URL url = new URL("https://www.oanda.com/currency-converter/en/?from=CNY&to=USD&amount=1");
    //     URLConnection con = url.openConnection();
    //     InputStream is = con.getInputStream();
    //     return usd;
    // }

    // public double cnyToEur(double cny) throws IOException {
    //     URL url = new URL("https://www.oanda.com/currency-converter/en/?from=CNY&to=EUR&amount=1");
    //     URLConnection con = url.openConnection();
    //     InputStream is = con.getInputStream();
    //     return eur;
    // }

    // public double cnyToKrw(double cny) throws IOException {
    //     URL url = new URL("https://www.oanda.com/currency-converter/en/?from=CNY&to=KRW&amount=1");
    //     URLConnection con = url.openConnection();
    //     InputStream is = con.getInputStream();
    //     return krw;    
    // }

    // public double krwToUsd(double krw) throws IOException {
    //     URL url = new URL("https://www.oanda.com/currency-converter/en/?from=KRW&to=USD&amount=1");
    //     URLConnection con = url.openConnection();
    //     InputStream is = con.getInputStream();
    //     return krw;
    // }

    // public double krwToEur(double krw) throws IOException {
    //     URL url = new URL("https://www.oanda.com/currency-converter/en/?from=KRW&to=EUR&amount=1");
    //     URLConnection con = url.openConnection();
    //     InputStream is = con.getInputStream();
    //     return eur;
    // }

    // public double krwToCny(double krw) throws IOException {
    //     URL url = new URL("https://www.oanda.com/currency-converter/en/?from=KRW&to=CNY&amount=1");
    //     URLConnection con = url.openConnection();
    //     InputStream is = con.getInputStream();
    //     return cny;
    // }
}
