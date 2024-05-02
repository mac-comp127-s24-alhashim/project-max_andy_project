import java.awt.Color;

import edu.macalester.graphics.*;
import edu.macalester.graphics.ui.Button;
import edu.macalester.graphics.ui.TextField;


public class CurrencyExchanger {
    private static int CANVAS_WIDTH = 1000;
    private static int CANVAS_HEIGHT = 800;
    private static int width = 200;
    private static int height = 400;
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
    static double currAmount;
    static String currFrom, currTo;
    static Color beige = new Color(240, 240, 225);



    public static void main(String[] args) {
        canvas1 = new CanvasWindow("CURRENCY EXCHANGER", CANVAS_WIDTH, CANVAS_HEIGHT);
        canvas1.setBackground(beige);
        canvas1.draw();
        textTitle = new GraphicsText("Currency Exchanger", 270,50);
        textTitle.setFontSize(50);
        canvas1.add(textTitle);

        textAmount = new GraphicsText("Amount to convert", CANVAS_WIDTH*0.3, 390);
        canvas1.add(textAmount);
        textField1 = new TextField();
        textField1.setPosition(CANVAS_WIDTH*0.3, 400);
        canvas1.add(textField1);
        currAmount = Double.parseDouble(textField1.getText());
        
        textFrom = new GraphicsText("Currency from (valid three-letter code)", CANVAS_WIDTH*0.6, 390);
        canvas1.add(textFrom);
        textField2 = new TextField();
        textField2.setPosition(CANVAS_WIDTH*0.6, 400);
        canvas1.add(textField2);
        currFrom = textField2.getText();

        textResult = new GraphicsText("Converted Amount", CANVAS_WIDTH*0.3, 490);
        canvas1.add(textResult);
        textField3 = new TextField();
        textField3.setPosition(CANVAS_WIDTH*0.6, 500);
        canvas1.add(textField3);

        textTo = new GraphicsText("Currency to (valid three-letter code)", CANVAS_WIDTH*0.6, 490);
        canvas1.add(textTo);
        textField4 = new TextField();
        textField4.setPosition(CANVAS_WIDTH*0.3, 500);   
        canvas1.add(textField4);
        currTo = textField4.getText();

        button1 = new Button("Available Currencies");
        button1.setPosition(425,750);
        canvas1.add(button1);

        button2 = new Button("Exchange");
        button2.setPosition(450, 600);
        canvas1.add(button2);

        button2.onClick(()-> {
            double finalCurr = Calculations.Calculate(currAmount, currFrom, currTo);
            GraphicsText finalCurrTxt = new GraphicsText(finalCurr+"", width, height);
            canvas1.add(finalCurrTxt);
        });


        button1.onClick(()-> {
            canvas2 = new CanvasWindow("Available Currncies", width, height);
            currencies = new GraphicsText ("Available Currencies", width * 0.1, 20);
            aud = new GraphicsText("Australian Dollar AUD", width * 0.1, 60);
            cad = new GraphicsText("Canadian Dollar CAD", width * 0.1, 80);
            cny = new GraphicsText("Chinese Yuan CNY", width * 0.1, 100);
            eur = new GraphicsText("Euro EUR", width * 0.1, 120);
            inr = new GraphicsText("Indian Rupee INR", width * 0.1, 140);
            jpy = new GraphicsText("Japanese Yen JPY", width * 0.1, 160);
            mxn = new GraphicsText("Mexican Peso MXN", width * 0.1, 180);
            rub = new GraphicsText("Russian Ruble RUB", width * 0.1, 200);
            sgd = new GraphicsText("Singaporean Dollar SGD", width * 0.1, 220);
            usd = new GraphicsText("United States Dollar USD", width * 0.1, 240);
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
        });
    }

}