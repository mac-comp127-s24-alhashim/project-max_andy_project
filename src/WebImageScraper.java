// import org.jsoup.Jsoup;
// import org.jsoup.nodes.Document;
// import org.jsoup.nodes.Element;
// import org.jsoup.select.Elements;
// import javax.imageio.ImageIO;
// import javax.swing.*;
// import java.awt.*;
// import java.io.IOException;
// import java.net.URL;
// import java.util.ArrayList;
// import java.util.List;

// public class WebImageScraper extends JFrame {
//     private List<Image> images;

//     public WebImageScraper() {
//         images = new ArrayList<>();
//         setTitle("Web Image Scraper");
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setSize(800, 600);
//         setLocationRelativeTo(null);

//         // Create a panel to hold the images
//         JPanel imagePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
//         JScrollPane scrollPane = new JScrollPane(imagePanel);
//         scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//         scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//         add(scrollPane, BorderLayout.CENTER);

//         // Scraping images from the website
//         scrapeImages("https://www.google.com/search?q=usd+to+eur&rlz=1C5CHFA_enUS929US929&oq=usd+to+eur&gs_lcrp=EgZjaHJvbWUqDggAEEUYJxg7GIAEGIoFMg4IABBFGCcYOxiABBiKBTIICAEQRRgnGDsyDAgCEAAYFBiHAhiABDIHCAMQABiABDIHCAQQABiABDIGCAUQRRg8MgYIBhBFGDwyBggHEEUYPNIBCDY5MjdqMGo3qAIAsAIA&sourceid=chrome&ie=UTF-8");

//         // Display images on the GUI
//         displayImages(imagePanel);

//         setVisible(true);
//     }

//     private void scrapeImages(String url) {
//         try {
//             // Fetch HTML content using Jsoup
//             Document doc = Jsoup.connect(url).get();

//             // Extract image URLs
//             Elements imgElements = doc.select("img.Lr6dtd yf");
//             for (Element imgElement : imgElements) {
//                 String imgUrl = imgElement.absUrl("src");
//                 try {
//                     // Load the image from URL
//                     Image image = loadImage(imgUrl);
//                     images.add(image);
//                     System.out.println("0");
//                 } catch (IOException e) {
//                     // Handle image loading errors
//                     System.err.println("Failed to load image: " + imgUrl);
//                 }
//             }
//         } catch (IOException e) {
//             // Handle connection or parsing errors
//             e.printStackTrace();
//         }
//     }

//     private Image loadImage(String imageUrl) throws IOException {
//         // Load the image from the URL
//         return ImageIO.read(new URL(imageUrl));
//     }

//     private void displayImages(JPanel imagePanel) {
//         // Display images in the panel
//         for (Image image : images) {
//             JLabel imageLabel = new JLabel(new ImageIcon(image));
//             imagePanel.add(imageLabel);
//         }
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> new WebImageScraper());
//     }
// }
