import java.awt.Color;

import edu.macalester.graphics.*;
import edu.macalester.graphics.ui.Button;
import edu.macalester.graphics.ui.TextField;

public class CurrencyExchanger {
    private static int CANVAS_WIDTH = 1000;
    private static int CANVAS_HEIGHT = 800;
    private static int width = 200;
    // private static int height = 400;
    private static CanvasWindow canvas1;
    private static CanvasWindow canvas2;
    static GraphicsText textAmount;
    static GraphicsText textFrom;
    static GraphicsText textTo;
    static GraphicsText textResult;
    static GraphicsText textTitle;
    static GraphicsText currencies;
    static GraphicsText aud;
    static GraphicsText cad;
    static GraphicsText cny;
    static GraphicsText eur;
    static GraphicsText inr;
    static GraphicsText jpy;
    static GraphicsText mxn;
    static GraphicsText rub;
    static GraphicsText sgd;
    static GraphicsText usd;
    private static Button button1;
    private static Button button2;
    static TextField textField1;
    static TextField textField2;
    static TextField textField3;
    static TextField textField4;
    static String currFrom, currTo, currAmount;
    static Color white = new Color(255, 255, 255);

    public static void CurrencyExchange() {
        canvas1 = new CanvasWindow("CURRENCY EXCHANGER", CANVAS_WIDTH, CANVAS_HEIGHT);
        canvas1.setBackground(white);
        canvas1.draw();
        textTitle = new GraphicsText("Currency Exchanger", 270,50);
        textTitle.setFontSize(50);
        canvas1.add(textTitle);
        canvas1.draw();

        textAmount = new GraphicsText("Amount to convert", 100, 100);
        canvas1.add(textAmount);
        textField1 = new TextField();
        textField1.setPosition(100, 120);
        canvas1.add(textField1);

        textFrom = new GraphicsText("Currency from (valid three-letter code)", 100, 200);
        canvas1.add(textFrom);
        textField2 = new TextField();
        textField2.setPosition(100, 220);
        canvas1.add(textField2);

        textResult = new GraphicsText("Converted Amount", CANVAS_WIDTH*0.1, 300);
        canvas1.add(textResult);
        // textField3 = new TextField();
        // textField3.setPosition(100, 320);
        // canvas1.add(textField3);
        canvas1.draw();

        textTo = new GraphicsText("Currency to (valid three-letter code)", 100, 400);
        canvas1.add(textTo);
        textField4 = new TextField();
        textField4.setPosition(100, 420);
        canvas1.add(textField4);
        canvas1.draw();

        button1 = new Button("Available Currencies");
        button1.setPosition(300, 500);
        canvas1.add(button1);
        canvas1.draw();

        button2 = new Button("Exchange");
        button2.setPosition(300, 550);
        canvas1.add(button2);
        canvas1.draw();

        button1.onClick(() -> showAvailableCurrencies());
        button2.onClick(() -> performExchange());
        canvas1.draw();
    }

    private static void showAvailableCurrencies() {
        canvas2 = new CanvasWindow("Available Currencies", 300, 300);
        currencies = new GraphicsText ("Available Currencies and current rates from USD", width * 0.1, 20);
        aud = new GraphicsText("Australian Dollar AUD " + JavaExchanger.returnRate("aud"), width * 0.1, 60);
        cad = new GraphicsText("Canadian Dollar CAD " + JavaExchanger.returnRate("cad"), width * 0.1, 80);
        cny = new GraphicsText("Chinese Yuan CNY " + JavaExchanger.returnRate("cny"), width * 0.1, 100);
        eur = new GraphicsText("Euro EUR " + JavaExchanger.returnRate("eur"), width * 0.1, 120);
        inr = new GraphicsText("Indian Rupee INR " + JavaExchanger.returnRate("inr"), width * 0.1, 140);
        jpy = new GraphicsText("Japanese Yen JPY " + JavaExchanger.returnRate("jpy"), width * 0.1, 160);
        mxn = new GraphicsText("Mexican Peso MXN " + JavaExchanger.returnRate("mxn"), width * 0.1, 180);
        rub = new GraphicsText("Russian Ruble RUB " + JavaExchanger.returnRate("rub"), width * 0.1, 200);
        sgd = new GraphicsText("Singaporean Dollar SGD " + JavaExchanger.returnRate("sgd"), width * 0.1, 220);
        usd = new GraphicsText("United States Dollar USD " + JavaExchanger.returnRate("usd"), width * 0.1, 240);
        canvas2.add(currencies);
        canvas2.add(aud);
        canvas2.add(cad);
        canvas2.add(cny);
        canvas2.add(eur);
        canvas2.add(inr);
        canvas2.add(jpy);
        canvas2.add(mxn);
        canvas2.add(rub);
        canvas2.add(sgd);
        canvas2.add(usd);
        canvas2.draw();
    }

    private static void performExchange() {
        currFrom = textField2.getText();
        currTo = textField4.getText();
        currAmount = textField1.getText();
        Double rate = JavaExchanger.returnRate(currFrom);
        if (rate == null) {
            System.out.println("Invalid currency code: " + currFrom + "");
            return;
        }

        double finalCurr = Calculations.Calculate(currAmount, currFrom, currTo);
        System.out.println(finalCurr);
        GraphicsText finalCurrTxt = new GraphicsText(finalCurr + "");
        finalCurrTxt.setPosition(100, 340);
        finalCurrTxt.setFillColor(Color.RED);
        canvas1.add(finalCurrTxt);
        canvas1.draw();
    }
}