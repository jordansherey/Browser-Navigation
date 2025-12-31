import java.awt.Desktop;
import java.net.URI;

public class OpenWebpage {
    public void launchBrowser(String url) {
        try{
            if(Desktop.isDesktopSupported()) {
                Desktop myDesktop = Desktop.getDesktop();
                myDesktop.browse(new URI(url));
            }
        } catch (Exception e) {
            System.out.println("Error opening browser");
            throw new RuntimeException(e);
        }
    }
}
