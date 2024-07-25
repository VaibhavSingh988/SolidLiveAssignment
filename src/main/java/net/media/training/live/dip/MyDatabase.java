package net.media.training.live.dip;

import java.util.Hashtable;
import java.util.Map;

public class MyDatabase {
    private static Map<Integer, String> data = new Hashtable<>();
    private static int count = 0;

    public int write(String inputString) {
        data.put(++count, inputString);
        return count;
    }
}
