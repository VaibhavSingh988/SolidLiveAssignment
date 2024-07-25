package net.media.training.live.dip;

import java.util.ArrayList;
import java.util.Base64;

public class EncodingModule {

    public ArrayList<String> encode(ArrayList<String> list) {
        ArrayList<String> encodedList = new ArrayList<>();
        for (String line : list) {
            String encodedLine = Base64.getEncoder().encodeToString(line.getBytes());
            encodedList.add(encodedLine);
        }
        return encodedList;
    }

    public String encode(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }
}
