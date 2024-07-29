package university.management.system;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Paytm {
    public Paytm() {
        openPaytmWebsite();
    }

    private void openPaytmWebsite() {
        try {
            Desktop.getDesktop().browse(new URI("https://paytm.com/online-payments"));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Paytm();
    }
}
