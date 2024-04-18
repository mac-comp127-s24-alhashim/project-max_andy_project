import java.net.URL;
import java.net.URLConnection;
import java.io.IOException;
import java.io.InputStream;

public class Currencies {

    public double usd;
    public double eur;
    public double cny;
    public double krw;


    public double usdToEur(double usd) throws IOException {
        URL url = new URL("https://www.oanda.com/currency-converter/en/?from=USD&to=EUR&amount=1");
        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();
        return eur;
    }

    public double usdToCny(double usd) throws IOException {
        URL url = new URL("https://www.oanda.com/currency-converter/en/?from=USD&to=CNY&amount=1");
        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();
        return cny;
    }

    public double usdToKrw(double usd) throws IOException {
        URL url = new URL("https://www.oanda.com/currency-converter/en/?from=USD&to=KRW&amount=1");
        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();
        return krw;
    }

    public double eurToUsd(double eur) throws IOException {
        URL url = new URL("https://www.oanda.com/currency-converter/en/?from=EUR&to=USD&amount=1");
        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();
        return usd;
    }

    public double eurToCny(double eur) throws IOException {
        URL url = new URL("https://www.oanda.com/currency-converter/en/?from=EUR&to=CNY&amount=1");
        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();
        return cny;
    }

    public double eurToKrw(double eur) throws IOException {
        URL url = new URL("https://www.oanda.com/currency-converter/en/?from=EUR&to=KRW&amount=1");
        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();
        return krw;
    }

    public double cnyToUsd(double cny) throws IOException {
        URL url = new URL("https://www.oanda.com/currency-converter/en/?from=CNY&to=USD&amount=1");
        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();
        return usd;
    }

    public double cnyToEur(double cny) throws IOException {
        URL url = new URL("https://www.oanda.com/currency-converter/en/?from=CNY&to=EUR&amount=1");
        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();
        return eur;
    }

    public double cnyToKrw(double cny) throws IOException {
        URL url = new URL("https://www.oanda.com/currency-converter/en/?from=CNY&to=KRW&amount=1");
        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();
        return krw;    
    }

    public double krwToUsd(double krw) throws IOException {
        URL url = new URL("https://www.oanda.com/currency-converter/en/?from=KRW&to=USD&amount=1");
        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();
        return krw;
    }

    public double krwToEur(double krw) throws IOException {
        URL url = new URL("https://www.oanda.com/currency-converter/en/?from=KRW&to=EUR&amount=1");
        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();
        return eur;
    }

    public double krwToCny(double krw) throws IOException {
        URL url = new URL("https://www.oanda.com/currency-converter/en/?from=KRW&to=CNY&amount=1");
        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();
        return cny;
    }
}
