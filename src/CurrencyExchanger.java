import java.awt.Color;
import java.awt.GradientPaint;

import edu.macalester.graphics.*;
// import org.jsoup.*;
// import javax.swing.*;
import edu.macalester.graphics.ui.Button;
import edu.macalester.graphics.ui.TextField;

// import java.awt.BorderLayout;
// import java.awt.Color;
// import java.awt.Dimension;
// import java.awt.Font;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class CurrencyExchanger {

//     JButton button;
//     static JTextField textField;

//     private static Color beige = new Color(240, 240, 225);
    
//     public static void main(String[] args) {
//         JFrame frame = new JFrame("Currency Exchanger");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(900, 900);

//         JLabel title = new JLabel("Currency Exchanger");
//         title.setFont(new Font("Arial", Font.BOLD, 30));
//         title.setHorizontalAlignment(JLabel.CENTER);
//         frame.add(title);

//         JTextField digitInput = new JTextField();
//         digitInput.setPreferredSize(new Dimension(50, 50));
//         digitInput.setFont(new Font("Arial", Font.PLAIN, 25));
//         digitInput.setForeground(new Color(0x000000));
//         // digitInput.setBackground(beige);
//         digitInput.setCaretColor(Color.black);
//         digitInput.setText("input amount of currency");

//         JTextField firstcurrInput = new JTextField();
//         firstcurrInput.setPreferredSize(new Dimension(50, 50));
//         firstcurrInput.setFont(new Font("Arial", Font.PLAIN, 25));
//         firstcurrInput.setForeground(new Color(0x000000));
//         firstcurrInput.setCaretColor(Color.black);
//         firstcurrInput.setText("input currency to exchange from in valid three-letter code");

//         JTextField seccurrInput = new JTextField();
//         seccurrInput.setPreferredSize(new Dimension(50, 50));
//         seccurrInput.setFont(new Font("Arial", Font.PLAIN, 25));
//         seccurrInput.setForeground(new Color(0x000000));
//         seccurrInput.setCaretColor(Color.black);
//         seccurrInput.setText("input currency to exchange to in valid three-letter code");

//         JPanel digitPanel = new JPanel(new BorderLayout());
//         digitPanel.setBackground(Color.WHITE);
//         digitPanel.setBorder(BorderFactory.createEmptyBorder(300, 100, 300, 100));
//         digitPanel.add(digitInput, BorderLayout.WEST);

//         JPanel firstcurrPanel = new JPanel(new BorderLayout());
//         firstcurrPanel.setBackground(Color.WHITE);
//         firstcurrPanel.setBorder(BorderFactory.createEmptyBorder(300, 100, 300, 100));
//         firstcurrPanel.add(firstcurrInput, BorderLayout.EAST);

//         JPanel seccurrPanel = new JPanel(new BorderLayout());
//         seccurrPanel.setBackground(Color.WHITE);
//         seccurrPanel.setBorder(BorderFactory.createEmptyBorder(300, 100, 300, 100));
//         seccurrPanel.add(seccurrInput, BorderLayout.EAST);

//         JButton button = new JButton("Available Currencies");
//         button.addActionListener((ActionListener) new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//             JFrame frame2 = new JFrame("Available Currencies");
//             frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//             frame2.setSize(200, 400);
//             frame2.setVisible(true);
//             }
//         });

//         BorderLayout layout = new BorderLayout();
//         frame.setLayout(layout);
//         frame.add(title, BorderLayout.NORTH);
//         frame.add(digitPanel, BorderLayout.WEST);
//         frame.add(firstcurrPanel, BorderLayout.WEST);
//         frame.add(seccurrPanel, BorderLayout.EAST);
//         frame.add(button, BorderLayout.SOUTH);

//         // frame.setBackground(beige);
//         frame.setVisible(true);

//     }
// }


public class CurrencyExchanger {
    private static int CANVAS_WIDTH = 1000;
    private static int CANVAS_HEIGHT = 800;
    private static int width = 200;
    private static int height = 400;
    private CanvasWindow canvas1, canvas2;
    GraphicsText textAmount, textFrom, textTo, textResult, textTitle, currencies, 
    aud, cad, cny, eur, inr, jpy, mxn, rub, sgd, usd;
    private Button button1;
    TextField textField1, textField2, textField3, textField4;
    Color beige = new Color(240, 240, 225);



    public CurrencyExchanger(){
        run();
    }
    private void run(){
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
    
    textFrom = new GraphicsText("Currency from (valid three-letter code)", CANVAS_WIDTH*0.6, 390);
    canvas1.add(textFrom);
    textField2 = new TextField();
    textField2.setPosition(CANVAS_WIDTH*0.6, 400);
    canvas1.add(textField2);

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

    button1 = new Button("Available Currencies");
    button1.setPosition(450,750);
    canvas1.add(button1);


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