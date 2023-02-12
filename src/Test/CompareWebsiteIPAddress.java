package Test;

import java.net.MalformedURLException;
import java.net.URL;

public class CompareWebsiteIPAddress {

    public static void main(String[] args) {

        try {
            System.out.println(new URL("https://so.energy").equals(new URL("https://34.89.69.151")));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
