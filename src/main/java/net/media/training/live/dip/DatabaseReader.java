package net.media.training.live.dip;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class DatabaseReader {
    public String readFromDB() {
        URL url;
        try {
            url = new URL("http", "myfirstappwith.appspot.com", "index.html");
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "";
        }
        try (InputStream in = url.openStream(); InputStreamReader reader = new InputStreamReader(in)) {
            StringBuilder inputString = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) {
                inputString.append((char) c);
            }
            return inputString.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
