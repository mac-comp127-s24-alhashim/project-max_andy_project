import edu.macalester.graphics.*;
import org.jsoup.*;
import javax.swing.*;
import java.awt.Color;

public class CurrencyExchanger {

    private static Color beige = new Color(240, 240, 225);
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Currency Exchanger");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 900);
        frame.setBackground(beige);
        frame.setVisible(true);
    }
}
